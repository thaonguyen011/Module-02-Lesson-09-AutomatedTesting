import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void fizzBuzzTranslate01() {
        int number = 15;
        String expected = "FizzBuzz";

        String result = FizzBuzz.fizzBuzzTranslate(number);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void fizzBuzzTranslate02() {
        int number = 6;
        String expected = "Fizz";

        String result = FizzBuzz.fizzBuzzTranslate(number);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void fizzBuzzTranslate03() {
        int number = 25;
        String expected = "Buzz";

        String result = FizzBuzz.fizzBuzzTranslate(number);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void fizzBuzzTranslate04() {
        int number = -15;
        String expected = "FizzBuzz";

        String result = FizzBuzz.fizzBuzzTranslate(number);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void fizzBuzzTranslate05() {
        int number = 0;
        String expected = "FizzBuzz";

        String result = FizzBuzz.fizzBuzzTranslate(number);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void fizzBuzzTranslate06() {
        int number = 2;
        String expected = "2";

        String result = FizzBuzz.fizzBuzzTranslate(number);
        assertEquals(expected, result);
    }

    @Test
    void convertNumberToWord() {
    }
}