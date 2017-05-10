<%@ page import="lib.Dao.StudentDAO" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="base.jsp"%>
<html>
<head>
    <title></title>
</head>
<body>

  <div class="container">
    <h5><b>当前位置</b>：公告</h5>
    <hr>
    <% StudentDAO studentDAO = new StudentDAO();%>
    <%=studentDAO.getNotes()%>
  </div>

</body>
</html>
