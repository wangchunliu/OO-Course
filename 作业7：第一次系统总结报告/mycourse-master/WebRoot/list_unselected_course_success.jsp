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
<script type="text/javascript">
$(document).ready(function(){


	$('#submit').bind('click', haha);


	function haha(){
	var size = $("[name = cids]:checkbox").size();
	for (var i = 0; i < size; i++) {

		if ($("[name = cids]:checkbox").eq(i).prop("checked") == true) {
			$("[name = tids]:checkbox").eq(i).attr("checked","true");
		}
	}
	}
});
</script>
</head>
<body>
	<div id="page-main" style="backgroud:#104d74;">
		<div class="row">
			<div class="col-md-12">
					<div class="panel-heading">课程信息</div>
					<div class="panel-body">
						<form action="User_selectCourse" method="post">
						<table class="table table-striped table-hover table-bordered">
							<thead>
								<tr>
									<th>课程号</th>
									<th>课程名</th>
									<th>教师号</th>
									<th>教师姓名</th>
									<th>选课</th>
								</tr>
							</thead>
							<tbody>
								<s:iterator value="courses" var="x">
    							<tr>
    							<td><s:property value="#x.cid"/></td>
    							<td><s:property value="#x.cname"/></td>
    							<td style="display:none"><input type="checkbox" name="tids" value="<s:property value="#x.tid"/>"></td>
    							<td><s:property value="#x.tid"/></td>
    							<td><s:property value="#x.tname"/></td>
    							<td><input type="checkbox" name="cids" value="<s:property value="#x.cid"/>"></td>
    							<tr>
    							</s:iterator>
							</tbody>
						</table>
						<button type="submit" id="submit">提交</button>
						</form>
					</div>
				</div>

		</div>
	</div>
</body>
</html>
