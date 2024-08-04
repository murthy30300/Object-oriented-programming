package CalculatorServlet;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class CalculatorServlet extends HttpServlet
{
 public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
 {

 response.setContentType("text/html;charset=UTF-8");
 PrintWriter out = response.getWriter();
 out.println("<html><head><title>Servlet CalculatorServlet</title></head><body>");
 double n1 = Double.parseDouble(request.getParameter("txtN1"));
 double n2 = Double.parseDouble(request.getParameter("txtN2"));
 double result =0;
 String opr=request.getParameter("opr");
 if(opr.equals("+")) result=n1+n2;
 if(opr.equals("-")) result=n1-n2;
 if(opr.equals("*")) result=n1*n2;
 if(opr.equals("/")) result=n1/n2;
 out.println("<h1> Result = "+result);
 out.println("</body></html>");
 }
}