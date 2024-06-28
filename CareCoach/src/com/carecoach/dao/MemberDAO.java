package com.carecoach.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.DBManager;

import com.carecoach.vo.MemberVO;

public class MemberDAO {
	
	private MemberDAO() {
		
	}
	
	private static MemberDAO instance = new MemberDAO();
	
	public static MemberDAO getInstance() {
		return instance;
	}
	
	public MemberVO getMember(String user_id) {
		
		System.out.println("MemberDAO -> getMember(user_id) | user_id: " + user_id);
		MemberVO memberVO = null;
		
		//DB 연결하기 위한 준비
		Connection conn = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    
	    //쿼리문 작성
	    String sql = "select * from users where user_id=?";
	    
	    //DB 연동
	    try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user_id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				memberVO = new MemberVO();
				memberVO.setUser_id(rs.getString("user_id"));
				memberVO.setPassword(rs.getString("password"));
				memberVO.setNickname(rs.getString("nickname"));
				memberVO.setEmail(rs.getString("email"));
				memberVO.setIs_deleted(rs.getInt("is_deleted"));
				memberVO.setIndate(rs.getTimestamp("indate"));
				memberVO.setProfile_image(rs.getString("profile_image"));
				memberVO.setBio(rs.getString("bio"));
				memberVO.setRoles(rs.getString("roles"));
			}
			System.out.println(memberVO.getUser_id());
			System.out.println(memberVO.getNickname());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return memberVO;
		
	}
	
	public MemberVO findMemberByEmailAndName(String email, String nickname) {
		System.out.println("MemberDAO -> findMemberByEmailAndName(email, name) | email: " + email + ", name: " + nickname);
		MemberVO memberVO = null;
		
		// DB 연결하기 위한 준비
		Connection conn = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    
	    // 쿼리문 작성
	    String sql = "SELECT * FROM users WHERE email = ? AND nickname = ?";
	    
	    // DB 연동
	    try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, email);
			pstmt.setString(2, nickname);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				memberVO = new MemberVO();
				memberVO.setUser_id(rs.getString("user_id"));
				memberVO.setPassword(rs.getString("password"));
				memberVO.setNickname(rs.getString("nickname"));
				memberVO.setEmail(rs.getString("email"));
				memberVO.setIs_deleted(rs.getInt("is_deleted"));
				memberVO.setIndate(rs.getTimestamp("indate"));
				memberVO.setProfile_image(rs.getString("profile_image"));
				memberVO.setBio(rs.getString("bio"));
				memberVO.setRoles(rs.getString("roles"));
			}
			System.out.println("Member found: " + (memberVO != null ? memberVO.getUser_id() : "No member found"));
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return memberVO;
	}
	

}