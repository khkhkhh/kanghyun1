<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
request.setCharacterEncoding("UTF-8");
%>
<c:set var="contextpath" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상단부</title>
</head>
<body>
	<table border=0 width="100%">
		<tr>
			<td><a href="${contextpath}/main.do"> <img
					src="${contextpath}/resources/image/dog-1.jpg" /></a></td>
			<td>
				<h1>
					<font size=30>스프링실습 홈페이지~!</font>
				</h1>
			</td>
			<td>
			<!-- <a href="#"><h3>로그인</h3></a>  -->
			<c:choose>
					<c:when test="${isLogOn==true&&member!= null }">
						<h3>환영합니다. ${member.name}님~!</h3>
						<a href="${contextpath}/member/logout.do"><h3>로그아웃</h3></a>
					</c:when>
					<c:otherwise>
						<a href="${contextpath}/member/loginForm.do"><h3>로그인</h3></a>
					</c:otherwise>
				</c:choose></td>
		</tr>
	</table>
</body>
</html>