<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int n;
int fact=1;
n=Integer.parseInt(request.getParameter("t1"));
    
    for(int i=1;i<=n;i++)
        {
        fact=fact*i;
        }
 
out.println("fact= "+fact);

%>
</body>
</html>