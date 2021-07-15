package Triagle;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class TriagleTest {
    @Test
    @DisplayName("Test 2,2,2")
    public void testCase1() {
        int fistEdge = 2;
        int secondEdge = 2;
        int thirdEdge = 2;
        Triagle demo = new Triagle(fistEdge, secondEdge, thirdEdge);
        int result = demo.classifyTriagle();
        int expected = Triagle.EQUILATERALTRIANGLE;
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test 2,2,2")
    public void testCase2() {
        int fistEdge = 2;
        int secondEdge = 2;
        int thirdEdge = 3;
        Triagle demo = new Triagle(fistEdge, secondEdge, thirdEdge);
        int result = demo.classifyTriagle();
        int expected = Triagle.ISOSCELESTRIANGLE;
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test 3,4,5")
    public void testCase3() {
        int fistEdge = 3;
        int secondEdge = 4;
        int thirdEdge = 5;
        Triagle demo = new Triagle(fistEdge, secondEdge, thirdEdge);
        int result = demo.classifyTriagle();
        int expected = Triagle.NORMALTRIAGLE;
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test 8,2,3")
    public void testCase4() {
        int fistEdge = 8;
        int secondEdge = 2;
        int thirdEdge = 3;
        Triagle demo = new Triagle(fistEdge, secondEdge, thirdEdge);
        int result = demo.classifyTriagle();
        int expected = Triagle.NOTTRIAGLE;
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test -1,2,1")
    public void testCase5() {
        int fistEdge = -1;
        int secondEdge = 2;
        int thirdEdge = 1;
        Triagle demo = new Triagle(fistEdge, secondEdge, thirdEdge);
        int result = demo.classifyTriagle();
        int expected = Triagle.NOTTRIAGLE;
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test 0,1,1")
    public void testCase6() {
        int fistEdge = 0;
        int secondEdge = 1;
        int thirdEdge = 1;
        Triagle demo = new Triagle(fistEdge, secondEdge, thirdEdge);
        int result = demo.classifyTriagle();
        int expected = Triagle.NOTTRIAGLE;
        assertEquals(expected, result);
    }
}
