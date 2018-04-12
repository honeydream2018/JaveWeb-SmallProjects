<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>列出所有书籍</title>
	</head>
	<body style="text-align: center;vertical-align:middle;">
		<h1>书籍列表</h1>
		<table width="80%" border="1" align="center">
			<tr style="background-color:gray">
				<td>序号</td>
				<td>编号</td>
				<td>书名</td>
				<td>作者</td>
				<td>价格</td>
				<td>描述</td>
				<td>操作</td>
			</tr>
			<!-- Map.Entry key=bookid  value=book -->
			<c:forEach items="${books}" var="me" varStatus="stat">
				<tr style="background-color: ${stat.count%2==0?'green':'red'}">
				<td>${stat.count }</td>
				<td>${me.key}</td>
				<td>${me.value.name}</td>
				<td>${me.value.author}</td>
				<td>￥${me.value.price}元</td>
				<td>${me.value.descrption }</td>
				<td>
				<!-- ${pageContext.request.contextPath}”的作用是取出部署的应用程序名 -->
					<a href="/day9/BuyServlet?bookid=${me.key}">购买</a>
				</td>
			</tr>
			</c:forEach>
		</table>
	</body>
</html>