package com.capgi.moodanalyser;

public class MoodAnalysisException extends Exception {

	enum ExceptionType {
		ENTERED_NULL
	}

	ExceptionType type;

	public MoodAnalysisException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}

}
