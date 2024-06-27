<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %> 

    <div class="loginWrapper">
      <h2>로그인</h2>
      <form method="post" action="CareCoach?command=login" id="login-form" class="loginForm">
        <div class="inputWrapper">
          <input type="text" name="user_id" placeholder="아이디" />
          <input type="password" name="password" placeholder="비밀번호" />
        </div>
        <div class="loginNavigation">
          <a href="#">아이디 찾기</a>
          <a href="#">비밀번호 찾기</a>
          <a href="#">회원가입</a>
        </div>
        <input type="submit" value="로그인" />
      </form>
    </div>
    
<%@ include file="../footer.jsp" %>