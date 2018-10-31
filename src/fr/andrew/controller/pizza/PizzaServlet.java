package fr.andrew.controller.pizza;

import fr.andrew.business.pizza.PizzaBusiness;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/pizza")
public class PizzaServlet extends HttpServlet {
        private PizzaBusiness pizzaBusiness = new PizzaBusiness();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("pizza",pizzaBusiness.getPizza());
        this.getServletContext().getRequestDispatcher("/WEB-INF/pizza/pizza.jsp").forward(request,response);
    }
}
