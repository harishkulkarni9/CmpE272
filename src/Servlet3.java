import java.io.*;  
import java.sql.*;  

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
import java.util.Date;
public class Servlet3 extends HttpServlet {  
  
public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  Staff s= new Staff();
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
String connectionURL = "jdbc:mysql://localhost/airline_management";
Connection connection=null;
 int staff_ssn;
 int user_id;
String work_desc;
 String position;
 Date hire_date;
 String staff_username=null;
 //String strQuery;
 Statement st=null;
 ResultSet rs=null;
 HttpSession session= request.getSession(true);
 try{  
	 Class.forName("org.gjt.mm.mysql.Driver");
	  connection = DriverManager.getConnection
	   (connectionURL, "root", "password");
	  System.out.println("Inside database");
	 String strQuery = "SELECT * FROM staff WHERE staff_username="+staff_username;
	// PreparedStatement pst = connection.prepareStatement("SELECT * FROM staff WHERE staff_username="+staff_username);
	// strQuery= "select * from staff where staff_ssn='"+staff_ssn+"' or work_desc='"+work_desc+"' or position='"+position+"' or staff_username='"+staff_username+"'";
	System.out.println("processing1....");
	 st= connection.createStatement();
	 rs=st.executeQuery(strQuery);
	 if(rs.next())
	 {
		 s.setstaff_ssn(rs.getInt("staff_ssn"));
		 s.setuser_id(rs.getInt("user_id"));
		 s.setwork_desc(rs.getString("work_desc"));
		 s.setposition(rs.getString("position"));
		 s.sethire_date(rs.getDate("hire_date"));
		 s.setstaff_username(rs.getString("staff_username"));
	 }
	 System.out.println("processing2...");
	 
 
	 
	
	// while(rs.next()){
		//  out.println(rs.getInt(1) +" " + rs.getInt(2)+" " +rs.getString(3)+" "+ rs.getString(4)+" "+ rs.getDate(5)+" "+ rs.getString(6)+"<br>");
	
	 
	 /*while(rs.next())
	 {
		 session.setAttribute("staff_ssn", rs.getInt(1));
		 session.setAttribute("user_id", rs.getInt(2));
		 session.setAttribute("work_desc", rs.getString(3));
		 session.setAttribute("position", rs.getString(4));
		 session.setAttribute("hire_date", rs.getDate(5));
		 session.setAttribute("staff_username", rs.getString(6));
		 
	 }*/
 
 System.out.println("Connected to database");
 connection.close();
 System.out.println("Disconnected from database");
 }
 
 catch(Exception e)
 {
	 System.out.println(e);
 }
 }
 }


              
