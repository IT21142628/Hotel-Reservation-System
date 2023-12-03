package com.payment;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PaymentInsert")
public class PaymentInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String cardType = request.getParameter("cardType");
		String cardNo = request.getParameter("cardNo");
		String expDate = request.getParameter("expDate");
		String cvCode = request.getParameter("cvCode");
		
		boolean isTrue;
		
		isTrue = PaymentDBUtil.insertpayment(name, phone, address, cardType, cardNo, expDate, cvCode);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("paymentView.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsucess.jsp");
			dis2.forward(request, response);
		}
		
		
	}

}

