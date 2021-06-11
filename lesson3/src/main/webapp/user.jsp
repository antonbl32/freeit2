<%--
  Created by IntelliJ IDEA.
  User: СУРГ
  Date: 11.06.2021
  Time: 9:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello <%=request.getParameter("name") %></title>
</head>
<body>
    <div class="wrap-input100 validate-input m-b-16">
        <p>Your name is <%=request.getParameter("name") %></p>
    </div>
</body>
</html>
