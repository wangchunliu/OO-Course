<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="main.jsp" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
	<title></title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<script type="text/javascript" src="js/jquery-2.1.3.js"></script>
	<script type="text/javascript" src="js/bootstrap.js"></script>

	<style type="text/css">
	@media (min-width: 768px){
		#page-main{
			margin-left: 250px;
		}
	}
	</style>

</head>
<body>
	<div id="page-main" style="backgroud:#104d74;">
		<div class="row">
			<div class="col-md-12">
				
					<div class="panel-heading">修改密码</div>
					<div class="panel-body">
						<form action="User_changePassword" method="post">
						<table class="table table-striped table-hover table-bordered">
							<tr>
								<td>请输入旧密码：</td>
								<td><input type="text" name="password.oldPassword"/></td>
							</tr>
							<tr>
								<td>请输入新密码：</td>
								<td><input type="text" name="password.newPassword"/></td>
							</tr>
						</table>
						<button type="submit">修改</button>
						</form>
					</div>
				</div>
			

		</div>
	</div>
</body>
</html>
