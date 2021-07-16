package FizzBuzz;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    @DisplayName("test case 3")
    public void testCase3() {
        int number = 3;
        FizzBuzz demo = new FizzBuzz();
        String result = demo.getFizzBuzz(number);
        String expected = FizzBuzz.FIZZ;
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("test case 5")
    public void testCase5() {
        int number = 5;
        FizzBuzz demo = new FizzBuzz();
        String result = demo.getFizzBuzz(number);
        String expected = FizzBuzz.BUZZ;
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("test case 15")
    public void testCase15() {
        int number = 15;
        FizzBuzz demo = new FizzBuzz();
        String result = demo.getFizzBuzz(number);
        String expected = FizzBuzz.FIZZ + FizzBuzz.BUZZ;
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("test case 13")
    public void testCase13() {
        int number = 13;
        FizzBuzz demo = new FizzBuzz();
        String result = demo.getFizzBuzz(number);
        String expected = FizzBuzz.FIZZ;
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("test case 25")
    public void testCase25() {
        int number = 25;
        FizzBuzz demo = new FizzBuzz();
        String result = demo.getFizzBuzz(number);
        String expected = FizzBuzz.BUZZ;
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("test case 28")
    public void testCase28() {
        int number = 28;
        FizzBuzz demo = new FizzBuzz();
        String result = demo.getFizzBuzz(number);
        String expected = " Tow Eight";
        assertEquals(expected, result);
    }
}
