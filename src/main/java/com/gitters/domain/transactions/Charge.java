package com.gitters.domain.transactions;

import com.gitters.domain.Currency;

public class Charge {
	private Double amount;
	private Currency currency;

	public Charge() {

	}

	public Charge(Double amount, Currency currency) {
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