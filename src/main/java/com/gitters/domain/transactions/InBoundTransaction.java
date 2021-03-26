package com.gitters.domain.transactions;

import java.util.Date;

import com.gitters.domain.balance.AccountBalance;

public class InBoundTransaction extends Transaction {
	private Credit credit;
	private String from;

	public InBoundTransaction(Date date, String desc, Credit credit, AccountBalance accBalance) {
		super(date, accBalance);
		this.credit = credit;
		this.from = from;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public Credit getCredit() {
		return credit;
	}

	public void setCredit(Credit credit) {
		this.credit = credit;
	}

	@Override
	public String toString() {
		return "InBoundTransaction [credit=" + credit.toString() + ", from=" + from + "]";
	}

}
