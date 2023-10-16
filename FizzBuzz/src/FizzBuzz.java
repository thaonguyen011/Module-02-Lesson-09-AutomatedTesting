public class FizzBuzz {
    private static boolean isPositiveInteger(int number){
        return number > 0;
    }

    public static String fizzBuzzTranslate(int number){
        if (isPositiveInteger(number)) {
            if (number % 15 == 0) {
                return "FizzBuzz";
            } else if (number % 3 == 0) {
                return "Fizz";
            } else if (number % 5 == 0) {
                return "Buzz";
            } else return "" + number;
        } else throw new RuntimeException("Not a positive number");
    }

    private static String convertANumberToWord(int number) {
        String[] wordArray = new String[] {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        return wordArray[number];
    }

    public static String convertNumberToWord(int number) {
        String numberString = Integer.toString(number);
        StringBuilder result = new StringBuilder();

        if (isPositiveInteger(number) && number < 100) {
            for (int i = 0; i < numberString.length(); i++) {
                int x = Integer.parseInt(String.valueOf(numberString.charAt(i)));

                if (x == 3 || x == 5) result.append(fizzBuzzTranslate(x)).append(" ");
                else result.append(convertANumberToWord(x)).append(" ");
            }
            return result.toString();
        } else throw new RuntimeException("Not a positive number or number is larger than 100");
    }

}
