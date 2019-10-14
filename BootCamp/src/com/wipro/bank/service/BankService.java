package com.wipro.bank.service;

import com.wipro.bank.acc.RDAccount;
import com.wipro.bank.exception.BankValidationException;

public class BankService {
	public static boolean validateData(float principal, int tenure, int age, String gender) throws BankValidationException {
		try {
		if((principal<500)||(tenure!=5||tenure!=10)||(gender.equalsIgnoreCase("Male")||gender.equalsIgnoreCase("Female"))||(age<1||age>100))
			throw new BankValidationException();
		else
		return true;
		}
		catch(BankValidationException ex){
			return false;
		}
	}
	public void calculate(float principal,int tenure, int age, String gender) throws BankValidationException {
		if(BankService.validateData(principal,tenure,age,gender)==true) {
			RDAccount rd=new RDAccount(tenure, principal);
		}
	}
}
