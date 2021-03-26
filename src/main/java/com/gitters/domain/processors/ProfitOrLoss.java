package com.gitters.domain.processors;

import java.util.List;

import com.gitters.domain.balance.InitialBalance;
import com.gitters.domain.bankStatements.BankStatement;
import com.gitters.domain.transactions.Transaction;

public class ProfitOrLoss implements Processor {

    public String process(BankStatement statement) {
        InitialBalance init = statement.getInitialBalance();
        List<Transaction> transes = statement.getTransactions();
        return transes.get(transes.size()-1).getAccBalance().getAmount() > init.getAmount() ? "Loss" : "Profit";
    }
    

}
