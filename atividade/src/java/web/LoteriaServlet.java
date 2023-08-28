package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "LoteriaServlet", urlPatterns = {"/loteria.html"})
public class LoteriaServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoteriaServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Números da Loteria</h1>");

            List<Integer> numeros = gerarNumerosLoteria(6, 1, 60);

            out.println("<table border='1'>");
            out.println("<tr><th>Números Sorteados</th></tr>");
            out.print("<tr>");
            for (int numero : numeros) {
                out.print("<td>" + numero + "</td>");
            }
            out.println("</tr>");
            out.println("</table>");

            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

    private List<Integer> gerarNumerosLoteria(int quantidade, int min, int max) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            numeros.add(i);
        }
        Collections.shuffle(numeros);
        return numeros.subList(0, quantidade);
    }
}
