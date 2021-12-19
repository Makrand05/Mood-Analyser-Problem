package com.bix.moodanalyser;

public class MoodAnalysisException extends Exception {
    public ExceptionType exceptionType;
    public String message;

    public enum ExceptionType {
        EMPTY, NULL
    }

    public MoodAnalysisException(String message, ExceptionType exceptionType) {
        this.message = message;
        this.exceptionType = exceptionType;
    }

    public MoodAnalysisException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MoodAnalyasisException{" +
                "exceptionType=" + exceptionType +
                ", message='" + message + '\'' +
                '}';
    }
}
