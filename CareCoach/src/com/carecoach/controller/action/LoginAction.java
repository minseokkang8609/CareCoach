package com.carecoach.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carecoach.dao.MemberDAO;
import com.carecoach.vo.MemberVO;

public class LoginAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LoginAction -> execute()");


		String url = "member/login_fail.jsp";


		String user_id = request.getParameter("user_id");
		String password = request.getParameter("password");


		System.out.println("user_id: " + user_id);
		System.out.println("password: " + password);

		// 구현 중 
		if (user_id == null || user_id.trim().isEmpty() || password == null || password.trim().isEmpty()) {

			request.setAttribute("message", "아이디와 비밀번호를 모두 입력해주세요.");

			request.getRequestDispatcher(url).forward(request, response);
			return;
		}


		MemberDAO memberDAO = MemberDAO.getInstance();
		MemberVO memberVO = memberDAO.getMember(user_id);


		HttpSession session = request.getSession();

		if (memberVO != null) {
			System.out.println("memberVO.user_id: " + memberVO.getUser_id());
			System.out.println("memberVO.password: " + memberVO.getPassword());

			if (memberVO.getPassword().equals(password)) {
				session.setAttribute("loginUser", memberVO);
				url = "CareCoach?command=index"; 
			}
		}


		request.getRequestDispatcher(url).forward(request, response);
	}
}
