package com.gitters.domain.transactions;

import java.util.Date;

import com.gitters.domain.balance.AccountBalance;

public class Transaction {
	private Date date;
	private AccountBalance accBalance;

	public Transaction(Date date, AccountBalance accBalance) {
		setDate(date);
		setAccBalance(accBalance);
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public AccountBalance getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(AccountBalance accBalance) {
		this.accBalance = accBalance;
	}

	@Override
	public String toString() {
		return "Transaction [accBalance=" + accBalance.toString() + ", date=" + date + "]\n";
	}

}
