package com.gitters.domain.parsers;
import com.gitters.domain.Currency;
import com.gitters.domain.balance.AccountBalance;
import com.gitters.domain.balance.InitialBalance;
import com.gitters.domain.transactions.Charge;
import com.gitters.domain.transactions.Credit;

public class AmountParser {
    public AmountParser() {

    }

    // $40.00
    // ($40.00)
    public Object parse(String value, ParseType type) {
        switch (type) {
        case CHARGE:
            parseToChange(value);
            break;
        case CREDIT:
            parseToCredit(value);
            break;
        case ACCOUNT_BALANCE:
            parseToAccountBalance(value);
            break;
        case INITIAL_BALANCE:
            parseToInitialBalance(value);
            break;

        default:
            return null;
        }
        return null;
    }

    private InitialBalance parseToInitialBalance(String value) {

        return new InitialBalance(convert(value), getSign(value));
    }

    private AccountBalance parseToAccountBalance(String value) {
        return new AccountBalance(convert(value), getSign(value));
    }

    private Credit parseToCredit(String value) {
        return new Credit(convert(value), getSign(value));
    }

    private Charge parseToChange(String value) {
        return new Charge(convert(value), getSign(value));
    }

    private Double convert(String value) {
        // Negative
        if (value.contains("(") && value.contains(")")) {
            String temp = value.substring(2, value.length() - 1);
            return -1 * Double.parseDouble(temp);

        }
        // Positive
        else {
            String temp = value.substring(2, value.length() - 1);
            return Double.parseDouble(temp);

        }
    }

    private Currency getSign(String value) {
        // Negative
        if (value.contains("(") && value.contains(")")) {
            Currency temp = Currency.valueOf(Character.toString(value.charAt(1)));
            return temp;
        }
        // Positive
        else {
            Currency temp = Currency.valueOf(Character.toString(value.charAt(0)));
            return temp;
        }
    }
}
