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
public class TareaControlador extends HttpServlet {

    private ArrayList<Tarea> listaTareas;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession sessio = request.getSession();
        if (sessio.getAttribute("listaTareas")==null)
            listaTareas = new ArrayList<>();
        else
            listaTareas = (ArrayList<Tarea>) sessio.getAttribute("listaTareas");
       
       String nom_tasca = request.getParameter("nom_tasca");
       String descripcion = request.getParameter("descripcion");
       int dias = Integer.parseInt(request.getParameter("dias"));
      
       
       
       Tarea tarea = new Tarea(nom_tasca, descripcion, dias);

       listaTareas.add(tarea);
       sessio.setAttribute("listaTareas", listaTareas);

       RequestDispatcher rd=
               request.getRequestDispatcher("proyectosLista.jsp");

       rd.forward(request, response);
       
    }
}
