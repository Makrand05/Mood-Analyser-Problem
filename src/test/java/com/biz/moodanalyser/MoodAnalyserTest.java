package com.biz.moodanalyser;

import com.bix.moodanalyser.MoodAnalyser;
import com.bix.moodanalyser.MoodAnalysisException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMood_whenSadMood_shouldersSadMood() throws MoodAnalysisException {
        MoodAnalyser MoodAnalyser=new MoodAnalyser("I am in sad mood");
        String actualResult=MoodAnalyser.moodAnalyser();
        String expectedResult="sad";
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenMood_whenHappyMood_shouldersHappyMood() throws MoodAnalysisException {
        MoodAnalyser MoodAnalyser=new MoodAnalyser("I am in Happy mood");
        String actualResult=MoodAnalyser.moodAnalyser();
        String expectedResult="happy";
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenMood_whenAny_shouldersHappyMood() throws MoodAnalysisException {
        MoodAnalyser MoodAnalyser=new MoodAnalyser("I am in any mood");
        String actualResult=MoodAnalyser.moodAnalyser();
        String expectedResult="happy";
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenMood_WhenNull_shouldReturnHappy()  {
        MoodAnalyser mood = new MoodAnalyser(null);
        String actualMood;
        try {
            actualMood = mood.moodAnalyser();
        }
        catch (MoodAnalysisException e){
            MoodAnalysisException.ExceptionType expectedMood= MoodAnalysisException.ExceptionType.NULL;
            System.out.println(e);
            Assert.assertEquals(expectedMood,e.exceptionType);
        }
    }

    @Test
    public void givenMessage_whenEmpty_shouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyser mood = new MoodAnalyser("");
        String actualMood;
        try {
            actualMood = mood.moodAnalyser();
        } catch (MoodAnalysisException e) {
            MoodAnalysisException.ExceptionType expectedMood=MoodAnalysisException.ExceptionType.EMPTY;
            System.out.println(e);
            Assert.assertEquals(expectedMood,e.exceptionType);
        }

    }
}
