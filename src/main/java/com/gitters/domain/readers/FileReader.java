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
	private String path;

	public FileReader() {

	}

	public FileReader(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public BankStatement read() throws FileNotFoundException, ParseException {
		return null;
	}

}
