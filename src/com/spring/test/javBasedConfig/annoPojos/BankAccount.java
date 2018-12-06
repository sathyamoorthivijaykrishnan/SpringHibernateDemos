package com.spring.test.javBasedConfig.annoPojos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bankAccount")
public class BankAccount {
	
	@Value("1100")
	private int accountNumber;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", bankName="
				+ bankName + ", branchName=" + branchName + "]";
	}
	@Value("SBI")
	private String bankName;
	public String getBankName() {
		return bankName;
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
	@Value("TBM")
	private String branchName;

}
