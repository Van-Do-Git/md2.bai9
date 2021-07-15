package SimpleCalculator;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class AbsoluteNumberTest {
    @Test
    @DisplayName("Tets case 0")
    public void testReturnZero() {
        int number = 0;
        AbsoluteNumber demo = new AbsoluteNumber();
        int result = demo.abs(number);
        int excepted = 0;
        assertEquals(excepted, result);
    }
    @Test
    @DisplayName("Test case 1")
    public void tesCase1(){
        int number = 1;
        AbsoluteNumber demo = new AbsoluteNumber();
        int result = demo.abs(number);
        int excepted = 1;
        assertEquals(excepted, result);
    }
    @Test
    @DisplayName("Test case -1")
    public void tesCaseSub1(){
        int number = -1;
        AbsoluteNumber demo = new AbsoluteNumber();
        int result = demo.abs(number);
        int excepted = 1;
        assertEquals(excepted, result);
    }
}
