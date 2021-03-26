package com.gitters.domain.balance;

import com.gitters.domain.Currency;

public class Balance {
    double amount;
    String currency;

    public Balance(double amount, String currency) {
        setAmount(amount);
        setCurrency(currency);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}