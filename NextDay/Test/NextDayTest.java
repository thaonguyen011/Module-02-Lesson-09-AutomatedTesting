import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayTest {

    @Test
    void findNextDay01() {
        int year = 2023;
        int month = 10;
        int day = 16;
        int[] expected = new int[] {17, 10, 2023};

        int[] result = NextDay.findNextDay(day, month, year);
        assertArrayEquals(expected, result);
    }

    @Test
    void findNextDay02() {
        int year = 2023;
        int month = 2;
        int day = 28;
        int[] expected = new int[]{1, 3, 2023};

        int[] result = NextDay.findNextDay(day, month, year);
        assertArrayEquals(expected, result);
    }

    @Test
    void findNextDay03() {
        int year = 2024;
        int month = 2;
        int day = 28;
        int[] expected = new int[]{29, 2, 2024};

        int[] result = NextDay.findNextDay(day, month, year);
        assertArrayEquals(expected, result);
    }

    @Test
    void findNextDay04() {
        int year = 2024;
        int month = 1;
        int day = 31;
        int[] expected = new int[]{1, 2, 2024};

        int[] result = NextDay.findNextDay(day, month, year);
        assertArrayEquals(expected, result);
    }

    @Test
    void findNextDay05() {
        int year = 2000;
        int month = 2;
        int day = 28;
        int[] expected = new int[]{29, 2, 2000};

        int[] result = NextDay.findNextDay(day, month, year);
        assertArrayEquals(expected, result);
    }

    @Test
    void findNextDay06() {
        int year = 2024;
        int month = 12;
        int day = 31;
        int[] expected = new int[]{1, 1, 2025};

        int[] result = NextDay.findNextDay(day, month, year);
        assertArrayEquals(expected, result);
    }

    @Test
    void findNextDay07() {
        int year = 2024;
        int month = 13;
        int day = 12;
        int[] expected = new int[]{29, 2, 2024};

        int[] result = NextDay.findNextDay(day, month, year);
        assertArrayEquals(expected, result);
    }

    @Test
    void findNextDay08() {
        int year = 2024;
        int month = 12;
        int day = 31;
        int[] expected = new int[]{1, 1, 2025};

        int[] result = NextDay.findNextDay(day, month, year);
        assertArrayEquals(expected, result);
    }
}