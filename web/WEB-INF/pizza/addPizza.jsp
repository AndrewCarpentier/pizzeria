<%--
  Created by IntelliJ IDEA.
  User: 59013-64-02
  Date: 30/10/2018
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>ADD Pizza</title>
    <link rel="stylesheet" href="../../ressources/css/pizza/addPizza.css">
</head>
<body>
    <div id="addpizza-form">
        <form action="/addpizza" method="POST">
            <label for="libelle">Libelle</label>
            <input type="text" name="libelle" id="libelle" placeholder="Nom de la pizza"><br/>
            <label for="reference">Reference</label>
            <input type="text" name="reference" id="reference" placeholder="Reference : P + 3 premiere lettre pizza"><br/>
            <label for="prix">Prix</label>
            <input type="text" name="prix" id="prix" placeholder="Prix de la pizza"><br/>
            <label for="url_image">URL</label>
            <input type="text" name="url_image" id="url_image" placeholder="URL redirigeant vers une image pizza"><br/>

            <input type="submit" value="Valider">
        </form>
    </div>
</body>
</html>
