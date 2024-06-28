package com.carecoach.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.carecoach.dao.MemberDAO;
import com.carecoach.vo.MemberVO;

public class FindIdResultAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("FindIdResultAction -> execute()");

        String url = "member/findIdResult.jsp";
        
        String email = request.getParameter("email");
        String nickname = request.getParameter("nickname");
        
        // 데이터베이스에서 이메일과 이름으로 회원 정보 조회
        MemberDAO memberDAO = MemberDAO.getInstance();
        MemberVO memberVO = memberDAO.findMemberByEmailAndName(email, nickname);
        
        HttpSession session = request.getSession();
        
        if (memberVO != null) {
            // 회원 정보를 찾은 경우, 아이디를 JSP에 전달
            //request.setAttribute("foundUserId", memberVO.getUser_id());
        	session.setAttribute("loginUser", memberVO);
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
