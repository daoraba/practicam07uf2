<%-- 
    Document   : index
    Created on : 20-mar-2017, 19:09:37
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Diagrama de sGANTT</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/bootstrap.css">
        <script src="js/bootstrap.js"></script>
    </head>
    <body style="margin: 40px">
        
        <div class="header" style="text-align: center">
            <h1>Diagrama de GANTT</h1>
        </div>
        
        <form method="POST" action="/controlador" class="panel panel-body">
            <h2>Nuevo proyecto</h2><br>
            Nombre <input type="text" name="nom"><br><br>
            Fecha inicio <input type="date" name="fecha_inicio"><br><br>
            Fecha final <input type="date" name="fecha_final"><br><br>
            <input class="btn btn-primary " type="submit" name="envia" value="crear proyecto" />
        </form>
    </body>
</html>

