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
<div class="reg_back">
        <div class="reg_center">
            <div class="reg_form">
          <div align="center"> <h2>二手信息发布系统-注册页</h2> </div><br>
                <form action="/jsp/regist" method="post">
                    <table align="center">
                        <tr>
                            <td class="td_left"><label for="username">账号：</label></td>
                            <td class="td_right"><input type="text" name="user" placeholder="请输入用户名"
                                                        id="username"></td>
                        </tr>
                        <tr>
                            <td class="td_left"><label for="password">密码:</label></td>
                            <td class="td_right"><input type="password" name="pwd" placeholder="请输入密码"
                                                        id="password"></td>
                        </tr>
                        <tr>
                            <td class="td_left"><label for="Telphone">手机号:</label></td>
                            <td class="td_right"><input type="text" name="phone" placeholder="请输入您的手机号"
                                                        id="Telphone"></td>
                        </tr>
                        <tr>
                            <td colspan="2" align="center"><input type="submit" value="注册" id="btn_sub"></td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
        <div class="reg_right" align="center">
            <p>已有账号?<a href="login.jsp">立即登录</a></p>
        </div>
    </div>
</body>
</html>