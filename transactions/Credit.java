package com.gitters.domain.transactions;

import com.gitters.domain.Currency;

public class Credit {
	private double amount;
	private Currency currency;

	public Credit() {

	}

	public Credit(double amount, Currency currency) {
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

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
}
