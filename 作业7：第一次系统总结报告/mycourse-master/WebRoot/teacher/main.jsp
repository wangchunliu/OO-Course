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

		<!-- 顶部导航左侧标志 -->

		<div class="navbar-header">

			<a href="#" class="navbar-brand">教师后台管理</a>

		</div>

		

		<!-- 顶部导航右侧注销，欢迎 -->

		<ul class="nav navbar-nav navbar-right" style="margin-right:25px;">

			<li><a href="#">欢迎，<s:property value="#application.tname"/></a></li>

			<li><a href="Teacher_logout"><span class="glyphicon glyphicon-off"></span>&nbsp;注销</a></li>

		</ul>

		

		<div id="letf-nav">

			<ul class="nav">

				<!-- 搜索框 -->

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

				<!-- 课程管理 -->

				<li>

					<a href="#sub1" data-toggle="collapse">查看学生选课<span class="glyphicon glyphicon-chevron-right pull-right"></span></a>

					<ul id="sub1" class="nav collapse">

						<s:iterator value="#session.cnames" var="x">

						<li><a href="Teacher_listStudent?cname=<s:property value="x"/>"><span class="glyphicon glyphicon-info-sign"></span>&nbsp;<s:property value="x"/></a></li>

						</s:iterator>

					</ul>

				</li>

				

			</ul>

		</div>

		

	</nav>

	<div style="margin-left:500px;">


	</div>

</body>

</html>