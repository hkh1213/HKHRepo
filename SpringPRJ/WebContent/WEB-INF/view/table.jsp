<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%int i=0; %><%int j=0; %>

<table border="1"><%for(i=0;i<3;i++){ for(j=0;j<4;j++){%>
<th><%=i %>행<%=j %>열</th><%} %><tr><%} %>
</table>
</body>
</html>