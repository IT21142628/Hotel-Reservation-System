/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-11-10 23:37:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.payment.DBConnect;
import java.sql.*;

public final class paymentView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/home.jsp", Long.valueOf(1668122919503L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.payment.DBConnect");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/home.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\r\n");
      out.write("<script src='https://kit.fontawesome.com/a076d05399.js'></script>\r\n");
      out.write("<title>Home Page</title>\r\n");
      out.write("<style>\r\n");
      out.write("body{\r\n");
      out.write("              \r\n");
      out.write("              \r\n");
      out.write("          background-image:url(\"images/pool-area.jpg\");\r\n");
      out.write("          background-repeat:no-repeat;\r\n");
      out.write("          background-size:cover;\r\n");
      out.write("          background-attachment:fixed;\r\n");
      out.write("            \r\n");
      out.write("            }\r\n");
      out.write("h3\r\n");
      out.write("{\r\n");
      out.write("	color: yellow;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write(" <!--Header-->\r\n");
      out.write("    <br>\r\n");
      out.write("    <div class=\"topnav sticky\">\r\n");
      out.write(" \r\n");
      out.write("            <center><h2 style=\"color:#34282C;font-size:30px;font-family:cursive;\">Hotel Reservation</h2></center>\r\n");
      out.write("            <h2><a href=\"Login.jsp\"><b>Guwani@gmail.com</b> <i class='fas fa-user-alt'></i></a></h2>\r\n");
      out.write("            <a href=\"home.jsp\">Home <i class=\"fa fa-institution\"></i></a>\r\n");
      out.write("            <a href=\"paymentInsert.jsp\">Payment <i class='fa fa-credit-card'></i></a>\r\n");
      out.write("            <a href=\"paymentView.jsp\">Payment List <i class='fa fa-sticky-note'></i></a>\r\n");
      out.write("            <a href=\"updatePayment.jsp\">Change Payment <i class=\"fa fa-pencil-square-o\"></i></a>\r\n");
      out.write("            <a href=\"deletePayment.jsp\"> Delete Payment <i class='fa fa-window-close'></i></a>\r\n");
      out.write("            <a href=\"contact.jsp\">Contact <i class=\"fa fa-address-book\"></i></a>\r\n");
      out.write("            <a href=\"logout.jsp\">Logout <i class='fas fa-share-square'></i></a>\r\n");
      out.write("            <div class=\"search-container\">\r\n");
      out.write("             <form action=\"searchHome.jsp\" method=\"post\">\r\n");
      out.write("             <input type=\"text\" name=\"search\">\r\n");
      out.write("             <button type=\"submit\"><i class=\"fa fa-search\"></i></button>\r\n");
      out.write("             </form>\r\n");
      out.write("             \r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("           <br>\r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           <div class=\"footer\">\r\n");
      out.write("          <p>All Right Reserved @ Hotel Reservation</p>\r\n");
      out.write("      </div>\r\n");
      out.write("           \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/payment-style.css\">\r\n");
      out.write("<title>Payment Details</title>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("        body{\r\n");
      out.write("              \r\n");
      out.write("              \r\n");
      out.write("          background-image:url(\"images/pool-area.jpg\");\r\n");
      out.write("          background-repeat:no-repeat;\r\n");
      out.write("          background-size:cover;\r\n");
      out.write("          background-attachment:fixed;\r\n");
      out.write("            \r\n");
      out.write("            }\r\n");
      out.write("		table {\r\n");
      out.write("  			border-collapse: collapse;\r\n");
      out.write("  			background-color: white;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		table, th, td {\r\n");
      out.write("		  border: 1px solid black;\r\n");
      out.write("		}\r\n");
      out.write("	</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<table style=\"width:100%\">\r\n");
      out.write("        <thead>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <th scope=\"col\">ID </th>\r\n");
      out.write("            <th scope=\"col\">Name </th>\r\n");
      out.write("            <th scope=\"col\">Phone-Number </th>\r\n");
      out.write("            <th scope=\"col\">Address </th>\r\n");
      out.write("            <th scope=\"col\">Card-Type</th>\r\n");
      out.write("            <th scope=\"col\">Card-Number</th>\r\n");
      out.write("            <th scope=\"col\">Exp-Date</th>\r\n");
      out.write("            <th scope=\"col\">CV-Code</th>\r\n");
      out.write("           \r\n");
      out.write("          </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody>\r\n");

try {
	Connection con=DBConnect.getConnection();
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select *from payment");
	while(rs.next())
	{

      out.write("\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>");
      out.print(rs.getString(1) );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString(2) );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString(3) );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString(4) );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString(4) );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString(6) );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString(7) );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString(8) );
      out.write("</td>\r\n");
      out.write("           \r\n");
      out.write("            \r\n");
      out.write("          </tr>\r\n");
}
	}
	catch(Exception e){
		System.out.println(e);
	}
      out.write("\r\n");
      out.write("        </tbody>\r\n");
      out.write("      </table>\r\n");
      out.write("      <br>\r\n");
      out.write("      <br>\r\n");
      out.write("      <br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
