
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<c:forEach items="${users}" var="user">
  <p>id: ${user.idUser}</p>
  <p>name: ${user.name}</p>
  <br>
</c:forEach>

</body>
</html>
