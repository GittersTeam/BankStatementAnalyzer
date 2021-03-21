package com.gitters.domain.processors;
import com.gitters.domain.bankStatements.BankStatement;

public class NumberOfTransaction implements Processor{


    public Object process(BankStatement statement) {
        Integer numOfTransactions = statement.getTransactions().size();
        return numOfTransactions;
    }
    
}
