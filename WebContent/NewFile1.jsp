<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src = "sa/jQuery2.1.1.js"></script>
<script type="text/javascript" src = "sa/del.js"></script>
</head>
<body>
	<div>
		<form method="post" action="ServletService">
		勘查员:<input type ="text" name = "name">
		<input type = "submit" value = "查询">
		</form>
		<table border = "1px">
			<tr>
				<td>勘察标识</td>
				<td>勘查意见</td>
				<td>勘查员</td>
				<td>勘查日期</td>
				<td>有无违约用电行为</td>
				<td>违约用电行为描述</td>
				<td>勘查备注</td>
				<td>申请编号</td>
				<td>重要性等级</td>
				<td>重要用户档案描述</td>
			</tr>
			<c:forEach items = "${sessionScope.list}" var = "a">
			<tr>
				<td class = "id">${a.chk_id}</td>
				<td>${a.chk_option}</td>
				<td>${a.chk_name}</td>
				<td>${a.chk_date}</td>
				<td>${a.violat_flag}</td>
				<td>${a.violate_cesc}</td>
				<td>${a.chk_remark}</td>
				<td>${a.app_no}</td>
				<td>${a.prio_code}</td>
				<td>${a.keycons_file}</td>
				<td></td>
				<td><a href ="#" class = "delBtn">删除</a>&nbsp;&nbsp;&nbsp;<a href = "selectByIdServlet?uId=${a.chk_id }">修改</a></td>
			</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>