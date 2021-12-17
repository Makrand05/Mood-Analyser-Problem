package com.bix.moodanalyser;

public class MoodAnalyser {
    String message;

    public MoodAnalyser() {

    }

    public MoodAnalyser(String message) {
        this.message = message;
    }
    public String moodAnalyser() {
        try {
            if (this.message.toLowerCase().contains("sad")) {
                return "sad";
            } else
                return "happy";
        } catch (NullPointerException e) {
            return "happy";
        }
    }
}
