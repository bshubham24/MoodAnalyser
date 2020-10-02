package com.capgi.moodanalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenMessage_WhenNull_ShouldReturnNull() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String mood = moodAnalyser.analyseMood();
		assertEquals("NULL", mood);
	}

}
