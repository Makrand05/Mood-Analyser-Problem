package com.bix.moodanalyser;

public class MoodAnyalyser {

    public String moodAnyalyser(String mood) {
        if (mood.toLowerCase().contains("sad")) {
            return "sad";
        } else
            return "happy";
    }
}
