import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest01 {

    @Test
    void convertNumberToWord01() {
        int number = 2;
        String expected = "two ";

        String result = FizzBuzz.convertNumberToWord(number);
        assertEquals(expected, result);
    }

    @Test
    void convertNumberToWord02() {
        int number = 23;
        String expected = "two three ";

        String result = FizzBuzz.convertNumberToWord(number);
        assertEquals(expected, result);
    }

    @Test
    void convertNumberToWord03() {
        int number = -2;
        String expected = "two ";

        String result = FizzBuzz.convertNumberToWord(number);
        assertEquals(expected, result);
    }

    @Test
    void convertNumberToWord04() {
        int number = 200;
        String expected = "two ";

        String result = FizzBuzz.convertNumberToWord(number);
        assertEquals(expected, result);
    }

    @Test
    void convertNumberToWord05() {
        int number = 34;
        String expected = "three four ";

        String result = FizzBuzz.convertNumberToWord(number);
        assertEquals(expected, result);
    }
}