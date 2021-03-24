package com.gitters.domain.processors;

public class TopTransaction {
    private int request;

    public TopTransaction(Integer req){
        setRequest(req);
    }

    // public List<Object> getTopTransactions(BankStatement statement){
    //     List<Transaction> transactions = statement.getTransactions();
    // }
    public int getRequest() {
        return request;
    }

    public void setRequest(int request) {
        this.request = request;
    }
}
