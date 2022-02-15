package com.agri.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Dealer")
public class Dealer {
	
	@Id
	private String dealername;
	private String dealeremail;
	private  long dealerphoneNo;
	private String dealerpassword;
	private BankDetails bankdetails;
	public String getDealername() {
		return dealername;
	}
	public void setDealername(String dealername) {
		this.dealername = dealername;
	}
	public String getDealeremail() {
		return dealeremail;
	}
	public void setDealeremail(String dealeremail) {
		this.dealeremail = dealeremail;
	}
	public long getDealerphoneNo() {
		return dealerphoneNo;
	}
	public void setDealerphoneNo(long dealerphoneNo) {
		this.dealerphoneNo = dealerphoneNo;
	}
	public String getDealerpassword() {
		return dealerpassword;
	}
	public void setDealerpassword(String dealerpassword) {
		this.dealerpassword = dealerpassword;
	}
	public BankDetails getBankdetails() {
		return bankdetails;
	}
	public void setBankdetails(BankDetails bankdetails) {
		this.bankdetails = bankdetails;
	}
	public Dealer(String dealername, String dealeremail, long dealerphoneNo, String dealerpassword,
			BankDetails bankdetails) {
		
		this.dealername = dealername;
		this.dealeremail = dealeremail;
		this.dealerphoneNo = dealerphoneNo;
		this.dealerpassword = dealerpassword;
		this.bankdetails = bankdetails;
	}
	@Override
	public String toString() {
		return "Dealer [dealername=" + dealername + ", dealeremail=" + dealeremail + ", dealerphoneNo=" + dealerphoneNo
				+ ", dealerpassword=" + dealerpassword + ", bankdetails=" + bankdetails + "]";
	}
	
	

}
