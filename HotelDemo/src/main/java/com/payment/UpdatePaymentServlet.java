package com.payment;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdatePaymentServlet")
public class UpdatePaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String cardType = request.getParameter("cardType");
		String cardNo = request.getParameter("cardNo");
		String expDate = request.getParameter("expDate");
		String cvCode = request.getParameter("cvCode");
		
		boolean isTrue;
		
		isTrue = PaymentDBUtil.updatepayment(id,name,phone,address,cardType,cardNo,expDate,cvCode);
		
		if(isTrue == true) {
			
			List<Payment> payDetails = PaymentDBUtil.getPaymentDetails(id);
			request.setAttribute("payDetails", payDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("paymentView.jsp");
			dis.forward(request, response);
		}
		else {
			List<Payment> payDetails = PaymentDBUtil.getPaymentDetails(id);
			request.setAttribute("payDetails", payDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("unsucess.jsp");
			dis.forward(request, response);
		}
	}

}
