package com.gitters.domain.readers;

import com.gitters.domain.balance.AccountBalance;
import com.gitters.domain.balance.InitialBalance;
import com.gitters.domain.bankStatements.BankStatement;
import com.gitters.domain.parsers.AmountParser;
import com.gitters.domain.parsers.ParseType;
import com.gitters.domain.transactions.Charge;
import com.gitters.domain.transactions.Credit;
import com.gitters.domain.transactions.InBoundTransaction;
import com.gitters.domain.transactions.OutBoundTransaction;
import com.gitters.domain.transactions.Transaction;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class FileReader implements Reader {
	private BankStatement bank;
	private AmountParser parser;
	private List<Transaction> transactions;

	public FileReader() {

	}

	public FileReader(String path) {
		bank = new BankStatement(path);
		transactions = new ArrayList<Transaction>();
		parser = new AmountParser();

	}

	public BankStatement read() throws FileNotFoundException, ParseException {
		File file = new File(bank.getStatmentId());
		Scanner s = new Scanner(file);
		int i = 0;
		while (s.hasNext()) {
			if (i < 1) {
				i++;
				s.nextLine();
				continue;
			}

			String data = s.nextLine();
			String[] values = data.split(",");
			if (i == 1) {
				bank.setInitialBalance((InitialBalance) parser.parse(values[4], ParseType.INITIAL_BALANCE));
				i++;
				continue;
			}
			String chargesvalues = values[2];
			SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
			Date date = formatter1.parse(values[0]);
			if (!chargesvalues.isEmpty()) {
				OutBoundTransaction charge = new OutBoundTransaction(date, values[1],
						(Charge) parser.parse(chargesvalues, ParseType.CHARGE),
						(AccountBalance) parser.parse(values[4], ParseType.ACCOUNT_BALANCE));
				transactions.add(charge);
			}
			String creditvalues = values[3];
			if (!creditvalues.isEmpty()) {
				InBoundTransaction credit = new InBoundTransaction(date, values[1],
						(Credit) parser.parse(creditvalues, ParseType.CREDIT),
						(AccountBalance) parser.parse(values[4], ParseType.ACCOUNT_BALANCE));
				transactions.add(credit);
			}
			i++;
		}
		s.close();
		bank.setTransactions(transactions);

		return bank;
	}

}
