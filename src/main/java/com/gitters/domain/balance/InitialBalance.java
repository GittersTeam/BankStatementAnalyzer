package com.gitters.domain.balance;

public class InitialBalance extends Balance {

	public InitialBalance(Double amount, String currency) {
		super(amount, currency);
	}

	@Override
	public String toString() {
		return Double.toString(super.getAmount());
	}
}
