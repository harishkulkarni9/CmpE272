import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendRedirect extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
public SendRedirect() {
super();
} 
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws 
ServletException, IOException {
// TODO Auto-generated method stub
response.setContentType("text/html");
PrintWriter pw = response.getWriter();
String emailaddress = request.getParameter("email");
String password = request.getParameter("pass");
if(emailaddress.equals("admin")&& password.equals("loansystem"))
{
response.sendRedirect("servlet3");
}
else
{
pw.println("u r not a valid user");
}
} 
}