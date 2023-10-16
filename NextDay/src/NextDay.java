

public class NextDay {
    public static int[] findNextDay(int day, int month, int year) {
        int[] result = new int[]{day, month, year};

        if (day > 31 || day < 1) throw new RuntimeException("Invalid day.");
        else if (day == daysInMonth(month, year)) {
            result[0] = 1;
            if (month == 12) {
                result[1] = 1;
                result[2] = year + 1;
            } else result[1] = month + 1;
        }
        else result[0] = day + 1;

        return result;
    }


    private static int daysInMonth(int month, int year) {
        if ( month > 0 && month < 13) {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    return 31;
                case 2:
                    if (isLeapYear(year)) return 29;
                    else return 28;
                default:
                    return 30;
            }
        } else throw new RuntimeException("Invalid month.");
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 400 == 0) return true;
            else return year % 100 != 0;
        } else return false;
    }

}
