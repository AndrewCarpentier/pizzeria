<%--
  Created by IntelliJ IDEA.
  User: 59013-64-02
  Date: 31/10/2018
  Time: 09:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Detail Pizza</title>
    <link rel="stylesheet" href="../../ressources/css/pizza/detailPizza.css">
</head>
<body>
    <div id="pizza-container-image" class="containerimg">
        <a href=""> <img src="${url}" alt="pizza ${libelle}"></a>
        <h4>Nom de la pizza</h4>
            <p class="nom-pizza">${libelle}</p>
        <h4>Reference de la pizza</h4>
            <p class="ref-pizza">${reference}</p>
        <h4>Prix de la pizza</h4>
            <p class="prix">${prix}€</p>
        <h4 hidden>Url de l'image</h4>
            <p hidden class="urlImg-pizza">${url}</p>

        <a href="/modifierpizza?id=${id}">
            <button>modifier</button> <br/>
        </a>
        <br/><br/>
        <a href="/deletepizza?id=${id}">
            <button>Supprimer</button>
        </a>
        <br/><br/>
        <a href="/pizza">
            <button>Retour à la page pizza</button>
        </a>



    </div>
</body>
</html>
