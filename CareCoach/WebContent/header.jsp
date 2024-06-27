<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>CareCoach</title>
    <link rel="stylesheet" href="css/careCoach.css" />
    <link rel="stylesheet" href="css/login.css" />
  </head>
  <body>
      <div class="container">
        <div class="logo">
          <a href="CareCoach?command=index">
            <img src="images/CareCoach-logo.png" alt="CareCoach" />
          </a>
        </div>
        <nav>
          <ul class="nav-links">
            <li>
              <a href="#">About Us</a>
              <ul class="dropdown">
                <li><a href="#">test</a></li>
                <li><a href="#">test</a></li>
                <li><a href="#">test</a></li>
              </ul>
            </li>
            <li>
              <a href="#">Community</a>
              <ul class="dropdown">
                <li><a href="#">test</a></li>
                <li><a href="#">test</a></li>
                <li><a href="#">test</a></li>
              </ul>
            </li>
            <li>
              <a href="#">QnA</a>
              <ul class="dropdown">
                <li><a href="#">test</a></li>
                <li><a href="#">test</a></li>
                <li><a href="#">test</a></li>
              </ul>
            </li>
            <li>
              <a href="#">CareCoach</a>
              <ul class="dropdown">
                <li><a href="#">test</a></li>
                <li><a href="#">test</a></li>
                <li><a href="#">test</a></li>
              </ul>
            </li>
          </ul>
        </nav>

        <div class="auth-links">
          <c:choose>
            <c:when test="${empty sessionScope.loginUser}">
              <li>
                <a href="CareCoach?command=login_form">Login(CUSTOMER</a>
                <a href="CareCoach?command=admin_login_form">| ADMIN)</a>
              </li>
              <li class="contour">|</li>
              <li><a href="CareCoach?command=contract">Join</a></li>
            </c:when>
            <c:otherwise>
              <li>
                ${sessionScope.loginUser.name}(${sessionScope.loginUser.id})
              </li>
              <li><a href="CareCoach?command=logout">LOGOUT</a></li>
            </c:otherwise>
          </c:choose>
        </div>
      </div>
    </header>
  </body>
</html>
