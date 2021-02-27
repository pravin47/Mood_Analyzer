package com.mood.analyzer;

public class MoodAnalyzer {

	public String message;

	public MoodAnalyzer() {

	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyseMood() {
		try {
			if (message.contains("sad")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			return "HAPPY";
		}
	}

	public static void main(String Args[]) {
		System.out.println("Welcome to mood Analyser");
	}
}
