package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTestTest {

    private static UnitTest unittest;

    @Before
    public void setUp() throws Exception {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        unittest = new UnitTest();
    }

    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        unittest=null;
    }


    /* The input shouls be string for palindrome */
    @Test
    public void checkPalindrome() {
        assertEquals(
                "madam",
                unittest.checkPalindrome("madam"));
    }
    @Test
    public void checkPalindromeFailure(){

        assertNotEquals(
                "mad",
                unittest.checkPalindrome("madam"));
        assertNotNull(
                "checkPalindrome(): it shoud not return null",
                unittest.checkPalindrome("madam"));
    }


    /* The power of four testcases */
    @Test
    public void powerOfFour() {
        assertEquals(
                16,
                unittest.powerOfFour(2));
    }
    @Test
    public void powerOfFourFailure() {

        assertNotEquals(
                3,
                unittest.powerOfFour(2));

        assertNotNull(
                "powerOfFourFailure(): It should not return null",
                unittest.powerOfFour(2));
    }


    /* convert to uppercase */
    @Test
    public void upperCase() {
        assertEquals(
                "STACKROUTE",
                unittest.upperCase("file.txt"));
    }
    @Test
    public void upperCaseFailure() {

        assertNotEquals(
                "STACKROE",
                unittest.upperCase("file.txt"));
        assertNotNull("uppercase(): it will not return null",
                unittest.upperCase("file.txt"));
    }


    /* Even or Odd */
    @Test
    public void isEven() {
        assertEquals(
                "true",
                unittest.isEven(24));
    }
    @Test
    public void isEvenFailure(){

        assertNotEquals(
                "false",
                unittest.isEven(24));
        assertNotNull(
                "isEven(): it should not be null",
                unittest.isEven(24));
    }


    /* To calculate the average and it should return float value */
    @Test
    public void calculateAverage() {
        assertEquals(
                "81.50",
                unittest.calculateAverage(4,new int[]{86,65,98,77}));
    }
    @Test
    public void calculateAverageFailure(){

        assertNotEquals(
                "30.50",
                unittest.calculateAverage(4,new int[]{86,65,98,77}));

        assertNotNull(
                "getAverage(): It should not be null",
                unittest.calculateAverage(4,new int[]{86,65,98,77}));
    }


    /* To get minumum value */
    @Test
    public void getMinimum() {
        assertEquals(
                "65",
                unittest.getMinimum(4,new int[]{86,65,98,77}));
    }
    @Test
    public void getMinimumFailure() {

        assertNotEquals(
                "79",
                unittest.getMinimum(4,new int[]{85,65,98,77}));
        assertNotNull(
                "getMinimum(): It shouls be not null",
                unittest.getMinimum(4,new int[]{86,65,98,77}));
    }


    /* To get Maximum Value */
    @Test
    public void getMaximum() {
        assertEquals(
                "98",
                unittest.getMaximum(4,new int[]{86,65,98,77}));
    }
    @Test
    public void getMaximumFailure() {

        assertNotEquals(
                "34",
                unittest.getMaximum(4,new int[]{85,65,98,77}));
        assertNotNull(
                "getMaximum(): It shouls be not null",
                unittest.getMaximum(4,new int[]{86,65,98,77}));
    }



    /* To calculate the factorial */
    @Test
    public void checkFactorial() {
        assertEquals(
                2,
                unittest.checkFactorial(2));
    }
    @Test
    public void checkFactorialFailure() {

        assertNotEquals(
                622,
                unittest.checkFactorial(13));
        assertNotNull(
                "checkFactorial(): it should not return null",
                unittest.checkFactorial(1));
    }


    /* count the no of words */
    @Test
    public void frequencyOfWords() {
        assertEquals(
                4,
                unittest.frequencyOfWords("fileDemo.txt"));
    }
    @Test
    public void frequencyOfWordsFailure(){
        assertNotEquals(
                2,
                unittest.frequencyOfWords("fileDemo.txt"));
        assertNotNull(
                "frequencyOfWords(): it should not return null",
                unittest.frequencyOfWords("fileDemo.txt"));

    }
}