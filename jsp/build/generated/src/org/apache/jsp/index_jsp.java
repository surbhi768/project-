package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!--\n");
      out.write("Author: W3layouts\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Event Management System</title>\n");
      out.write("<!-- custom-theme -->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Simple Login and Signup Form web template Responsive, Login form web template,Flat Pricing tables,Flat Drop downs  Sign up Web Templates, Flat Web Templates, Login sign up Responsive web template, SmartPhone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("\t\tfunction hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- //custom-theme -->\n");
      out.write("<link href=\"css/style1.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!-- js -->\n");
      out.write("<script src=\"js/jquery-1.9.1.min.js\"></script>\n");
      out.write("<!--// js -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/easy-responsive-tabs.css \" />\n");
      out.write(" <link href=\"//fonts.googleapis.com/css?family=Questrial\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body class=\"bg agileinfo\">\n");
      out.write("   <h1 class=\"agile_head text-center\"> Event Management System</h1>\n");
      out.write("   <div class=\"w3layouts_main wrap\">\n");
      out.write("       \n");
      out.write("    <!--Horizontal Tab-->\n");
      out.write("        <div id=\"parentHorizontalTab_agile\">\n");
      out.write("            <ul class=\"resp-tabs-list hor_1\">\n");
      out.write("                <li>login</li>\n");
      out.write("                <li>signup</li>\n");
      out.write("            </ul>\n");
      out.write("            <div class=\"resp-tabs-container hor_1\">\n");
      out.write("               <div class=\"w3_agile_login\">\n");
      out.write("                    <form action=\"LoginServlet\" method=\"get\" class=\"agile_form\">\n");
      out.write("\t\t\t\t\t  <p>Email</p>\n");
      out.write("\t\t\t\t\t  <input type=\"email\" name=\"email\" required=\"required\" />\n");
      out.write("\t\t\t\t\t  <p>Password</p>\n");
      out.write("\t\t\t\t\t  <input type=\"password\" name=\"password\" required=\"required\" class=\"password\" /> \n");
      out.write("\t\t\t\t\t  <div class=\"check\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"checkbox w3l\"><input type=\"checkbox\" name=\"checkbox\" required=\"required\"><i> </i>I accept the terms and conditions</label>\n");
      out.write("\t\t\t\t\t </div>\n");
      out.write("\t\t\t\t\t  <input type=\"submit\" value=\"login\" class=\"agileinfo\" />\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t <div class=\"login_w3ls\">\n");
      out.write("\t\t\t\t        <a href=\"#\">Forgot Password</a>\n");
      out.write("\t\t\t\t\t </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"agile_its_registration\">\n");
      out.write("                    <form action=\"SignupServlet\" method=\"post\" class=\"agile_form\">\n");
      out.write("\t\t\t\t\t  <p>First Name</p>\n");
      out.write("\t\t\t\t\t  <input type=\"text\" name=\"fname\" required=\"required\" />\n");
      out.write("\t\t\t\t\t  <p>Last Name</p>\n");
      out.write("\t\t\t\t\t  <input type=\"text\" name=\"lname\" required=\"required\" />\n");
      out.write("                                          <p>Email</p>\n");
      out.write("\t\t\t\t\t  <input type=\"email\" name=\"email\" required=\"required\" />\n");
      out.write("                                           <p>Username</p>\n");
      out.write("\t\t\t\t\t  <input type=\"text\" name=\"uname\" required=\"required\" />\n");
      out.write("\t\t\t\t\t    <p>Password</p>\n");
      out.write("\t\t\t\t\t  <input type=\"password\" name=\"password\" id=\"password1\"  required=\"required\">\n");
      out.write("\t\t\t\t\t <p>Confirm Password</p>\n");
      out.write("\t\t\t\t\t  <input type=\"password\" name=\"confirm_password\" id=\"password2\"  required=\"required\">\n");
      out.write("         \t  \t\t\t<div class=\"check w3_agileits\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"checkbox w3\"><input type=\"checkbox\" name=\"checkbox\" required=\"required\" ><i> </i>I accept the terms and conditions</label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t   <input type=\"submit\" value=\"signup\"/>\n");
      out.write("\t\t\t\t\t   <input type=\"reset\" value=\"Reset\" />\n");
      out.write("\t\t\t\t\t</form> \n");
      out.write("\t\t\t\t</div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\t\t <!-- //Horizontal Tab -->\n");
      out.write("    </div>\n");
      out.write("\t\n");
      out.write("<!--tabs-->\n");
      out.write("<script src=\"js/easyResponsiveTabs.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(document).ready(function() {\n");
      out.write("\t//Horizontal Tab\n");
      out.write("\t$('#parentHorizontalTab_agile').easyResponsiveTabs({\n");
      out.write("\t\ttype: 'default', //Types: default, vertical, accordion\n");
      out.write("\t\twidth: 'auto', //auto or any width like 600px\n");
      out.write("\t\tfit: true, // 100% fit in a container\n");
      out.write("\t\ttabidentify: 'hor_1', // The tab groups identifier\n");
      out.write("\t\tactivate: function(event) { // Callback function if tab is switched\n");
      out.write("\t\t\tvar $tab = $(this);\n");
      out.write("\t\t\tvar $info = $('#nested-tabInfo');\n");
      out.write("\t\t\tvar $name = $('span', $info);\n");
      out.write("\t\t\t$name.text($tab.text());\n");
      out.write("\t\t\t$info.show();\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t\twindow.onload = function () {\n");
      out.write("\t\t\tdocument.getElementById(\"password1\").onchange = validatePassword;\n");
      out.write("\t\t\tdocument.getElementById(\"password2\").onchange = validatePassword;\n");
      out.write("\t\t};\n");
      out.write("\t\tfunction validatePassword(){\n");
      out.write("\t\t\tvar pass2=document.getElementById(\"password2\").value;\n");
      out.write("\t\t\tvar pass1=document.getElementById(\"password1\").value;\n");
      out.write("\t\t\tif(pass1!==pass2)\n");
      out.write("\t\t\t\tdocument.getElementById(\"password2\").setCustomValidity(\"Passwords Don't Match\");\n");
      out.write("\t\t\telse\n");
      out.write("\t\t\t\tdocument.getElementById(\"password2\").setCustomValidity('');\t \n");
      out.write("\t\t\t\t//empty string means no validation error\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<!--//tabs-->\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
