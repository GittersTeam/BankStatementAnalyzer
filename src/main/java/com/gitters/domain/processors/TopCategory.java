package com.gitters.domain.processors;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.gitters.domain.bankStatements.BankStatement;
import com.gitters.domain.transactions.OutBoundTransaction;
import com.gitters.domain.transactions.Transaction;

public class TopCategory implements Processor {

    public Object process(BankStatement statement) {
        List<Transaction> transes = statement.getOutboundTransactions();
        HashMap<String, Double> map = new HashMap<String, Double>();
        for (Transaction tran : transes) {
            OutBoundTransaction temp = ((OutBoundTransaction) tran);
            if (map.containsKey(temp.getTo())) {
                map.put(temp.getTo(), map.get(temp.getTo()) + temp.getCharge().getAmount());
            } else {
                map.put(temp.getTo(), temp.getCharge().getAmount());
            }
        }
        return getCat(map, Collections.max(map.values()));
    }

    public <K, V> Object getCat(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                HashMap<String, Double> result = new HashMap<String, Double>();
                result.put((String) entry.getKey(), (Double) entry.getValue());
                return result;
            }
        }
        return map;
    }
}
