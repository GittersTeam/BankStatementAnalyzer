package com.gitters.domain.transactions;

import com.gitters.domain.Currency;

public class Credit {
	private double amount;
	private String currency;

	public Credit() {

	}

	public Credit(double amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public Credit(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Credit [amount=" + amount + ", currency=" + currency + "]";
	}

}
