<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="main.jsp" %>
<%@ taglib prefix="s" uri="/struts-tags" %>



<!DOCTYPE html>

<html>

<head>

</head>

<body>

	<div id="page-main" style="backgroud:#104d74;">

		<div class="row">

			<div class="col-md-12">

				

					<div class="panel-heading">所有学生信息</div>

					<div class="panel-body">

						<table class="table table-striped table-hover table-bordered">

							<thead>

								<tr>

									<th>学号</th>

									<th>姓名</th>

									<th>邮箱</th>

									<th>年龄</th>

									<th>学院</th>

								</tr>

							</thead>

							<tbody>

								<s:iterator value="stList" var="xxx">

    							<tr>

    							<td><s:property value="#xxx.sid"/></td>

    							<td><s:property value="#xxx.sname"/></td>

    							<td><s:property value="#xxx.ssex"/></td>

    							<td><s:property value="#xxx.sage"/></td>

    							<td><s:property value="#xxx.sdept"/></td>

    							<tr>

    							</s:iterator>

							</tbody>

						</table>

						

					</div>

				</div>

		</div>

	</div>

</body>

</html>