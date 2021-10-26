package com.bridgelabz.moodAnalyser;

import com.bridgelabz.moodAnalyser.MoodAnalyserException.ExceptionType;

public class MoodAnalyser {
	private String message;
	
	MoodAnalyser(){
		
	}
	
	String MoodAnalyser(String message) throws MoodAnalyserException {
		this.message = message;
		return analyseMood(message);
	}
	static String analyseMood() {
		//return "SAD";
		return "HAPPY";
	}
	
	public String analyseMood(String message) throws MoodAnalyserException{
		try {
			if(this.message.length() == 0) {
				throw new MoodAnalyserException(ExceptionType.ENTERED_EMPTY, "Please don't enter Empty message");
			}
			if(message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
			}catch (NullPointerException e) {
				return "HAPPY";
		}

	}

}
