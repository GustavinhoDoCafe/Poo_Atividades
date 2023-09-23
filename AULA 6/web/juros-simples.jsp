<%-- 
    Document   : juros-simples pagina 1
    Created on : 18 de set. de 2023, 15:00:35
    Author     : Sanches
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Juros Simples</title>
</head>
<body>
    <!-- Cabeçalho da página -->
    <%@include file="WEB-INF/jspf/header.jspf" %>
        
    <h2>Calculo de Juros Simples</h2>
        
    <form method="post">
        <label for="montante">Valor: </label>
        <input type="number" id="montante" name="montante" required>
        
        <label for="taxa">Juros: </label>
        <input type="number" id="taxa" name="taxa" required>
        
        <label for="meses">Meses: </label>
        <input type="number" id="meses" name="meses" required>
        
        <input type="submit" value="Calcular">
    </form>
    
    <%
        if (request.getMethod().equalsIgnoreCase("post")) {

            double montante = Double.parseDouble(request.getParameter("montante"));
            double taxa = Double.parseDouble(request.getParameter("taxa")); 
            int meses = Integer.parseInt(request.getParameter("meses")); 
            
            
            double valor = montante + (montante * (taxa / 100) * meses);
    %>

    <h4>Resultado:</h4>
    <p>O valor é de: R$ <%= valor %></p>
    
    <%
        }
    %>
    
    <!-- Final da página -->
    <%@include file="WEB-INF/jspf/footer.jspf" %>
</body>
</html>