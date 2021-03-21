package com.gitters.domain.bankStatements;

import java.util.*;

import com.gitters.domain.transactions.Transaction;

public class BankStatement {

    private String statmentId;
    private List<Transaction> transaction = new ArrayList<Transaction>();

    public BankStatement() {
    }

    /**
     * @return String return the statmentId
     */
    public String getStatmentId() {
        return statmentId;
    }

    /**
     * @param statmentId the statmentId to set
     */
    public void setStatmentId(String statmentId) {
        this.statmentId = statmentId;
    }

    /**
     * @return List<Transaction> return the transaction
     */
    public List<Transaction> getTransaction() {
        return transaction;
    }

    /**
     * @param transaction the transaction to set
     */
    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }

}