package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.json.JsonObject;
import org.json.simple.JSONArray;
import javax.json.JsonArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.sql.*;

public final class AddMovie_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>book my movie</title>\n");
      out.write("         <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                     <nav class=\"navbar navbar-default\" ng-hide role=\"navigation\">\n");
      out.write("                        <div class=\"navbar-header\">\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                                <span class=\"sr-only\">Toggle navigation</span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span>\n");
      out.write("                            </button> <a class=\"navbar-brand\" href=\"index.jsp\">Home</a>\n");
      out.write("                        </div>\n");
      out.write("                         <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                            <ul class=\"nav navbar-nav\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"AdminHome.jsp\">Manage Theaters</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"active\">\n");
      out.write("                                    <a href=\"AddMovie.jsp\">Manage Movies</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
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
      out.write("            <div class=\"row\" style=\"background-color: #f8f8f8;\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <h3>Add Movies</h3>\n");
      out.write("                    <form role=\"form\" class=\"form-inline\" method=\"get\" action=\"SearchMovie\">\n");
      out.write("                        <table class=\"table\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>Movie Name</th>\n");
      out.write("                                    <th>Year Of Release</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><input type=\"text\" name=\"movname\" size=\"25\"/>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <input type=\"text\" name=\"movieyear\" size=\"25\"/>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        <td colspan=\"2\" align=\"center\">\n");
      out.write("                                        <input type=\"submit\" value=\"Search Movie\" class=\"btn btn-lg btn-primary\"/>\n");
      out.write("                                    </td>\n");
      out.write("\n");
      out.write("                            \n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                                </form>\n");
      out.write("                               <p align=\"center\"><i>\n");
      out.write("                            ");

                                String movmsg = (String) request.getAttribute("movmsg");
                                if (movmsg == null) {
                                    out.println("");
                                } else {
                                    out.println(movmsg);
                                }
                            
      out.write("\n");
      out.write("                        </i></p>\n");
      out.write("                    <form action=\"AddMovie\" method=\"post\">\n");
      out.write("                        <table class=\"table table-striped\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Poster</th>\n");
      out.write("                                <th>Title</th>\n");
      out.write("                                <th>Release Year</th>\n");
      out.write("                                <th>Language</th>\n");
      out.write("                                <th>Plot</th>\n");
      out.write("                                 <th>&nbsp;</th>\n");
      out.write("                                <th>&nbsp;</th>\n");
      out.write("                            </tr>      \n");
      out.write("                            ");

                                String jsonstr = (String) request.getAttribute("jsonstr");
                                if (jsonstr == null) {
                                    out.println("");
                                }
 else {
                                        JSONParser parser = new JSONParser();
                                        try {

                                            Object json = parser.parse(jsonstr);
                                            JSONObject jsonobj = (JSONObject) json;
                                            JSONArray jsonarray = (JSONArray) jsonobj.get("results");
                                            JSONObject jsonobj1 = (JSONObject) jsonarray.get(0);
                                            String base_url = "http://image.tmdb.org/t/p/w92";
                                            String poster = base_url.concat(jsonobj1.get("poster_path").toString());
                                            //hidden fields start
                                            out.println("<tr>");
                                            out.println("<td><input type=\"hidden\" name=\"poster\" value=\"" + poster + "\"/></td>");
                                            out.println("<td><input type=\"hidden\" name=\"title\" value=\"" + jsonobj1.get("title") + "\"/></td>");
                                            out.println("<td><input type=\"hidden\" name=\"year\" value=\"" +jsonobj1.get("release_date").toString().substring(0,4) + "\"/></td>");
                                            out.println("<td><input type=\"hidden\" name=\"language\" value=\"" + jsonobj1.get("original_language").toString() + "\"/></td>");
                                            out.println("<td><input type=\"hidden\" name=\"plot\" value=\"" + jsonobj1.get("overview") + "\"/></td>");
                                            out.println("</tr>");
                                            //hidden fields end
                                            out.println("<tr>");
                                            out.println("<td><img src=\"" + poster + "\" width=\"100\" height=\"100\" alt=\"no image\"/></td>");
                                            out.println("<td>" + jsonobj1.get("title") + "</td>");
                                            out.println("<td>" + jsonobj1.get("release_date").toString().substring(0,4) + "</td>");
                                            out.println("<td>" + jsonobj1.get("original_language").toString() + "</td>");
                                            out.println("<td>" + jsonobj1.get("overview") + "</td>");
                                            out.println("</tr>");
                                        } catch (Exception ex) {
                                            ex.printStackTrace();
                                        }

                                    }
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td colspan=\"5\" style=\"text-align: center;\">\n");
      out.write("                                    <input type=\"submit\" value=\"Add Movie\" class=\"btn btn-primary\"/></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                    ");

                        Connection con;
                        PreparedStatement st;
                        ResultSet rs;
                        try {
                            Class.forName("oracle.jdbc.driver.OracleDriver");
                            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "prakhar");
                            st = con.prepareStatement("select * from movie");
                            rs = st.executeQuery();
      out.write("                        \n");
      out.write("                            <h3>Added Movies</h3>\n");
      out.write("                        <table class=\"table\" align=\"center\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Title</th>\n");
      out.write("                                <th>Release Year</th>\n");
      out.write("                                <th>Language</th>\n");
      out.write("                                <th>Plot</th>\n");
      out.write("                               \n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");

                                    while (rs.next()) {
                                        out.println("<tr>");
                                        out.println("<td width=\"20%\">" + rs.getString(6) + "</td>");
                                        out.println("<td width=\"20%\">" + rs.getString(1) + "</td>");
                                        out.println("<td width=\"20%\">" + rs.getString(5) + "</td>");
                                        out.println("<td width=\"20%\">" + rs.getString(2) + "</td>");
                                       out.println("<td><a href=\"DeleteServlet?id=" + rs.getString(6) + "\"><input type=\"button\" value=\"&times;\" class=\"btn btn-danger\"/></a></td>");
                                        out.println("</tr>");
                                    }
                                    con.close();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
