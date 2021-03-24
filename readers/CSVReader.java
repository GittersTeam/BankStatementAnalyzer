package com.gitters.domain.readers;

public class CSVReader extends FileReader {
	private String path;

	public CSVReader() {

	}

	public CSVReader(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
