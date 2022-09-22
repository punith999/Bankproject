package com.BankGit;

public class Main {
	public static int withdraw(int balence,int amount) {
		return balence-amount;
	}
	public static int credit(int balence,int amount) {
		return balence+amount;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount=1000;
		int balence=5000;
		Bank ba=new Bank(7080,"kbc","546789433");
		System.out.println("balence credit:"+ credit(balence,amount)+"form bank:"+ba.getBankName()+"from id:"+ba.getBankId());
		System.out.println("balence withdraw:"+ withdraw(balence,amount)+"form bank:"+ba.getBankName()+"from id:"+ba.getBankId());

	}

}
