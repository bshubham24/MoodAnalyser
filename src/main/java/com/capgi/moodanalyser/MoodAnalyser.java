
package com.capgi.moodanalyser;

public class MoodAnalyser {
	public MoodAnalyser() {

	}

	public String analyseMood(String message) {
		message = message.toLowerCase();
		if (message.contains("sad"))
			return "SAD";
		else
			return "HAPPY";

	}

}
