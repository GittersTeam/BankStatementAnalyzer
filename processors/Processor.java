package com.gitters.domain.processors;

import com.gitters.domain.bankStatements.BankStatement;

public interface Processor {
    public Object process(BankStatement statement);
}
