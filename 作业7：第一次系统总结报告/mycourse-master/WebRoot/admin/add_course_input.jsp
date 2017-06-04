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
				<div class="panel-heading">添加课程</div>
					<div class="panel-body">
					<form action="Admin_addCourse">
						<table class="table table-striped table-hover table-bordered">
							<thead>
								<tr>
									<th>课程号</th>
									<th>课程名</th>
									
								</tr>
							</thead>
							<tbody>							
    							<tr>
    							<td><input type="text" name="c.cid"></td>
    							<td><input type="text" name="c.cname"></td>
    							<tr>
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
