package com.gitters.domain.injector;

import com.gitters.domain.readers.CSVReader;

public class ReaderInjector {

	public static CSVReader getCSVReader(String path){
		CSVReader reader = new CSVReader(path);
        return reader;
    }
}
