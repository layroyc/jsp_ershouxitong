<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>emplist</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style.css" />
	</head>
	<body>
		<div id="wrap">
			<div id="top_content"> 
				<div id="header">
					<div id="rightheader">
						<p>
							2020/11/17
							<br />
						</p>
					</div>
					<div id="topheader">
						<h1 id="title">
							<a href="#">main</a>
						</h1>
					</div>
					<div id="navigation">
					</div>
				</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						Welcome!
					</h1>
					
					<!--  按条件搜索表单 -->
		<form action="/jspjie1/Quan" method="post">
	<table class="table" style="text-align:center;">
			<tr class="table_header" >
					<td><input type="checkbox" name="ids" /></td>
					<td>ID</td>
					<td>Name</td>
					<td>Kind</td>
					<td>Money</td>
					<td>Faburen</td>
					<td>Phone</td>
					<td>Time</td>
					<td>Qingkuang</td>
			</tr>
			<c:forEach items="${se }" var="se">
			<tr class="row1">
					<td><input type="checkbox" name="ids" value="${se.id}" /></td>
					<td>${se.id}</td>
					<td>${se.name}</td>
					<td>${se.kind}</td>
					<td>${se.money}</td>
					<td>${se.phone}</td>
					<td>${se.time}</td>
					<td>${se.qingkuang}</td>
					<td>
						<a href="${pageContext.request.contextPath }/delectSe?id=${se.id}"><input type="button" value="删除"></a>&nbsp;
						<a href="${pageContext.request.contextPath }/oneSelvet?id=${se.id}"><input type="button" value="修改"></a>
					</td>
			</tr>
			</c:forEach>		
	</table>
</form>
	
	</div>
	</div>
	<div id="footer">
		<div id="footer_bg">
			三门峡职业技术学院@666.com
		</div>
		</div>
		</div>
	</body>
</html>
