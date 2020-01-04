<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>考勤记录信息表</title>
</head>
<body>
	<h3>考勤记录信息表</h3>
		<table border="1px" cellspacing = "0px" width = "900px">
			<tr>
				<th>员工姓名</th>
				<th>所属部门</th>
				<th>考勤日期</th>
				<th>考勤状态</th>
				<th colspan="2" align="center">操作</th>
			</tr>
			<c:forEach items="${requestScope.list }" var="ui">
				<tr>
					<td>${ui.EMPNAME }</td>
					<td>${ui.DEPT }</td>
					<td>${ui.CHKDATE }</td>
						<c:choose>
						<c:when test="${ui.STATUS ==1}">
							<td>正常</td>
						</c:when>
						<c:when test="${ui.STATUS ==2}">
							<td>迟到</td>
						</c:when>
						<c:when test="${ui.STATUS ==3}">
							<td>早退</td>
						</c:when>
						<c:when test="${ui.STATUS ==4}">
							<td>休假</td>
						</c:when>
						<c:when test="${ui.STATUS ==5}">
							<td>外出</td>
						</c:when>
					</c:choose>
					<td><a href="dele?id=${ui.ID }">删除</a></td>
					<td><a href="acquire?id=${ui.ID }">修改</a></td>
				</tr>
			</c:forEach>
		</table>
		<a href="add?id=${ui.ID }">考勤登记</a>
</body>
</html>