package com.capgi.moodanalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any Mood");
		String mood = moodAnalyser.analyseMood();
		assertEquals("HAPPY", mood);
	}

}
