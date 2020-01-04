<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改考勤记录信息</title>
</head>
<body>
	<form action="alter" method="post">
		<table>
			<tr>
				<th colspan="2">考勤记录信息表</th>
			</tr>
			<tr>
				<td>姓名</td>
				<td><input type="text" name="EMPNAME" value="${yu.EMPNAME }"></td>
				<td>所属部门</td>
				<td><input type="text" name="DEPT" value="${yu.DEPT }"></td>
				<td>考勤日期</td>
				<td><input type="text" name="CHKDATE" value="${yu.CHKDATE }">日期格式:yyyy-mm-dd</td>
				<td>考勤状态 <select name="STATUS">
						<c:choose>
							<c:when test="${yu.STATUS ==1}">
								<option value="1" selected="selected">正常</option>
								<option value="2">迟到</option>
								<option value="3">早退</option>
								<option value="4">休假</option>
								<option value="5">外出</option>
							</c:when>
							<c:when test="${yu.STATUS ==2}">
								<option value="1">正常</option>
								<option value="2" selected="selected">迟到</option>
								<option value="3">早退</option>
								<option value="4">休假</option>
								<option value="5">外出</option>
							</c:when>
							<c:when test="${yu.STATUS ==3}">
								<option value="1">正常</option>
								<option value="2">迟到</option>
								<option value="3" selected="selected">早退</option>
								<option value="4">休假</option>
								<option value="5">外出</option>
							</c:when>
							<c:when test="${yu.STATUS ==4}">
								<option value="1">正常</option>
								<option value="2">迟到</option>
								<option value="3">早退</option>
								<option value="4" selected="selected">休假</option>
								<option value="5">外出</option>
							</c:when>
							<c:when test="${yu.STATUS ==5}">
								<option value="1">正常</option>
								<option value="2">迟到</option>
								<option value="3">早退</option>
								<option value="4">休假</option>
								<option value="5" selected="selected">外出</option>
							</c:when>
						</c:choose>

				</select>
				</td>
				<td><input type="submit" value="保存"></td>
				<td><input type="reset" name="rest" id="rest" value="重置"></td>
			</tr>
		</table>
	</form>
</body>
</html>