<%--
  Created by IntelliJ IDEA.
  User: 59013-64-02
  Date: 30/10/2018
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Pizza</title>
    <link rel="stylesheet" href="../../ressources/css/pizza/pizza.css">
</head>
<body>
    <table>
        <tr>
            <th>id</th>
            <th>libelle</th>
            <th>reference</th>
            <th>prix</th>
            <th>url</th>
        </tr>
        <c:forEach var="pizza" items="${pizza }">
            <tr>
                <td>${pizza.id}</td>
                <td>${pizza.libelle}</td>
                <td>${pizza.reference}</td>
                <td>${pizza.prix}</td>
                <td>${pizza.url_image}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
