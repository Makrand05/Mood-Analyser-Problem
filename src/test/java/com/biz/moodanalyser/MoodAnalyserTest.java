package com.biz.moodanalyser;

import com.bix.moodanalyser.MoodAnyalyser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMood_whenSadMood_shouldersSadMood() {
        MoodAnyalyser moodAnyalyser=new MoodAnyalyser("I am in sad mood");
        String actualResult=moodAnyalyser.moodAnalyser();
        String expectedResult="sad";
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenMood_whenHappyMood_shouldersHappyMood() {
        MoodAnyalyser moodAnyalyser=new MoodAnyalyser("I am in Happy mood");
        String actualResult=moodAnyalyser.moodAnalyser();
        String expectedResult="happy";
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenMood_whenAny_shouldersHappyMood() {
        MoodAnyalyser moodAnyalyser=new MoodAnyalyser("I am in a any mood");
        String actualResult=moodAnyalyser.moodAnalyser();
        String expectedResult="happy";
        Assert.assertEquals(expectedResult,actualResult);
    }
}
