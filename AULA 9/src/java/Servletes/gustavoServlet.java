/*
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para alterar esta licença
 * Clique em nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java para editar este modelo
 */
package Servletes; 

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gustavo.json") 
public class gustavoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        
        PrintWriter writer = response.getWriter();
        writer.print("{\"RA\":\"1290482212045\", \"nome\":\"Gustavo Sanches Pavani\", \"disciplinas\":[\"Banco de Dados\",\"Engenharia de Software III\",\"Programacao Orientada a Objetos\", \"Sistemas Operacionais II\"]}");
        writer.flush();
    }
}
