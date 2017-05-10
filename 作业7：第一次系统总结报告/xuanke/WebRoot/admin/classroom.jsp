
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="base.jsp"%>
<html>
<head>
    <title></title>
</head>
<body>

<div class="container">
  <h5><b>当前位置</b>：课程管理 > 课程管理</h5>
  <hr>
  <div>
    <% AdminDAO adminDao = new AdminDAO();%>
    <%=adminDao.getClassroom()%>
  </div>
</div>


</body>
</html>
