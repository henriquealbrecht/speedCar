package br.com.speedcar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addVehicle")
public class addVehicle extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String descricao = request.getParameter("descricao");
        String data = request.getParameter("data");
        String valor = request.getParameter("valor");
        String categoria = request.getParameter("categoria");

        System.out.println(descricao);
        System.out.println(data);
        System.out.println(valor);
        System.out.println(categoria);
    }
}
