public class AbsoluteNumberCalculator {
    public static int findAbsolute(int number) {
        if (number != Integer.MIN_VALUE) {
            if (number < 0) {
                return -number;
            } else return number;
        } else throw new UnsupportedOperationException();
    }

}
