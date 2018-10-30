package ch.heigvd.amt.mvcdemo.web.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This is an ugly servlet. This is code that you MUST NOT write (even if it is
 * generated by the Netbeans wizard). The problem with this class is that it
 * does not follow the MVC design pattern. The servlet generates the HTML code
 * itself. This has the following disadvantages:
 *
 * - Poor separation of concerns: you want software developers to work
 * independently from web designers. Having HTML produced in Java code is
 * terrible for that.
 *
 * - Poor readability: it clutters Java code (poor readability for developers)
 * and it does not allow to use a web design tool (poor for designers).
 *
 * - Poor maintainability: this implementation forces you to recompile and
 * redeploy the application for any change in the UI. You will lose time. Your
 * IT and your users will hate you (because it will impact service
 * availability).
 *
 *
 * @author Olivier Liechti (olivier.liechti@heig-vd.ch)
 */
@WebServlet(name = "UglyServlet", urlPatterns = {"/pages/ugly"})
public class UglyServlet extends HttpServlet {

  /**
   * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
   * methods.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    try (PrintWriter out = response.getWriter()) {
      out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("<head>");
      out.println("<title>Ugly Servlet</title>");
      out.println("<base href='" + getServletContext().getContextPath() + "/'");
      out.println("<link href=\"static/css/bootstrap.min.css\" rel=\"stylesheet\">");
      out.println("</head>");
      out.println("<body>");
      out.println("<h1>Do NOT do this</h1>");
      out.println("Bring me back to a <a href='pages/home'>safe place</a>.");
      out.println("</body>");
      out.println("</html>");
    }
  }

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
    processRequest(request, response);
  }

  /**
   * Handles the HTTP <code>POST</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    processRequest(request, response);
  }

  /**
   * Returns a short description of the servlet.
   *
   * @return a String containing servlet description
   */
  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
