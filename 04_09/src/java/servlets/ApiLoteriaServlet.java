package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.json.JSONObject;

/*autor Sanches*/
@WebServlet(name = "ApiLoteriaServlet", urlPatterns = {"/loteria.json"})
public class ApiLoteriaServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");

        Random random = new Random();
        int[] numerosAleatorios = generateRandomNumbers(random);

        try (PrintWriter out = response.getWriter()) {
            JSONObject obj = new JSONObject();
            obj.put("NumerosAleatorios", numerosAleatorios);

            out.print(obj.toString(5)); 
        }
    }

    private int[] generateRandomNumbers(Random random) {
        int[] numbers = new int[6];
        for (int i = 0; i < 6; i++) {
            numbers[i] = random.nextInt(60) + 1; 
        }
        return numbers;
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
        return "API Loteria";
    }
}