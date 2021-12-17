package com.biz.moodanalyser;

import com.bix.moodanalyser.MoodAnalyser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMood_whenSadMood_shouldersSadMood() {
        MoodAnalyser MoodAnalyser=new MoodAnalyser("I am in sad mood");
        String actualResult=MoodAnalyser.moodAnalyser();
        String expectedResult="sad";
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenMood_whenHappyMood_shouldersHappyMood() {
        MoodAnalyser MoodAnalyser=new MoodAnalyser("I am in Happy mood");
        String actualResult=MoodAnalyser.moodAnalyser();
        String expectedResult="happy";
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenMood_whenAny_shouldersHappyMood() {
        MoodAnalyser MoodAnalyser=new MoodAnalyser();
        String actualResult=MoodAnalyser.moodAnalyser();
        String expectedResult="happy";
        Assert.assertEquals(expectedResult,actualResult);
    }
}
