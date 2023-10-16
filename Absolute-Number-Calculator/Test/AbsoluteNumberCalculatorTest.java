import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @Test
    void testFindAbsolute() {
        int number = 0;
        int expected = 0;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsolute2() {
        int number = 1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsolute3() {
        int number = -1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsolute4() {
        int number = Integer.MAX_VALUE + 1;
        int expected = Integer.MIN_VALUE;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsolute5() {
        int number = Integer.MIN_VALUE - 1;
        int expected = Integer.MAX_VALUE;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }

//    @Test
//    void testFindAbsolute6() {
//        int number = Integer.MIN_VALUE;
////        int expected = 2147483648; // error: java: integer number too large
//
//        int result = AbsoluteNumberCalculator.findAbsolute(number);
//        assertEquals(expected, result);
//    }





}