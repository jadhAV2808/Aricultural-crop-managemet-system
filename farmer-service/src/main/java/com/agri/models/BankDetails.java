package com.agri.models;

public class BankDetails {
	
	private String accuntHolderName;
	private long accountNumber;
	private String bankName;
	public String getAccuntHolderName() {
		return accuntHolderName;
	}
	public void setAccuntHolderName(String accuntHolderName) {
		this.accuntHolderName = accuntHolderName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public BankDetails(String accuntHolderName, long accountNumber, String bankName) {
		
		this.accuntHolderName = accuntHolderName;
		this.accountNumber = accountNumber;
		this.bankName = bankName;
	}
	
public BankDetails() {
		
		
	}
	
	@Override
	public String toString() {
		return "BankDetails [accuntHolderName=" + accuntHolderName + ", accountNumber=" + accountNumber + ", bankName="
				+ bankName + "]";
	}
	
	
	
	

}
