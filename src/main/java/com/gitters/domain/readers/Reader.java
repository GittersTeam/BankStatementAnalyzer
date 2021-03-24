package com.gitters.domain.readers;

import java.io.FileNotFoundException;
import java.text.ParseException;

import com.gitters.domain.bankStatements.BankStatement;

public interface Reader {
	BankStatement read() throws FileNotFoundException, ParseException;

}
