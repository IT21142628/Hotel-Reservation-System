<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="home.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/home.css">
<link rel="stylesheet" href="css/payment-style.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src='https://kit.fontawesome.com/a076d05399.js'></script>

<title>Payment Form</title>
</head>
     <style>
         body{
              
              
                background-image:url("images/pool-area.jpg");
                background-repeat:no-repeat;
                background-size:cover;
                background-attachment:fixed;
            
             }
       </style>
<body>
<!--  <div id='container'>-->
  <div class="form_payment">



<h1 class="payment">Payment</h1>

         <form action="PaymentInsert" method="post" >
         
                    Name  :<br> <input type = "text" name = "name" placeholder ="Enter name" required><br>
					Phone-Number :<br> <input type = "text" name = "phone" placeholder ="Enter phoneNumber" required><br>
					Address :<br> <input type = "text" name = "address" placeholder ="Enter address" required><br>
					
                    Card-Type :<br> <input type = "text" name = "cardType" placeholder ="Enter cardType" required><br>
                    Card-Number :<br><input type="text" name="cardNo" placeholder="card number">
                    <br>
                    
					Cards-accepted:<br><center><img src="images/card_img.png" alt=""><br><br></center>
					
                    Exp-Date :<br><input type = "text" name = "expDate" placeholder ="Enter Expiry Date" required><br>
                    CV-Code :<br> <input type="text" placeholder="123" name="cvCode" >
                   
                    <br>
                    <input type="submit" name="submit" value="Submit">
            
            
           <br>
         
         
         </form>
         
         <br><br><br>
          
        
          
</div><br><br>
<!--  </div>-->


</body>
</html>