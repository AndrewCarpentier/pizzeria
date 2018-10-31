package fr.andrew.controller.pizza;

import fr.andrew.business.pizza.PizzaBusiness;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeletePizzaServlet", urlPatterns = "/deletepizza")
public class DeletePizzaServlet extends HttpServlet {
    private PizzaBusiness pizzaBusiness = new PizzaBusiness();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));

        pizzaBusiness.deletepizza(id);

        response.sendRedirect("/pizza");
    }
}
