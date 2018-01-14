package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class AdminHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <nav class=\"navbar navbar-default\" ng-hide role=\"navigation\">\n");
      out.write("                        <div class=\"navbar-header\">\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                                <span class=\"sr-only\">Toggle navigation</span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <a class=\"navbar-brand\" href=\"index.jsp\">Home</a>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"collapse-navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("                            <li class=\"active\">\n");
      out.write("                                <a href=\"AdminHome.jsp\">Manage Theatres</a>\n");
      out.write("                                \n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"AddMovie.jsp\">Manage Movies</a></li>\n");
      out.write("                            <li><a href=\"Mapping.jsp\">Map Theatres and Movies</a></li>\n");
      out.write("                            <li>\n");
      out.write("                                    <a href=\"#\">Delete Mapping</a>\n");
      out.write("                                </li>\n");
      out.write("                           \n");
      out.write("                        </ul>\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                <li><a href=\"#\">Welcome </a></li>\n");
      out.write("                                <li><a href=\"adminlogout.jsp\">Logout</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\" style=\"background-color:#f8f8f8;\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <p align=\"centre\"> <i>\n");
      out.write("                            ");
 String thmsg = (String)request.getAttribute("thmsg");
                            if (thmsg == null) {
                            out.println("");
                        } else {
                            out.println(thmsg);
                        }
                    
      out.write("\n");
      out.write("                        </i>\n");
      out.write("                       \n");
      out.write("                    </p>\n");
      out.write("                        <h3>Add Theatres</h3>\n");
      out.write("                        <form role=\"form\" class=\"form-inline\" method=\"post\" action=\"AddTheatre\">\n");
      out.write("                            <table class=\"table\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>Theatre Name</th>\n");
      out.write("                                        <th>Theatre Location</th>\n");
      out.write("                                        <th>Theatre City</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                     <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        <input type=\"text\" name=\"thname\" size=\"25\"/>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <input type=\"text\" name=\"thlocation\" size=\"25\"/>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <input type=\"text\" name=\"thcity\" size=\"25\"/>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td colspan=\"3\" align=\"center\">\n");
      out.write("                                        <input type=\"submit\" name=\"Add theater\" class=\"btn btn-lg btn-primary\"/>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                        <h3>Theatres Added</h3>\n");
      out.write("                         ");

                        Connection con;
                        PreparedStatement st;
                        ResultSet rs;
                        try {
                            Class.forName("oracle.jdbc.driver.OracleDriver");
                            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "prakhar");
                            st = con.prepareStatement("select * from theatre");
                            rs = st.executeQuery();
      out.write("                        \n");
      out.write("                    <table class=\"table\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th> Theater Name </th>\n");
      out.write("                                <th> City </th>\n");
      out.write("                                <th> Location </th>\n");
      out.write("                                <th> &nbsp; </th>                                \n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");

                            while(rs.next())
                            {
                                out.println("<tr>");
                                out.println("<td>"+rs.getString(2)+"</td>");
                                out.println("<td>"+rs.getString(3)+"</td>");
                                out.println("<td>"+rs.getString(4)+"</td>");
                                out.println("<td><a href=\"DeleteServlet?id="+rs.getString(1)+"\"><input type=\"button\" value=\"&times;\" class=\"btn btn-danger\"/></a></td>");
                                out.println("</tr>");
                            }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
