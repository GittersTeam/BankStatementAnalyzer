package com.gitters.runners;

import java.io.FileNotFoundException;
import java.text.ParseException;

import com.gitters.domain.bankStatements.BankStatement;
import com.gitters.domain.processors.NumberOfTransaction;
import com.gitters.domain.processors.ProfitOrLoss;
import com.gitters.domain.processors.TopCategory;
import com.gitters.domain.processors.TopTransaction;
import com.gitters.domain.readers.CSVReader;
import com.gitters.domain.readers.FileReader;

public class BankStatementAnalyzer {

	public static void main(String[] args) throws FileNotFoundException, ParseException {

		FileReader reader = new CSVReader("src/main/resources/bankstatement.csv");
		BankStatement statement = reader.read();
		TopTransaction TopTransProcessor = new TopTransaction();
		TopCategory TopCatProcessor = new TopCategory();
		ProfitOrLoss ProfitProcessor = new ProfitOrLoss();
		NumberOfTransaction NumTransProcessor = new NumberOfTransaction();
		System.out.println(ProfitProcessor.process(statement));
		System.out.println(NumTransProcessor.process(statement));
		System.out.println(TopTransProcessor.process(statement, 3));
		System.out.println(TopCatProcessor.process(statement));
	}
}
