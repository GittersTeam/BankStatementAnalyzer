package com.gitters.domain.transactions;

import com.gitters.domain.Currency;

public class Charge {
	private Double amount;
	private String currency;

	public Charge() {

	}

	public Charge(Double amount, String currency) {
		setAmount(amount);
		setCurrency(currency);
	}

	public Charge(Double amount) {
		this.amount = amount;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
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
		return "Charge [amount=" + amount + ", currency=" + currency + "]";
	}

}