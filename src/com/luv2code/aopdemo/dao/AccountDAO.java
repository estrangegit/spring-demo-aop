package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {

	public void addAccount() {		
		System.out.println(getClass() + " addAccount()");		
	}
	
	public void addAccount(Account theAccount) {		
		System.out.println(getClass() + " addAccount(Account theAccount)");		
	}
	
	public void addAccount(Account theAccount, boolean vipFlag) {		
		System.out.println(getClass() + " addAccount(Account theAccount, boolean vipFlag)");		
	}
	
	public boolean doWork() {
		System.out.println(getClass() + " doWork()");
		return true;
	}
}
