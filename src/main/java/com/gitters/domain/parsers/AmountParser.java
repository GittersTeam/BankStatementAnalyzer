package com.gitters.domain.parsers;

import com.gitters.domain.Currency;
import com.gitters.domain.balance.AccountBalance;
import com.gitters.domain.balance.InitialBalance;
import com.gitters.domain.transactions.Charge;
import com.gitters.domain.transactions.Credit;

public class AmountParser {
    public AmountParser() {

    }

    public Object parse(String value, ParseType type) {
        // System.out.println();
        switch (type) {
        case CHARGE:
            return parseToChange(value);
        case CREDIT:
            return parseToCredit(value);
        case ACCOUNT_BALANCE:
            return parseToAccountBalance(value);
        case INITIAL_BALANCE:
            return parseToInitialBalance(value);
        default:
            return null;
        }
    }

    private InitialBalance parseToInitialBalance(String value) {
        InitialBalance i = new InitialBalance(convert(value), getSign(value));
        return i;
    }

    private AccountBalance parseToAccountBalance(String value) {
        AccountBalance a = new AccountBalance(convert(value), getSign(value));
        return a;
    }

    private Credit parseToCredit(String value) {
        Credit c = new Credit(convert(value), getSign(value));
        return c;
    }

    private Charge parseToChange(String value) {
        Charge c = new Charge(convert(value), getSign(value));
        return c;
    }

    private Double convert(String value) {
        // Negative
        if (value.contains("-")) {
            String temp = value.substring(2, value.length() - 1);
            // System.out.println(temp);
            return -1 * Double.parseDouble(temp);

        }
        // Positive
        else {
            String temp = value.substring(1, value.length() - 1);
            // System.out.println(temp);

            return Double.parseDouble(temp);

        }
    }

    private String getSign(String value) {
        // Negative
        if (value.contains("(") && value.contains(")")) {
            String s = Character.toString(value.charAt(1));
            String temp = Currency.valueOf("USD").getValue();
            return temp;
        }
        // Positive
        else {
            String s = Character.toString(value.charAt(0));
            String temp = Currency.valueOf("USD").getValue();
            return temp;
        }
    }
}
