package fr.andrew.business.pizza;

import fr.andrew.bean.Pizza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class PizzaBusiness {

    public ArrayList<Pizza> getPizza(){
        ArrayList<Pizza> pizza = new ArrayList<Pizza>();
        try {
            //installation Driver
            Class.forName("org.mariadb.jdbc.Driver");
                //information de connection
                String url = "jdbc:mariadb://localhost:3306/pizzeria";
                String user = "root";
                String password = "andrew";
            //connection à la base de donnée
            Connection connection = DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement();
            //recuperation des données de la BDD
            ResultSet resultat = statement.executeQuery("SELECT * FROM pizza");

            while (resultat.next()){
                Integer id = resultat.getInt("id");
                String libelle = resultat.getString("libelle");
                String reference = resultat.getString("reference");
                Integer prix = resultat.getInt("prix");
                String url_image = resultat.getString("url_image");

                Pizza p = new Pizza(id,libelle,reference,prix,url_image);

                pizza.add(p);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return pizza;
    }

 /*   public ArrayList<Pizza> getPizza(){
        Pizza p1 = new Pizza(1,"pizza","pp",10,"p1.jpg");
        Pizza p2 = new Pizza(2,"pizza2","pp2",12,"p2.jpg");
        Pizza p3 = new Pizza(3,"pizza3","pp3",13,"p3.jpg");
        Pizza p4 = new Pizza(4,"pizza4","pp4",14,"p4.jpg");

        ArrayList<Pizza> pizza = new ArrayList<Pizza>();
            pizza.add(p1);
            pizza.add(p2);
            pizza.add(p3);
            pizza.add(p4);

        return pizza;
    }*/

}
