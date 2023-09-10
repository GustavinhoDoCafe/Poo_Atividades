package servlets;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONObject;

 /* @author Sanches */
@WebServlet(name = "ApiGustavoServlet", urlPatterns = {"/gustavo.json"})
public class ApiGustavoServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");

        String ra = "1290482212045";
        String nome = "Gustavo Sanches Pavani";
        String[] disciplinas = {
            "Banco de Dados",
            "Engenharia de Software III",
            "Linguagem de Programação IV",
            "Programação Orientada a Objetos",
            "Sistema Operacionais II",
            "Inglês IV"
        };

        try (PrintWriter out = response.getWriter()) {
            JSONObject obj = new JSONObject();
            obj.put("RA", ra);
            obj.put("Nome", nome);

            JSONArray disciplinasArray = new JSONArray();
            for (String disciplina : disciplinas) {
                disciplinasArray.put(disciplina);
            }
            obj.put("Disciplinas Cursadas", disciplinasArray);


            String jsonFormatted = obj.toString(3);

            out.print(jsonFormatted);
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
        return "API Gustavo";
    }
}