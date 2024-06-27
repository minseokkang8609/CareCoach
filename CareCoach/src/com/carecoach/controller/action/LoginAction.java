package com.carecoach.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carecoach.vo.MemberVO;
import com.carecoach.dao.MemberDAO;


public class LoginAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("LoginAction -> execute()");
		
		String user_id = request.getParameter("user_id");
		String password = request.getParameter("password");
		
		System.out.println("user_id: " + user_id);
		System.out.println("password: " + password);
		
		//MemberDAO를 통한 데이터베이스 연동
		MemberDAO memberDAO = MemberDAO.getInstance();
		
		//MemberVO를 바인딩
		MemberVO memberVO = memberDAO.getMember(user_id);
		
		//페이지 이동
		
	}
	
	

}