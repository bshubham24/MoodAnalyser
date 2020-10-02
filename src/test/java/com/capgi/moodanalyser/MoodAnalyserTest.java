package com.capgi.moodanalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenMessage_WhenNull_ShouldThrowMoodAnalysisException_ofTypeNUll() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		try {
			moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);

		}

	}

}