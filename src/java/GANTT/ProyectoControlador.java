/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GANTT;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Daniel
 */
public class ProyectoControlador extends HttpServlet {

     private ArrayList<Proyecto> listaProyectos;
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession sessio = request.getSession();
        if (sessio.getAttribute("listaProyectos")==null)
            listaProyectos = new ArrayList<>();
        else
            listaProyectos = (ArrayList<Proyecto>) sessio.getAttribute("listaProyectos");

       String nom = request.getParameter("nom");
       String fecha_inicio = request.getParameter("fecha_inicio");
       String fecha_final = request.getParameter("fecha_final");

       Proyecto proyecto = new Proyecto(nom, fecha_inicio, fecha_final);

       listaProyectos.add(proyecto);
       sessio.setAttribute("listaProyectos", listaProyectos);

       RequestDispatcher rd=
               request.getRequestDispatcher("proyectosLista.jsp");

       rd.forward(request, response);
       
    }
}
