<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="poly.dto.EMPDTO" %>
 <%@page import="java.util.List" %>
 <%@page import="static poly.util.CmmUtil.nvl" %>
 
 <%
 	List<EMPDTO> rList=(List<EMPDTO>)request.getAttribute("rList");
 
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아몬드</title>
</head>
<body>
<table border="1">
<th>EMPNO</th>
<th>ENAME</th>
<th>JOB</th>
<th>MGR</th>
<th>HIREDATE</th>
<th>SAL</th>
<th>COMM</th>
<th>DEPTNO</th>

<% for(EMPDTO e:rList){%>
<tr>
<td>
<%=e.getEmpno() %></td>
<td>
<%=e.getEname() %></td>
<td>
<%=e.getJob() %></td>
<td>
<%=e.getMgr() %></td>
<td>
<%=e.getHiredate() %></td>
<td>
<%=e.getSal() %></td>
<td>
<%if(e.getComm()!=null)%><%=e.getComm() %></td>
<td>
<%=e.getEmpno() %></td>
</tr>
 <%} %>
</table>
</body>
</html>