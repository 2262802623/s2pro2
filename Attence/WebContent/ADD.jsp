<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加考勤记录信息</title>
</head>
<body>
	<form action="add" method="post">
			<table>
			<tr>
				<th colspan="2">考勤记录信息表</th>
			</tr>
			<tr>
				<td>姓名</td><td><input type="text" name="EMPNAME"></td>
				<td>所属部门</td><td><input type="text" name="DEPT"></td>
				<td>考勤日期</td><td><input type="text" name="CHKDATE">日期格式:yyyy-mm-dd</td>
				<td>考勤状态</td>
				<td>
				<select name = "STATUS">
					<option value="0">请选择考勤类型</option>
					<option value="1">正常</option>
					<option value="2">迟到</option>
					<option value="3">早退</option>
					<option value="4">休假</option>
					<option value="5">外出</option>
				</select>
				</td>
				<td><input type="submit" value="登记"></td><td><input input type="reset" name="rest" id="rest" value="重置"></td>
			</tr>
		</table>
	</form>
</body>
</html>