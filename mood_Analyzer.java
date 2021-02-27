package com.mood.analyzer;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyzerTest {

	@Test
	public void givenMessgae_WhenSad_ShouldReturn_Sad() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Sad Mood");
		String mood = null;
		try {
			mood = moodAnalyser.analyseMood();
			Assert.assertEquals("SAD", mood);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	@Test
	public void givenMessage_WhenNotSad_ShouldReturn_Happy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any Mood");
		String mood = null;
		try {
			mood = moodAnalyzer.analyseMood();
			Assert.assertEquals("HAPPY", mood);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	@Test
	public void givenNullMood_ShouldReturn_Happy() {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
		String mood = null;
		try {
			mood = moodAnalyser.analyseMood();
			Assert.assertEquals("HAPPY", mood);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
