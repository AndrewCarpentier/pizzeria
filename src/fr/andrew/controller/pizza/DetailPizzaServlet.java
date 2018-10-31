package fr.andrew.controller.pizza;

import fr.andrew.business.pizza.PizzaBusiness;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DetailPizzaServlet", urlPatterns = "/detailpizza")
public class DetailPizzaServlet extends HttpServlet {
    PizzaBusiness pizzaBusiness = new PizzaBusiness();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String libelle = request.getParameter("libelle");
        String reference = request.getParameter("reference");
        String prix = request.getParameter("prix");
        String url = request.getParameter("url");
        String id = request.getParameter("id");

        request.setAttribute("libelle", libelle);
        request.setAttribute("reference", reference);
        request.setAttribute("prix", prix);
        request.setAttribute("url", url);
        request.setAttribute("id",id);

        this.getServletContext().getRequestDispatcher("/WEB-INF/pizza/detailPizza.jsp").forward(request,response);
    }
}
