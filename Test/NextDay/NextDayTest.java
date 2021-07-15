package NextDay;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;


public class NextDayTest {
    @Test
    @DisplayName("Test is Leap Year")
    public void testLeapYear() {
        NextDay demo = new NextDay();
        int thisYear = 2016;
        boolean result = demo.isLeapYear(thisYear);
        boolean expected = true;
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test days of month")
    public void testDaysOfMonth() {
        NextDay demo = new NextDay();
        int thisMonth = 2;
        int thisYear = 2016;
        int result = demo.getDaysOfMonth(thisMonth, thisYear);
        int expected = 28;
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test case 1/1/2018")
    public void testCase1() {
        NextDay demo = new NextDay();
        int thisDay = 1;
        int thisMonth = 1;
        int thisYear = 2018;
        String result = demo.getNextDay(thisDay, thisMonth, thisYear);
        String expected = 2 + "/" + 1 + "/" + 2018;
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test case 31/01/2018")
    public void testCase2() {
        NextDay demo = new NextDay();
        int thisDay = 31;
        int thisMonth = 1;
        int thisYear = 2018;
        String result = demo.getNextDay(thisDay, thisMonth, thisYear);
        String expected = 1 + "/" + 2 + "/" + 2018;
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test case 30/04/2018")
    public void testCas3() {
        NextDay demo = new NextDay();
        int thisDay = 30;
        int thisMonth = 4;
        int thisYear = 2018;
        String result = demo.getNextDay(thisDay, thisMonth, thisYear);
        String expected = 1 + "/" + 5 + "/" + 2018;
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test case 28/02/2018")
    public void testCas4() {
        NextDay demo = new NextDay();
        int thisDay = 28;
        int thisMonth = 2;
        int thisYear = 2018;
        String result = demo.getNextDay(thisDay, thisMonth, thisYear);
        String expected = 1 + "/" + 3 + "/" + 2018;
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test case 29/02/2020")
    public void testCas5() {
        NextDay demo = new NextDay();
        int thisDay = 29;
        int thisMonth = 2;
        int thisYear = 2020;
        String result = demo.getNextDay(thisDay, thisMonth, thisYear);
        String expected = 1 + "/" + 3 + "/" + 2020;
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test case 31/12/2018")
    public void testCas6() {
        NextDay demo = new NextDay();
        int thisDay = 31;
        int thisMonth = 12;
        int thisYear = 2018;
        String result = demo.getNextDay(thisDay, thisMonth, thisYear);
        String expected = 1 + "/" + 1 + "/" + 2019;
        assertEquals(expected, result);
    }
}
