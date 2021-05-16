package com.gitters.domain.injector;

import com.gitters.domain.processors.NumberOfTransaction;
import com.gitters.domain.processors.ProfitOrLoss;
import com.gitters.domain.processors.TopCategory;
import com.gitters.domain.processors.TopTransaction;

public class ProcessorInjector {
    
    public static TopTransaction getTopTransactionProcessor(){
        TopTransaction TopTransProcessor = new TopTransaction();
        return TopTransProcessor;
    }
    public static TopCategory getTopCategoryProcessor(){
        TopCategory TopCatProcessor = new TopCategory();
        return TopCatProcessor;
    }
    public static ProfitOrLoss getProfitProcessor(){
        ProfitOrLoss ProfitProcessor = new ProfitOrLoss();
        return ProfitProcessor;
    }
    public static NumberOfTransaction getNumberOfTransactionProcessor(){
        NumberOfTransaction NumTransProcessor = new NumberOfTransaction();
        return NumTransProcessor;
    }
}
