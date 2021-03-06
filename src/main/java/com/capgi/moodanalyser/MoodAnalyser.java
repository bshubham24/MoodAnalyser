
package com.capgi.moodanalyser;

public class MoodAnalyser {
	String message;

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() throws MoodAnalysisException {
		try {
			if (message.length() == 0) {
				throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,
						"mood shouldn't be empty");
			}

			if (message.toLowerCase().contains("happy"))
				return "HAPPY";
			else
				return "SAD";
		} catch (NullPointerException e) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL, "mood shouldn't be null");
		}
	}

}
