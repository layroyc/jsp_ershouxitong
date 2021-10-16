<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link rel="stylesheet" href="css/register.css">
<title>注册界面</title>
</head>
<body>
 ${info} 
<!-- <form action="register" method="post">
	<input type="text" name="user">用户名<br>
	<input type="password" name="pwd">密码<br>
	<input type="text" name="phone">手机号<br>
	<input type="submit" value="注册">
	<input type="button" value="登录">
</form>
 -->
<div class="reg_back">
        <div class="reg_left">
            <p>新用户注册</p>
            <p>USER REGISTER</p>
        </div>
        <div class="reg_center">
            <div class="reg_form">
                <form action="register" method="post">
                    <table>
                        <tr>
                            <td class="td_left"><label for="username">用户名</label></td>
                            <td class="td_right"><input type="text" name="user" placeholder="请输入用户名"
                                                        id="username"></td>
                        </tr>
                        <tr>
                            <td class="td_left"><label for="password">密码</label></td>
                            <td class="td_right"><input type="password" name="pwd" placeholder="请输入密码"
                                                        id="password"></td>
                        </tr>
                        <tr>
                            <td class="td_left"><label for="Email">Email</label></td>
                            <td class="td_right"><input type="email" name="email" placeholder="请输入Email" id="Email">
                            </td>
                        </tr>
                        <tr>
                            <td class="td_left"><label for="rename">姓名</label></td>
                            <td class="td_right"><input type="text" name="rename" placeholder="请输入真实姓名" id="rename">
                            </td>
                        </tr>
                        <tr>
                            <td class="td_left"><label for="Telphone">手机号</label></td>
                            <td class="td_right"><input type="text" name="phone" placeholder="请输入您的手机号"
                                                        id="Telphone"></td>
                        </tr>
                        <tr>
                            <td class="td_left"><label>性别</label></td>
                            <td class="td_right"><input type="radio" name="gender" value="male" checked> 男
                                <input type="radio" name="gender" value="female"> 女
                            </td>
                        </tr>
                        <tr>
                            <td class="td_left"><label for="Birthday">出生日期</label></td>
                            <td class="td_right"><input type="date" name="birthday" id="Birthday"></td>
                        </tr>
                       
                        <tr>
                            <td colspan="2" align="center"><input type="submit" value="注册" id="btn_sub"></td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
        <div class="reg_right">
            <p>已有账号?<a href="login.jsp">立即登录</a></p>
        </div>
    </div>
</body>
</html>