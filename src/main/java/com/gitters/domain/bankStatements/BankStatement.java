package com.gitters.domain.bankStatements;

import java.util.*;

import com.gitters.domain.transactions.Transaction;

public class BankStatement {

    private String statmentId;
    private List<Transaction> transaction = new ArrayList<Transaction>();

    public BankStatement() {
    }
}