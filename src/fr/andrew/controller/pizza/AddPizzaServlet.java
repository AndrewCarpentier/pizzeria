package fr.andrew.controller.pizza;

import fr.andrew.business.pizza.PizzaBusiness;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addpizza")
public class AddPizzaServlet extends HttpServlet {
    private PizzaBusiness pizzaBusiness = new PizzaBusiness();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String libelle = request.getParameter("libelle");
        String reference = request.getParameter("reference");
        Integer prix = Integer.valueOf(request.getParameter("prix"));
        String url_image = request.getParameter("url_image");

       // pizzaBusiness.addpizza(libelle,reference,prix,url_image);

        response.sendRedirect("/pizza");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/pizza/addPizza.jsp").forward(request,response);
    }
}
