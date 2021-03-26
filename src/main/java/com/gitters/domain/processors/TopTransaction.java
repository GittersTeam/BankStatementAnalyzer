package com.gitters.domain.processors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.gitters.domain.bankStatements.BankStatement;
import com.gitters.domain.transactions.OutBoundTransaction;
import com.gitters.domain.transactions.Transaction;

public class TopTransaction implements Processor {

    public Object process(BankStatement statement, int numOfTopRequired) {
        List<Transaction> transes = process(statement);
        List<Transaction> topTranses = new ArrayList<Transaction>();
        if (numOfTopRequired > transes.size())
            numOfTopRequired = transes.size();
        for (int i = transes.size() - 1; i > transes.size() - 1 - numOfTopRequired; i--) {
            OutBoundTransaction top = (OutBoundTransaction) transes.get(i);
            topTranses.add(top);
        }
        return topTranses;
    }

    public List<Transaction> process(BankStatement statement) {
        List<Transaction> transes = statement.getOutboundTransactions();
        Collections.sort(transes, new Comparator<Transaction>() {
            public int compare(Transaction o1, Transaction o2) {
                int result = ((Double) o1.getAccBalance().getAmount())
                        .compareTo((Double) o2.getAccBalance().getAmount());
                return result;
            }
        });
        return transes;
    }
}
