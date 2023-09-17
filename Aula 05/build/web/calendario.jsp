<%-- 
    Document: calendario
    Created on: 15 de set. de 2023, 22:42:10
    Author: Sanches
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Calendário</title>
</head>
<body>
    <h1>Calendário</h1>

    <%
        int ano = Integer.parseInt(request.getParameter("ano"));
        int mes = Integer.parseInt(request.getParameter("mes"));
    %>

    <table border="1">
        <tr>
            <th>Domingo</th>
            <th>Segunda</th>
            <th>Terça</th>
            <th>Quarta</th>
            <th>Quinta</th>
            <th>Sexta</th>
            <th>Sábado</th>
        </tr>

        <%
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(ano, mes - 1, 1); 

        int diasNoMes = cal.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
        int diaDaSemana = cal.get(java.util.Calendar.DAY_OF_WEEK);

        out.print("<tr>");
        for (int i = 1; i < diaDaSemana; i++) {
            out.print("<td></td>");
        }

        for (int dia = 1; dia <= diasNoMes; dia++) {
            out.print("<td>" + dia + "</td>");

            if (diaDaSemana == java.util.Calendar.SATURDAY) {
                out.print("</tr><tr>");
                diaDaSemana = java.util.Calendar.SUNDAY;
            } else {
                diaDaSemana++;
            }
        }

        for (int i = diaDaSemana; i <= java.util.Calendar.SATURDAY; i++) {
            out.print("<td></td>");
        }
        %>
    </table>
</body>
</html>