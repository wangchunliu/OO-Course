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
					<div class="panel-heading">个人信息</div>
					<div class="panel-body">
					<form action="User_updateInfo" method="post">
						<table class="table table-striped table-hover table-bordered">
							<thead>
								<tr>
									<th>学号</th>
									<th>姓名</th>
									<th>性别</th>
									<th>年龄</th>
									<th>学院</th>
								</tr>
							</thead>
							<tbody>
								<s:iterator value="st" var="x">
    							<tr>
    							<td><input type="text" name="st.sid" readonly="readonly" value="<s:property value="#x.sid"/>"></td>
    							<td><input type="text" name="st.sname" value="<s:property value="#x.sname"/>"></td>
    							<td><input type="text" name="st.ssex" value="<s:property value="#x.ssex"/>"></td>
    							<td><input type="text" name="st.sage" value="<s:property value="#x.sage"/>"></td>
    							<td><input type="text" name="st.sdept" value="<s:property value="#x.sdept"/>"></td>
    							<tr>
    							</s:iterator>
							</tbody>
						</table>
						<button type="submit">提交</button>
					</form>
					</div>
				</div>
		</div>
	</div>
</body>
</html>
