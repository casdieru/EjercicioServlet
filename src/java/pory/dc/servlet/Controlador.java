/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pory.dc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cas_r
 */
@WebServlet(name = "Controlador", urlPatterns = {"/controlador"})
public class Controlador extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String usuario = request.getParameter("usuario");
        String pwd = request.getParameter("pwd");
        String sexo = request.getParameter("sexo");
        String[] peliculas = request.getParameterValues("pelicula");
        
        
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>HOLA " + usuario + "</h1>");
        out.println("<h3>Sexo " + sexo + "</h3>");
        out.println("<h2>Tus peliculas favoritas son: " + "</h2>");
        
        
    }



}
