import java.sql.SQLOutput;

public class Rome {
    private static final String[] numerals = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};
    private static final int[] values = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

    String roman = Calc.Array[0];
    public static int roman2Decimal(String roman) {
        int result = 0;
        for (int i = 0; i < numerals.length; i++) {
            while (roman.startsWith(numerals[i])) {
                result += values[i];
                roman = roman.substring(numerals[i].length());
            }
        }
        return result;
    }

    String roman2 = Calc.Array[2];
    public static int roman22Decimal(String roman2) {
        int result = 0;
        for (int i = 0; i < numerals.length; i++) {
            while (roman2.startsWith(numerals[i])) {
                result += values[i];
                roman2 = roman2.substring(numerals[i].length());
            }
        }
        return result;
    }
}
