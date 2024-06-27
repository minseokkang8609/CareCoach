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
		System.out.println("test");
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
	    String sql = "select * from Users where user_id=?";
	    
	    //DB 연동
	    try {
			conn = DBManager.getConnection();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		
		return memberVO;
		
	}
	
	
	

}
