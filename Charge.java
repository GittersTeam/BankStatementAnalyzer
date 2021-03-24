package com.gitters.domain;

import com.gitters.domain.parsers.AmountParser;

public class Charge {
	private String amount;
	private Currency currency;

	public Charge() {

	}

	public Charge(String amount, Currency currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public Charge(String amount) {
		this.amount = amount;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Charge [amount=" + amount + ", currency=" + currency + "]";
	}

}