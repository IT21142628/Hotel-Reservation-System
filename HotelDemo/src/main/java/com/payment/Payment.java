package com.payment;

public class Payment {
    private int id;
    private String name;
    private String phone;
    private String address;
    private String cardType;
    private String cardNo;
    private String expDate;
    private String cvCode;
    
   
    public Payment(int id, String name, String phone, String address, String cardType, String cardNo, String expDate, String cvCode){
	this.id = id;
	this.name = name;
	this.phone = phone;
	this.address = address;
	this.cardType = cardType;
	this.cardNo = cardNo;
	this.expDate = expDate;
	this.cvCode = cvCode;
    }


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getPhone() {
		return phone;
	}


	public String getAddress() {
		return address;
	}


	public String getCardType() {
		return cardType;
	}


	public String getCardNo() {
		return cardNo;
	}


	public String getExpDate() {
		return expDate;
	}


	public String getCvCode() {
		return cvCode;
	}
    
    
}  

	    