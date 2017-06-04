<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
	<title></title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="../css/bootstrap.css">
	<script type="text/javascript" src="../js/jquery-2.1.3.js"></script>
	<script type="text/javascript" src="../js/bootstrap.js"></script>

	<style type="text/css">
	@media (min-width: 768px){
		#letf-nav{
			width: 250px;
			margin-top: 72px;
			position: absolute;
			height: 800px;
			background-color: #eee;
		}
		#my-search{
			margin-top: 10px;
		}
		#page-main{
			margin-left: 250px;
		}
	}
	</style>

</head>
<body>
	<nav class="navbar navbar-default navbar-static-top">

		<div class="navbar-header">
			<a href="#" class="navbar-brand">后台信息管理</a>
		</div>

		<ul class="nav navbar-nav navbar-right" style="margin-right:25px;">
			<li><a href="#">欢迎，<s:property value="#application.admin.username"/></a></li>
			<li><a href="Admin_logout"><span class="glyphicon glyphicon-off"></span>&nbsp;注销</a></li>
		</ul>

		<div id="letf-nav">
			<ul class="nav">
				<li>
					<div class="input-group">
						<input type="text" class="form-control">
						<span class="input-group-btn" id="my-search">
							<button type="button" class="btn btn-default">
								<span class="glyphicon glyphicon-search"></span>
							</button>
						</span>
					</div>
				</li>
				<li>
					<a href="#sub1" data-toggle="collapse">查看学生<span class="glyphicon glyphicon-chevron-right pull-right"></span></a>
					<ul id="sub1" class="nav collapse">
						<li><a href="Admin_listStudent"><span class="glyphicon glyphicon-info-sign"></span>&nbsp;查看所有学生</a></li>
						<li><a href="add_student_input.jsp"><span class="glyphicon glyphicon-info-sign"></span>&nbsp;添加学生</a></li>
					</ul>
				</li>
				<li>
					<a href="#sub2" data-toggle="collapse">查看课程<span class="glyphicon glyphicon-chevron-right pull-right"></span></a>
					<ul id="sub2" class="nav collapse">
						<li><a href="Admin_listCourse"><span class="glyphicon glyphicon-user"></span>&nbsp;查看所有课程</a></li>
						<li><a href="add_course_input.jsp"><span class="glyphicon glyphicon-info-sign"></span>&nbsp;添加课程</a></li>
					</ul>
				</li>
				<li>
					<a href="#sub3" data-toggle="collapse">查看选课<span class="glyphicon glyphicon-chevron-right pull-right"></span></a>
					<ul id="sub3" class="nav collapse">
						<li><a href="Admin_listInfo"><span class="glyphicon glyphicon-user"></span>&nbsp;查看选课信息</a></li>
					</ul>
				</li>
				<li>
					<a href="#sub4" data-toggle="collapse">查看教师<span class="glyphicon glyphicon-chevron-right pull-right"></span></a>
					<ul id="sub4" class="nav collapse">
						<li><a href="Admin_listTeacher"><span class="glyphicon glyphicon-user"></span>&nbsp;查看所有教师</a></li>
					</ul>
				</li>
			</ul>
		</div>
	</nav>
</body>
</html>
