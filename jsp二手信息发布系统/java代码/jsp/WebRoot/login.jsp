<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/register.css">
<title>Insert title here</title>

</head>
<body>
	${info}

	<div class="reg_back">
		<div class="reg_left"></div>
		<div align="center"> <h2>二手信息发布系统-登录页</h2> </div><br>
			<div class="reg_form" align="center">
				<form action="/jsp/DengLu" method="post">
					<table>
						<tr>
							<td class="td_left"><label for="username">账号：</label></td>
							<td class="td_right"><input type="text" name="user"
								placeholder="请输入账号" id="username"></td>
						</tr>
						<tr>
							<td class="td_left"><label for="password">密码：</label></td>
							<td class="td_right"><input type="password" name="pwd"
								placeholder="请输入密码" id="password"></td>
						</tr>

						<tr>
							<td colspan="2" align="center"><input type="submit"
								value="登录" id="btn_sub"></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>
</body>
</html>