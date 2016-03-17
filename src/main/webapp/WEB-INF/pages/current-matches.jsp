<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>List of Live Matches</title>
</head>
<body>
<h1>List of Live Matches</h1>
<p>Here you can see the list of the Live Matches being played all over the world.</p>
<table border="1px" cellpadding="0" cellspacing="0" >
<thead>
<tr>
<th width="10%">MATCH ID</th><th width="15%">TEAM A</th><th width="10%">TEAM B</th><th width="10%">ACTION</th>
</tr>
</thead>
<tbody>
<c:forEach var="currentmatches" items="${currentmatches}">
<tr>
	<td>${currentmatches.id}</td>
	<td>${currentmatches.t1}</td>
	<td>${currentmatches.t2}</td>
	<td>
	<a href="${pageContext.request.contextPath}/currentmatches/view/${currentmatches.id}.html">View Score</a><br/>
	</td>
</tr>
</c:forEach>
</tbody>
</table>

<p><a href="${pageContext.request.contextPath}/index.html">Home page</a></p>

</body>
</html>