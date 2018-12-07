<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<style type="text/css">
div p {
	font-size: 30px;
	text-align: center;
	color: blue;
}

div table {
	padding: 30px 0px;
	margin-left: 25px;
	width: 96%;
}

div table tr, #print div {
	height: 28px;
	line-height: 28px;
}

div table tr td {
	border: 1px solid green;
}

body {
	margin: 0px;
	padding: 0px;
	width: 99.5%;
}

#print {
	width: 98.5%;
}

#print div {
	margin-top: 10px;
	margin-bottom: 10px;
}
</style>
</head>
<body>

	<div id="print">
		<table>
			<tr>
				<th>序号</th>
				<th>数据</th>
			</tr>
			<c:forEach items="${list }" var="listData" varStatus="i">
				<tr>
					<td><c:out value="${i.index+1}"></c:out></td>
					<td><c:out value="${listData}"></c:out></td>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>