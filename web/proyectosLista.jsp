<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Diagrama de GANTT</title>
        <link rel="stylesheet" href="css/bootstrap.css">
        <script src="js/bootstrap.js"></script>
    </head>
    
    <body style="margin: 40px">
        <div class="header" style="text-align: center">
            <h1>Diagrama de GANTT</h1>
        </div>
        <h3>Mis Proyectos</h3>
        <ul>
<c:forEach var="a" items="${listaProyectos}">

    <li class="margin-top-20">
        ${a.codi}
        Nombre del proyecto -> ${a.nom}<br>
        Fecha inicio -> ${a.fecha_inicio}<br>
        Fecha final -> ${a.fecha_final}<br>
        - Tareas
        <ul>
            <li>
                Tarea: ${tarea.nom_tasca}<br> Descripción: ${tarea.descripcion} <br>Dias: ${tarea.dias}
            </li>
           </ul>
        <form method="post" action="/TareaControlador">
            <input type="text" name="nom_tasca" placeholder="Nombre de la tarea" required>
            <input type="text" name="descripcion" placeholder="Descripcion" required>
            <input type="number" name="dias" placeholder="Dias" required><br>
            <input class="btn btn-default" type="submit" name="task" value="Crear tarea">
        </form>
        
    </li>
</c:forEach>
</ul>
        <div class="margin-top-20">
        <a class="btn btn-primary" href="/index.jsp">Añadir Proyecto</a>
        </div>
    </body>
</html>
