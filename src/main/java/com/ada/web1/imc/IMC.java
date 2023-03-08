package com.ada.web1.imc;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "IMC", urlPatterns = "/calc")
public class IMC extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        Double peso = Double.valueOf(request.getParameter("weight"));
        Double altura = Double.valueOf(request.getParameter("height"));

        Double imc = peso / (peso*altura);

        request.setAttribute("imc", String.format("%.2f %%", imc));
        response.setHeader("imc", String.format("%.2f", imc));
        request.getRequestDispatcher("/index.jsp").forward(request, response);

    }
}