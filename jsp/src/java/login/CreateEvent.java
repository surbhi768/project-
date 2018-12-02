/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hardeep
 */
public class CreateEvent extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String sname=request.getParameter("sname");  
String sid=request.getParameter("sid");  
String time=request.getParameter("time");  
String date=request.getParameter("date");
String place=request.getParameter("place");  
String tel=request.getParameter("tel"); 
          
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
    Statement st=conn.createStatement();
    int i=st.executeUpdate ("insert into event (sname,sid,time,date,place,tel)values('"+sname+"','"+sid+"','"+time+"','"+date+"','"+place+"','"+tel+"')");

              out.println("Thank you for creating an event ! Please <a href='schedulemeeting.html'> To Create a New Meeting !</a> to continue.");

        } catch (Exception e2) {
            out.print("Error aaya hai..." + e2);
            System.out.println(e2);
        }

        out.close();
    }  
  
}
