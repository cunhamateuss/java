/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import Servlet.Nova;
import Servlet.Maca;
import jakarta.servlet.RequestDispatcher;

/**
 *
 * @author a
 */
@WebServlet(name = "HelloWorldWebServlet", urlPatterns = {"/HelloWorldWebServlet"})
public class HelloWorldWebServlet extends HttpServlet {

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
            
          String email = request.getParameter("email");
           String passC = request.getParameter("password");
            String pass = request.getParameter("passwordConfirm");
            String termos = request.getParameter("termos");
            if ((termos==null) || (email==null) || (email.isEmpty()) ||(pass==null) || (pass.isEmpty()) || (passC==null) || (passC.isEmpty()) || (!pass.equals(passC)))
            {
                String erroTermos="", erroEmail="", erroPass="", erroPassC="";
                if (termos==null)
                    erroTermos="Deve aceitar os termos";
                 if( (email == null) || email.isEmpty())
                     erroEmail = "Deve preencher o email";
                 if( (pass==null)  || pass.isEmpty())
                     erroPass="Deve preencher a password";
                 if( (passC==null) || passC.isEmpty())
                     erroPassC="Deve preencher a confirmação da password";
                 if ( (passC!=null) && (pass!=null) )
                 if(!pass.equals(passC)){
                     erroPassC="As passwords devem ser iguais";
                     erroPass="As passwords devem ser iguais";
                 }
                    paginaResposta(request,response,out, erroTermos, erroEmail, erroPass, erroPassC);
                return;
            }
            /* TODO output your page here. You may use following sample code. */
            RequestDispatcher rd = request.getRequestDispatcher("shared/corpo.jsp");
            rd.include(request, response);
            
            out.println("<h1>O parâmetro passado foi:"+ pass + passC + termos+ email + "</h1>");
            out.println("<h1>Este é o meu primeiro Servlet at " + request.getContextPath() + "</h1>");
                Nova p = new Nova();
             out.println("<h1>" + p.criando()+ "</h1>");
             Maca m1 = new Maca("Azul",true,10);
             out.println("<h1>" + m1.mostraMaca() +"</h1>");
            
             rd = request.getRequestDispatcher("shared/footer.jsp");
            rd.include(request, response);
            
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

    
    public void paginaResposta(HttpServletRequest request,HttpServletResponse response,PrintWriter out,String erroTermos,String erroEmail,String erroPass,String erroPassC) throws ServletException, IOException
    {
        
        RequestDispatcher rd = request.getRequestDispatcher("shared/corpo.jsp");
            rd.include(request, response);
        out.println("<form action=\"HelloWorldWebServlet\" method=\"post\">\n" +
"  <div class=\"form-group\">\n" +
"    <label for=\"email\">Email address</label>\n" +
"    <input type=\"email\" class=\"form-control\" name=\"email\" aria-describedby=\"emailHelp\"  placeholder=\"Insira o seu email..\">\n" +
"    <small id=\"emailHelp\" class=\"form-text text-muted\">A sua privacidade é muito importante para nós, não iremos partilhar com ninguém.</small>\n" +
                "<span>"+ erroEmail +"</span>"+
"  </div>\n" +
"  <div class=\"form-group\">\n" +
"    <label for=\"password\">Password</label>\n" +
"    <input type=\"password\" class=\"form-control\" name=\"password\"  placeholder=\"Insira sua password..\">\n" +
                "<span>"+ erroPass +"</span>"+
"  </div>\n" +
"            <div class=\"form-group\">\n" +
"    <label for=\"passwordConfirm\">Confirmar Password</label>\n" +
"    <input type=\"password\" class=\"form-control\" name=\"passwordConfirm\" placeholder=\"Insira sua password novamente\">\n" +
          "<span>"+ erroPassC+"</span>"+
"  </div>\n" +
"  <div class=\"form-group form-check\">\n" +
"      <input type=\"checkbox\" class=\"form-check-input\" name=\"termos\" >\n" +
"    <label class=\"form-check-label\" for=\"termos\" >Aceito os termos e condições</label>\n" 
     +"<span>"+erroTermos +"</span>"+
"  </div>\n" +
"  <button type=\"submit\" class=\"btn btn-primary\">Criar Conta</button>\n" +
"  <button type=\"reset\" class=\"btn  btn-outline-secundary \"  onclick=\"alert('Triste');\" src=\"shared/triste.jpg\">Limpar Formulário</button>\n" +
"</form>\n");
         rd = request.getRequestDispatcher("shared/footer.jsp");
            rd.include(request, response);
        
    }
}
