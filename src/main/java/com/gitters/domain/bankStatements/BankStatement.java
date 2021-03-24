package com.gitters.domain.bankStatements;

import java.util.*;

import com.gitters.domain.transactions.Transaction;

public class BankStatement {

	private String statmentId;
	private List<Transaction> transactions = new ArrayList<Transaction>();

	public BankStatement() {

	}

	public BankStatement(String csv) {
		this.statmentId = csv;

	}

	public String getStatmentId() {
		return statmentId;
	}

	public void setStatmentId(String statmentId) {
		this.statmentId = statmentId;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

}