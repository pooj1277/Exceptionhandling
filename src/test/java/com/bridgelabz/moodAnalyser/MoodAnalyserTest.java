package com.bridgelabz.moodAnalyser;
import org.junit.Test;

import junit.framework.Assert;

public class MoodAnalyserTest {
	//UC1 TC 1.1
	@Test
	public void givenMessage_WhenSad_ShouldReturnSAD() throws MoodAnalyserException  {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in Sad Mood");
		Assert.assertEquals("SAD", mood);
	} 
	//TC 1.2
	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHAPPY1()  throws MoodAnalyserException {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in Any Mood");
		Assert.assertEquals("HAPPY", mood);
	}
	//Refactor
	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHAPPY2() throws MoodAnalyserException {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in Happy Mood");
		Assert.assertEquals("HAPPY", mood);
	}
	/*
	//Repeat TC 1.1
	@Test
	public void givenMessage_WhenSad_ShouldReturnSAD1() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD", mood);
	} */
	
	//Repeat TC 1.2
	@Test
	public void givenMessage_WhenHappy_ShouldReturnHAPPY() throws MoodAnalyserException  {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	} 
	
	//UC 2.1
		@Test
		public void givenMessage_WhenNull_ShouldReturnHAPPY() throws MoodAnalyserException {
			MoodAnalyser moodAnalyser = new MoodAnalyser();
			String mood = moodAnalyser.analyseMood("Welcome to Mood Analyser");
			Assert.assertEquals("HAPPY", mood);
		} 
}
