package fr.andrew.controller.pizza;

import fr.andrew.bean.Pizza;
import fr.andrew.business.pizza.PizzaBusiness;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ModifierPizzaServlet", urlPatterns = "/modifierpizza")
public class ModifierPizzaServlet extends HttpServlet {
    private PizzaBusiness pizzaBusiness = new PizzaBusiness();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String libelle = request.getParameter("libelle");
        String reference = request.getParameter("reference");
        Integer prix = Integer.valueOf(request.getParameter("prix"));
        String url_image = request.getParameter("url_image");
        Integer id = Integer.valueOf(request.getParameter("id"));

        pizzaBusiness.modifierpizza(libelle,reference,prix,url_image,id);

        response.sendRedirect("/pizza");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));

        Pizza p = pizzaBusiness.getPizzaById(id);
        request.setAttribute("pizza",p);

        this.getServletContext().getRequestDispatcher("/WEB-INF/pizza/modifierPizza.jsp").forward(request,response);
    }
}
