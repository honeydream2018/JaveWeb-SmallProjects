<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>列出购物车中的购物项</title>
	</head>
	
	<body style="text-align: center;">
	<c:if test="${!empty sessionScope.shopcart.map}">
	<h1>您购买了以下商品</h1>
	<table width="80%" border="1" align="center">
			<tr style="background-color:gray">
				<td>序号</td>
				<td>书名</td>
				<td>作者</td>
				<td>单价</td>
				<td>数量</td>
				<td>小计</td>
				<td>操作</td>
			</tr>
			<!-- 
			EL表达式获取对象属性的原理是这样的：
				以表达式${user.name}为例
				EL表达式会根据name去User类里寻找这个name的get方法，
				此时会自动把name首字母大写并加上get前缀，一旦找到与之匹配的方法，
				El表达式就会认为这就是要访问的属性，并返回属性的值。
			 -->
			<!-- Map.Entry key=bookid  value=CartItem -->
			<c:forEach items="${sessionScope.shopcart.map}" var="me" varStatus="stat">
				<tr style="background-color: ${stat.count%2==0?'green':'red'}">
				<td>${stat.count }</td>
				<td>${me.value.book.name}</td>
				<td>${me.value.book.author}</td>
				<td>￥${me.value.book.price}元</td>
				<td>
					<input type="text" name="num" id="num" size="5" value="${me.value.num}" onblur="changeNum(this,'${me.value.book.id}','${me.value.num}')">
				
				本</td>
				<td>￥${me.value.price}元</td>
				<td>
				<!-- ${pageContext.request.contextPath}”的作用是取出部署的应用程序名 
					/day9/deleteItemServlet?bookid=${me.value.book.id}
				-->
					<a href="javascript:toDelete('${me.value.book.id}')">删除</a>
				</td>
			</tr>
			</c:forEach>
			<tr >
				<td colspan="2">
					<a href="javascript:clear()">清空购物车</a>
				</td>
				<td colspan="2">总数量：${sessionScope.shopcart.num} 本</td>
				
				<td colspan="2">合计：￥${sessionScope.shopcart.price} 元</td>
				
				<td >
					<a href="/day9/showallbooksServlet">返回</a>
				</td>
			</tr>
		</table>
		<script type="text/javascript">
			function toDelete(bookid){
				var sure=window.confirm("确认要删除该项吗？");
				if(sure){
					//要删除
					window.location.href="/day9/deleteItemServlet?bookid="+bookid;
				}
				
			}
			function clear(){
				var sure=window.confirm("确认要删除购物车吗？");
				if(sure){
					window.location.href="/day9/clearItemServlet";
				}
				
			}
			function changeNum(inputObj,bookid,oldNum){
				var sure=window.confirm("确认要改为"+inputObj.value+"吗？");
				if(sure){
					//提交
					window.location.href="/day9/changeNumServlet?bookid="+bookid+"&num="+inputObj.value;
				}
				else{
					//改为原来的数量num
					inputObj.value=oldNum;
				}
			}
			
		</script>	
		</c:if>
		<c:if test="${empty sessionScope.shopcart.map}">
			<h2>您没有购买任何产品</h2>
		</c:if>
	</body>
</html>