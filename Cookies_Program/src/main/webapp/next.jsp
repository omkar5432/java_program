<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String name;
name=request.getParameter("t1");

Cookie c1 = new Cookie("username",name);

response.addCookie(c1);

Cookie c[] = request.getCookies();
for(int i=0;i<c.length;i++)
{
out.println(c[i].getName());
out.println(c[i].getValue															());
}
%>
</body>
</html>