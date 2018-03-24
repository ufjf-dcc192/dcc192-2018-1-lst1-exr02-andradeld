/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.function.Function;
import java.util.stream.Collectors;
import static javafx.scene.input.KeyCode.K;

/**
 *
 * @author ice
 */
@WebServlet(urlPatterns = {"/index.html"})
public class Servet extends HttpServlet {

    Map<String, String> paises = new HashMap<>();

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        paises.put("Brasil", "verde");
        paises.put("China", "amarelo");
        paises.put("Japão", "verde");
        paises.put("EUA", "rosa");
        paises.put("Colombia", "preto");
        
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Servet</title>");
        out.println("</head>");
        out.println("<body>");

        out.println("<dl>");
        for (Map.Entry<String, String> entry : paises.entrySet()) {

            out.println("<dt> " + entry.getKey() + "</dt>");
            out.println("<dd> " + entry.getValue() + "</dd>");

        }
        out.println("</dl> ");
        
        
        
        out.println("</body>");
        out.println("</html>");
    }
    }
}
