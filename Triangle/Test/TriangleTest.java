import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @org.junit.jupiter.api.Test
    void triangleClassifier01() {
        double side1 = 1;
        double side2 = 1;
        double side3 = 1;

        String expected = "equilateral triangle";
        String result = Triangle.triangleClassifier(side1, side2, side3);
        assertEquals(result, expected);
    }

    @org.junit.jupiter.api.Test
    void triangleClassifier02() {
        double side1 = 2;
        double side2 = 2;
        double side3 = 3;

        String expected = "isosceles triangle";
        String result = Triangle.triangleClassifier(side1, side2, side3);
        assertEquals(result, expected);
    }

    @org.junit.jupiter.api.Test
    void triangleClassifier03() {
        double side1 = 3;
        double side2 = 4;
        double side3 = 5;

        String expected = "scalene triangle";
        String result = Triangle.triangleClassifier(side1, side2, side3);
        assertEquals(result, expected);
    }

    @org.junit.jupiter.api.Test
    void triangleClassifier04() {
        double side1 = 8;
        double side2 = 2;
        double side3 = 3;

        String expected = "scalene triangle";
        String result = Triangle.triangleClassifier(side1, side2, side3);
        assertEquals(result, expected);
    }

    @org.junit.jupiter.api.Test
    void triangleClassifier05() {
        double side1 = -1;
        double side2 = 2;
        double side3 = 1;

        String expected = "scalene triangle";
        String result = Triangle.triangleClassifier(side1, side2, side3);
        assertEquals(result, expected);
    }

    @org.junit.jupiter.api.Test
    void triangleClassifier06() {
        double side1 = 0;
        double side2 = 1;
        double side3 = 1;

        String expected = "scalene triangle";
        String result = Triangle.triangleClassifier(side1, side2, side3);
        assertEquals(result, expected);
    }
}