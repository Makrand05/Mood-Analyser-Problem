package com.bix.moodanalyser;

public class MoodAnyalyser {
    String message;

    public MoodAnyalyser(String message) {
        this.message = message;
    }

    public String moodAnalyser() {
        if (this.message.toLowerCase().contains("sad")) {
            return "sad";
        } else
            return "happy";


    }
}
