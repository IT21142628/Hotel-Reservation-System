<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.payment.DBConnect"%>
<%@page import="java.sql.*"%>
<%@include file="home.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/payment-style.css">
<title>Payment Details</title>

<style type="text/css">
        body{
              
              
          background-image:url("images/pool-area.jpg");
          background-repeat:no-repeat;
          background-size:cover;
          background-attachment:fixed;
            
            }
		table {
  			border-collapse: collapse;
  			background-color: white;
		}

		table, th, td {
		  border: 1px solid black;
		}
	</style>

</head>
<body>

<table style="width:100%">
        <thead>
          <tr>
            <th scope="col">ID </th>
            <th scope="col">Name </th>
            <th scope="col">Phone-Number </th>
            <th scope="col">Address </th>
            <th scope="col">Card-Type</th>
            <th scope="col">Card-Number</th>
            <th scope="col">Exp-Date</th>
            <th scope="col">CV-Code</th>
           
          </tr>
        </thead>
        <tbody>
<%
try {
	Connection con=DBConnect.getConnection();
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select *from payment");
	while(rs.next())
	{
%>
          <tr>
            <td><%=rs.getString(1) %></td>
            <td><%=rs.getString(2) %></td>
            <td><%=rs.getString(3) %></td>
            <td><%=rs.getString(4) %></td>
            <td><%=rs.getString(4) %></td>
            <td><%=rs.getString(6) %></td>
            <td><%=rs.getString(7) %></td>
            <td><%=rs.getString(8) %></td>
           
            
          </tr>
<%}
	}
	catch(Exception e){
		System.out.println(e);
	}%>
        </tbody>
      </table>
      <br>
      <br>
      <br>



</body>
</html>