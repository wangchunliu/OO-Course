<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="../css/bootstrap.css">
<script type="text/javascript" src="../js/jquery-2.1.3.js"></script>
<script type="text/javascript" src="../js/bootstrap.js"></script>

</head>


<body>

	<div class="container">
		<div class="row" style="margin-top:130px;">
			<div class="col-md-4 col-md-offset-4">
				<form action="Teacher_login" method="post" class="form-signin">
					<h2 class="form-signin-heading">教师请登录</h2>
					<label >教师号：</label> <input type="text"
						name="teacher.tid" value="1" id="inputEmail" class="form-control"
						placeholder="Email address" required autofocus> <label
						>密码：</label> <input type="password"
						name="teacher.tpassword" value="1" id="inputPassword"
						class="form-control" placeholder="Password" required>
					<div class="checkbox">
						<label> <input type="checkbox" value="remember-me">记住密码</label>
					</div>
					<button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
				</form>
			</div>
		</div>
	</div>
	<h3 align="center"> <a href="../index.jsp">→学生登陆</a> &nbsp;  &nbsp;  &nbsp;<a href="../admin/index.jsp">→管理员登陆</a> </h3>       <div align="center" >Copyright2016&copy;软一制作</div>
</body>
</html>
