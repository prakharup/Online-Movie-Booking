package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Mapping_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    Connection con;
    PreparedStatement mvst, thst, ctst;
    ResultSet mvrs = null, thrs = null, ctrs = null;
    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "prakhar");
        mvst = con.prepareStatement("select title from movie");
        mvrs = mvst.executeQuery();
        thst = con.prepareStatement("select unique name from theatre");
        thrs = thst.executeQuery();
        ctst = con.prepareStatement("select unique city from theatre");
        ctrs = ctst.executeQuery();
    } catch (Exception e) {
        e.printStackTrace();
    }

      out.write("          \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>book my movie</title>\n");
      out.write("         <title>book my movie</title>\n");
      out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <nav class=\"navbar navbar-default\" ng-hide role=\"navigation\">\n");
      out.write("                        <div class=\"navbar-header\">\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                                <span class=\"sr-only\">Toggle navigation</span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span>\n");
      out.write("                            </button> <a class=\"navbar-brand\" href=\"index.jsp\">Home</a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                            <ul class=\"nav navbar-nav\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"AdminHome.jsp\">Manage Theaters</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"AddMovie.jsp\">Manage Movies</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"active\">\n");
      out.write("                                    <a href=\"Mapping.jsp\">Map Theaters and Movies</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Delete Mapping</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>                            \n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("             <div class=\"row\" style=\"background-color: #f8f8f8;\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <h3>Map Movies &AMP; Theatres</h3>\n");
      out.write("                    <form role=\"form\" class=\"form-inline\" method=\"post\" action=\"MappingServlet\">\n");
      out.write("                        <table class=\"table\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th> Select Movie</th>\n");
      out.write("                                    <td><select name=\"movie\" class=\"form-control\">\n");
      out.write("                                            <option selected>Select Movie</option>\n");
      out.write("                                            ");

                                                while(mvrs.next())
                                                {
                                                    out.println("<option>"+mvrs.getString(1)+"</option>");
                                                }
                                                
      out.write("\n");
      out.write("                                        </select>  </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>\n");
      out.write("                                            Select city\n");
      out.write("                                        </th>\n");
      out.write("                                        <td>\n");
      out.write("                                            <select name=\"city\" class=\"form-control\">\n");
      out.write("                                                <option selected>Select City</option>\n");
      out.write("                                                ");

                                                    while(ctrs.next())
                                                    {
                                                        out.println("<option>"+ctrs.getString(1)+"</option>");
                                                    }
                                                    
      out.write("\n");
      out.write("                                                    \n");
      out.write("                                                \n");
      out.write("                                            </select>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                    <th> Select Theater</th>\n");
      out.write("                                    <td><select name=\"theater\" class=\"form-control\">\n");
      out.write("                                            <option selected>Select Theater</option>\n");
      out.write("                                            ");

                                                while (thrs.next()) {
                                                    out.println("<option>" + thrs.getString(1) + "</option>");
                                                }
                                            
      out.write("\n");
      out.write("                                        </select></td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>\n");
      out.write("                                            Select Date\n");
      out.write("                                        </th>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input tupe=\"date\" name=\"showdate\" class=\"form-control\">\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                    <th rowspan=\"4\" style=\"vertical-align: middle;\">Add Show Timings</th>\n");
      out.write("                                    <td>\n");
      out.write("                                   <select class=\"form-control\" id=\"hours\" name=\"hour1\">\n");
      out.write("                                            <option>Hours</option>\n");
      out.write("                                            <option value=\"1\">1</option>\n");
      out.write("                                            <option value=\"2\">2</option>\n");
      out.write("                                            <option value=\"3\">3</option>\n");
      out.write("                                            <option value=\"4\">4</option>\n");
      out.write("                                            <option value=\"5\">5</option>\n");
      out.write("                                            <option value=\"6\">6</option>\n");
      out.write("                                            <option value=\"7\">7</option>\n");
      out.write("                                            <option value=\"8\">8</option>\n");
      out.write("                                            <option value=\"9\">9</option>\n");
      out.write("                                            <option value=\"10\">10</option>\n");
      out.write("                                            <option value=\"11\">11</option>\n");
      out.write("                                            <option value=\"12\">12</option>\n");
      out.write("                                        </select> : <select class=\"form-control\" id=\"minutes\" name=\"minute1\">\n");
      out.write("                                            <option>Minutes</option>\n");
      out.write("                                            <option value=\"00\">00</option>\n");
      out.write("                                            <option value=\"05\">05</option>\n");
      out.write("                                            <option value=\"10\">10</option>\n");
      out.write("                                            <option value=\"15\">15</option>\n");
      out.write("                                            <option value=\"20\">20</option>\n");
      out.write("                                            <option value=\"25\">25</option>\n");
      out.write("                                            <option value=\"30\">30</option>\n");
      out.write("                                            <option value=\"35\">35</option>\n");
      out.write("                                            <option value=\"40\">40</option>\n");
      out.write("                                            <option value=\"45\">45</option>\n");
      out.write("                                            <option value=\"50\">50</option>\n");
      out.write("                                            <option value=\"55\">55</option>\n");
      out.write("                                        </select> &nbsp;&nbsp; <select class=\"form-control\" id=\"ampm\" name=\"ap1\">\n");
      out.write("                                            <option>AM/PM</option>\n");
      out.write("                                            <option value=\"AM\">AM</option>\n");
      out.write("                                            <option value=\"PM\">PM</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </td>\n");
      out.write("                                     <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        <select class=\"form-control\" id=\"hours\" name=\"hour2\">\n");
      out.write("                                            <option>Hours</option>\n");
      out.write("                                            <option value=\"1\">1</option>\n");
      out.write("                                            <option value=\"2\">2</option>\n");
      out.write("                                            <option value=\"3\">3</option>\n");
      out.write("                                            <option value=\"4\">4</option>\n");
      out.write("                                            <option value=\"5\">5</option>\n");
      out.write("                                            <option value=\"6\">6</option>\n");
      out.write("                                            <option value=\"7\">7</option>\n");
      out.write("                                            <option value=\"8\">8</option>\n");
      out.write("                                            <option value=\"9\">9</option>\n");
      out.write("                                            <option value=\"10\">10</option>\n");
      out.write("                                            <option value=\"11\">11</option>\n");
      out.write("                                            <option value=\"12\">12</option>\n");
      out.write("                                        </select> : <select class=\"form-control\" id=\"minutes\" name=\"minute2\">\n");
      out.write("                                            <option>Minutes</option>\n");
      out.write("                                            <option value=\"00\">00</option>\n");
      out.write("                                            <option value=\"05\">05</option>\n");
      out.write("                                            <option value=\"10\">10</option>\n");
      out.write("                                            <option value=\"15\">15</option>\n");
      out.write("                                            <option value=\"20\">20</option>\n");
      out.write("                                            <option value=\"25\">25</option>\n");
      out.write("                                            <option value=\"30\">30</option>\n");
      out.write("                                            <option value=\"35\">35</option>\n");
      out.write("                                            <option value=\"40\">40</option>\n");
      out.write("                                            <option value=\"45\">45</option>\n");
      out.write("                                            <option value=\"50\">50</option>\n");
      out.write("                                            <option value=\"55\">55</option>\n");
      out.write("                                        </select> &nbsp;&nbsp; <select class=\"form-control\" id=\"ampm\" name=\"ap2\">\n");
      out.write("                                            <option>AM/PM</option>\n");
      out.write("                                            <option value=\"AM\">AM</option>\n");
      out.write("                                            <option value=\"PM\">PM</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        <select class=\"form-control\" id=\"hours\" name=\"hour3\">\n");
      out.write("                                            <option>Hours</option>\n");
      out.write("                                            <option value=\"1\">1</option>\n");
      out.write("                                            <option value=\"2\">2</option>\n");
      out.write("                                            <option value=\"3\">3</option>\n");
      out.write("                                            <option value=\"4\">4</option>\n");
      out.write("                                            <option value=\"5\">5</option>\n");
      out.write("                                            <option value=\"6\">6</option>\n");
      out.write("                                            <option value=\"7\">7</option>\n");
      out.write("                                            <option value=\"8\">8</option>\n");
      out.write("                                            <option value=\"9\">9</option>\n");
      out.write("                                            <option value=\"10\">10</option>\n");
      out.write("                                            <option value=\"11\">11</option>\n");
      out.write("                                            <option value=\"12\">12</option>\n");
      out.write("                                        </select> : <select class=\"form-control\" id=\"minutes\" name=\"minute3\">\n");
      out.write("                                            <option>Minutes</option>\n");
      out.write("                                            <option value=\"00\">00</option>\n");
      out.write("                                            <option value=\"05\">05</option>\n");
      out.write("                                            <option value=\"10\">10</option>\n");
      out.write("                                            <option value=\"15\">15</option>\n");
      out.write("                                            <option value=\"20\">20</option>\n");
      out.write("                                            <option value=\"25\">25</option>\n");
      out.write("                                            <option value=\"30\">30</option>\n");
      out.write("                                            <option value=\"35\">35</option>\n");
      out.write("                                            <option value=\"40\">40</option>\n");
      out.write("                                            <option value=\"45\">45</option>\n");
      out.write("                                            <option value=\"50\">50</option>\n");
      out.write("                                            <option value=\"55\">55</option>\n");
      out.write("                                        </select> &nbsp;&nbsp; <select class=\"form-control\" id=\"ampm\" name=\"ap3\">\n");
      out.write("                                            <option>AM/PM</option>\n");
      out.write("                                            <option value=\"AM\">AM</option>\n");
      out.write("                                            <option value=\"PM\">PM</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        <select class=\"form-control\" id=\"hours\" name=\"hour4\">\n");
      out.write("                                            <option>Hours</option>\n");
      out.write("                                            <option value=\"1\">1</option>\n");
      out.write("                                            <option value=\"2\">2</option>\n");
      out.write("                                            <option value=\"3\">3</option>\n");
      out.write("                                            <option value=\"4\">4</option>\n");
      out.write("                                            <option value=\"5\">5</option>\n");
      out.write("                                            <option value=\"6\">6</option>\n");
      out.write("                                            <option value=\"7\">7</option>\n");
      out.write("                                            <option value=\"8\">8</option>\n");
      out.write("                                            <option value=\"9\">9</option>\n");
      out.write("                                            <option value=\"10\">10</option>\n");
      out.write("                                            <option value=\"11\">11</option>\n");
      out.write("                                            <option value=\"12\">12</option>\n");
      out.write("                                        </select> : <select class=\"form-control\" id=\"minutes\" name=\"minute4\">\n");
      out.write("                                            <option>Minutes</option>\n");
      out.write("                                            <option value=\"00\">00</option>\n");
      out.write("                                            <option value=\"05\">05</option>\n");
      out.write("                                            <option value=\"10\">10</option>\n");
      out.write("                                            <option value=\"15\">15</option>\n");
      out.write("                                            <option value=\"20\">20</option>\n");
      out.write("                                            <option value=\"25\">25</option>\n");
      out.write("                                            <option value=\"30\">30</option>\n");
      out.write("                                            <option value=\"35\">35</option>\n");
      out.write("                                            <option value=\"40\">40</option>\n");
      out.write("                                            <option value=\"45\">45</option>\n");
      out.write("                                            <option value=\"50\">50</option>\n");
      out.write("                                            <option value=\"55\">55</option>\n");
      out.write("                                        </select> &nbsp;&nbsp; <select class=\"form-control\" id=\"ampm\" name=\"ap4\">\n");
      out.write("                                            <option>AM/PM</option>\n");
      out.write("                                            <option value=\"AM\">AM</option>\n");
      out.write("                                            <option value=\"PM\">PM</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                           \n");
      out.write("                            <tr>\n");
      out.write("                                <td colspan=\"3\" align=\"center\">\n");
      out.write("                            <input type=\"submit\" value=\"Map\" class=\"btn btn-lg btn-primary\">\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                                                    \n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("             </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>");
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
