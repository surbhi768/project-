package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class Welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>LOGIN</title>\n");
      out.write("        <style>\n");
      out.write("\t\t@font-face\n");
      out.write("\t\t{\n");
      out.write("\t\t\tfont-family: DS Digi;\n");
      out.write("\t\t\tsrc: url('sources/DS-DIGI.TTF')\n");
      out.write("\t\t}\n");
      out.write("\t\t@font-face\n");
      out.write("\t\t{\n");
      out.write("\t\t\tfont-family: Orange Juice;\n");
      out.write("\t\t\tsrc: url('sources/orange juice 2.0.ttf');\n");
      out.write("\t\t}\n");
      out.write("\t\t*\n");
      out.write("\t\t{\n");
      out.write("\t\t\tfont-family: Segoe UI;\n");
      out.write("\t\t}\n");
      out.write("\t\tlegend\n");
      out.write("\t\t{\n");
      out.write("\t\t\tcolor: crimson;\n");
      out.write("\t\t}\n");
      out.write("\t\tiframe\n");
      out.write("\t\t{\n");
      out.write("\t\t\tborder: 10px solid grey;\n");
      out.write("\t\t\tborder-radius: 10px;\n");
      out.write("\t\t}\n");
      out.write("\t\tbutton\n");
      out.write("\t\t{\n");
      out.write("\t\t\tpadding: 10px 10px 10px 10px;\n");
      out.write("\t\t\tborder-radius: 5px;\n");
      out.write("\t\t\tbackground-color: crimson;\n");
      out.write("\t\t\tcolor: white;\n");
      out.write("\t\t\tfloat: right;\n");
      out.write("\t\t\tfont-size: 20px;\n");
      out.write("\t\t\tfont-family: Impact;\n");
      out.write("\t\t\tmargin: 0px 5px 5px 0px;\n");
      out.write("\t\t}\n");
      out.write("\t\tbutton:hover\n");
      out.write("\t\t{\n");
      out.write("\t\t\tbackground-color: black;\n");
      out.write("\t\t}\n");
      out.write("\t\t#timebox\n");
      out.write("\t\t{\n");
      out.write("\t\t\tbackground-color: black;\n");
      out.write("\t\t\tcolor: white;\n");
      out.write("\t\t\tfont-family: DS Digi;\n");
      out.write("\t\t\tfont-size: 20px;\n");
      out.write("\t\t\ttext-align: right;\n");
      out.write("\t\t\tpadding: 12px;\n");
      out.write("\t\t\tborder-radius: 10px;\n");
      out.write("\t\t}\n");
      out.write("\t\th2\n");
      out.write("\t\t{\n");
      out.write("\t\t\tfloat: right;\n");
      out.write("\t\t\tcolor: crimson;\n");
      out.write("\t\t\tfont-family: Segoe Print;\n");
      out.write("\t\t\tbackground-color: white;\n");
      out.write("\t\t\tborder-radius: 10px;\n");
      out.write("\t\t\tpadding: 10px;\n");
      out.write("\t\t}\n");
      out.write("\t\th2:hover\n");
      out.write("\t\t{\n");
      out.write("\t\t\tcolor: black;\n");
      out.write("\t\t\tcursor: default;\n");
      out.write("\t\t}\n");
      out.write("\t\t</style>\n");
      out.write("\t\t\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          <body background = \"sources\\img2.jpg\" style = \"background-attachment: fixed;\">\n");
      out.write("    \n");
      out.write("           <div style = \"margin: 50px 100px 100px 100px;\">\n");
      out.write("\t\t    ");

     String email = request.getParameter("email");
            String pass = request.getParameter("pass");
            
            
            try
            {
                String myUrl = "jdbc:mysql://localhost:3306/mydb";
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(myUrl,"root","");
            //out.println("Hello 1");

                String query = "Select email,password from user where email='"+email+"' and password ='"+pass+"'";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(query);
                
               if(rs.next())
                {
                    out.println("Logged in successfully");
                   out.print("Hello "+email);}
               else
                   out.println("Username or Password does not exists");
        
                st.close();
            }
            catch(ClassNotFoundException e)
            {
                out.print(e);
            }
            catch(SQLException e)
            {
                out.print(e);
            }
            
           
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t<a href = \"logout.jsp\" target = \"_top\"><button type=\"button\"> Logout </button></a>\n");
      out.write("\t\t<br><br>\n");
      out.write("\t\t<h2> Welcome ");
      out.print(email);
      out.write("! [admin]</h2>\n");
      out.write("                <iframe src = \"buttons_admin.html\" name = \"tabs\" width = \"100%\" height = \"44px\"> iframe1 </iframe><br><br>\n");
      out.write("          \t<iframe src = \"dashboard.html\" name = \"output\" width = \"100%\" height = \"600px\"> iframe2 </iframe>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
