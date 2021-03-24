package com.gitters.domain.readers;

import java.io.FileNotFoundException;

import com.gitters.domain.bankStatements.BankStatement;

public interface Reader {
	BankStatement read() throws FileNotFoundException;

}
