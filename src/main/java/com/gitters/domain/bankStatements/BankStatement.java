package com.gitters.domain.bankStatements;

import java.util.*;

import com.gitters.domain.balance.InitialBalance;
import com.gitters.domain.transactions.InBoundTransaction;
import com.gitters.domain.transactions.OutBoundTransaction;
import com.gitters.domain.transactions.Transaction;

public class BankStatement {

	private String statmentId;
	private InitialBalance initialBalance;
	private List<Transaction> transactions;

	public BankStatement() {
	}

	public List<Transaction> getOutboundTransactions() {
		 List<Transaction> temp = new ArrayList<Transaction>();
		 for (Transaction transaction : getTransactions()) {
			 if(transaction instanceof OutBoundTransaction)
			 temp.add(transaction);
		 }
		return temp;
	}

	public List<Transaction> getInboundTransactions() {
		List<Transaction> temp = new ArrayList<Transaction>();
		for (Transaction transaction : getTransactions()) {
			if(transaction instanceof InBoundTransaction)
			temp.add(transaction);
		}
	   return temp;
	}

	public InitialBalance getInitialBalance() {
		return initialBalance;
	}

	public void setInitialBalance(InitialBalance initialBalance) {
		this.initialBalance = initialBalance;
	}

	public BankStatement(String csv) {
		this.statmentId = csv;
		transactions = new ArrayList<Transaction>();

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