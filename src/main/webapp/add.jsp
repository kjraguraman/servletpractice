<%--
  Created by IntelliJ IDEA.
  User: 91638
  Date: 27-Jan-22
  Time: 1:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ page import="java.util.*,java.lang.*" %>--%>
<%--<%@ include file="header.jsp"%>--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Addition</title>
</head>
<body>
<h1>JSP Practice</h1>
<%
int num1= Integer.parseInt(request.getParameter("n1"));
int num2= Integer.parseInt(request.getParameter("n2"));
int sum=num1+num2;
//RequestDispatcher rdp=request.getRequestDispatcher("header.jsp");
//request.setAttribute("sum",sum);
//rdp.forward(request,response);
%>
<%= sum%>
<c:out value="${'end'}"/>
<%--<c:import url="https://www.google.com/"/>--%>
</body>
</html>
