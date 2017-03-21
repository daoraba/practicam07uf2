<%@tag language="java" description="componente tarea" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ attribute name="numFiles" required="true"%>
<%@ attribute name="numColumnes" required="true"%>
<%@ attribute name="color" required="false"%>
<table bgcolor="${color}" border="1">
<c:forEach var="i" begin="1" end="${numFiles}" step="1">
    <tr>
        <c:forEach var="j" begin="1" end="${numColumnes}" step="1">
        <td> ${i}- ${j} </td>
        </c:forEach>
    </tr>
</c:forEach>
</table>