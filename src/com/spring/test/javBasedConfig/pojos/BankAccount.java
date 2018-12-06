package com.spring.test.javBasedConfig.pojos;

public class BankAccount {

	private String accountNumber;
	private String bankName;
	private String branchName;
	
	public BankAccount() {
		super();
	}

	public BankAccount(String accountNumber, String bankName, String branchName) {
		super();
		this.accountNumber = accountNumber;
		this.bankName = bankName;
		this.branchName = branchName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", bankName="
				+ bankName + ", branchName=" + branchName + "]";
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
}
