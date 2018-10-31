<%--
  Created by IntelliJ IDEA.
  User: 59013-64-02
  Date: 31/10/2018
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Modifier pizza</title>
</head>
<body>
    <div>
        <form action="/modifierpizza" method="POST">
            <input hidden type="text" name="id" id="id" value="${pizza.id}"><br/>
            <label for="libelle">Libelle</label>
                <input type="text" name="libelle" id="libelle" value="${pizza.libelle}" ><br/>
            <label for="reference">Reference</label>
                <input type="text" name="reference" id="reference" value="${pizza.reference}"><br/>
            <label for="prix">Prix</label>
                <input type="text" name="prix" id="prix" value="${pizza.prix}"><br/>
            <label for="url_image">URL</label>
                <input type="text" name="url_image" id="url_image" value="${pizza.url_image}"><br/>

            <input type="submit" value="Valider">
        </form>
    </div>
</body>
</html>
