package fr.andrew.business.pizza;

import fr.andrew.bean.Pizza;

import java.sql.*;
import java.util.ArrayList;

public class PizzaBusiness {

    public ArrayList<Pizza> getPizza(){

        ArrayList<Pizza> pizza = new ArrayList<>();
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

    public void addpizza(String libelle, String reference, Integer prix, String url_image){
        try {
            //installation Driver
            Class.forName("org.mariadb.jdbc.Driver");
            //information de connection
            String url = "jdbc:mariadb://localhost:3306/pizzeria";
            String user = "root";
            String password = "andrew";
            //connection à la base de donnée
            Connection connection = DriverManager.getConnection(url,user,password);
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO pizza(libelle, reference, prix, url_image) VALUES(?,?,?,?)");
                preparedStatement.setString(1,libelle);
                preparedStatement.setString(2,reference);
                preparedStatement.setInt(3,prix);
                preparedStatement.setString(4,url_image);
              preparedStatement.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
