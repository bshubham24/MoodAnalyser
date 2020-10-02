
package com.capgi.moodanalyser;

public class MoodAnalyser {
	String message;

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() {
		message = message.toLowerCase();
		if (message.contains("sad"))
			return "SAD";
		else
			return "HAPPY";

	}

}
