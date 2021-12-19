package com.bix.moodanalyser;

public class MoodAnalyser {
    String message;

    public MoodAnalyser(String message) {

        this.message = message;
    }


    public String moodAnalyser() throws MoodAnalysisException {
        try {
            if (this.message.length() == 0) {
                throw new MoodAnalysisException("Invalid mood", MoodAnalysisException.ExceptionType.EMPTY);

            }

            if (this.message.toLowerCase().contains("sad")) {
                return "sad";
            } else
                return "happy";
        }
        catch (NullPointerException e){
            throw new MoodAnalysisException("Invalid mood", MoodAnalysisException.ExceptionType.NULL);
        }
    }
}
