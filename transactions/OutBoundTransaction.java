package com.gitters.domain.transactions;

import java.util.Date;

import com.gitters.domain.balance.AccountBalance;

public class OutBoundTransaction extends Transaction {

	public OutBoundTransaction(Date date, String desc, Charge charge, AccountBalance accBalance) {
		super(date, accBalance);
		setDate(date);
		setAccBalance(accBalance);
	}

	private Charge charge;
	private String to;

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Charge getCharge() {
		return charge;
	}

	public void setCharge(Charge charge) {
		this.charge = charge;
	}
}
