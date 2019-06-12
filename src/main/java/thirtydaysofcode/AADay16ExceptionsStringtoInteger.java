package thirtydaysofcode;

import java.util.Scanner;

public class AADay16ExceptionsStringtoInteger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        System.out.println(parseInteger(S));
    }

    // Imp: Efficient digit checking
    static boolean parseInteger(String val) {
        // convert to charArray
        // loop through it to check if nos
        // if not return Bad String

        // check if 1 char is negative

        // Allow only single decimal

        if (val == null) {
            return false;
        }
        char[] chars = val.toCharArray();
        if (chars.length <= 0)
            return false;
        int index = 0;
        if (chars[0] == '-' && chars.length > 1) {
            index = 1;
        }
        int decimalCount = 0;
        for (; index < chars.length; index++) {

            if (chars[index] == '.') {
                decimalCount++;
                if (decimalCount > 1) {
                    return false;
                }
            } else if (!isNumbers(chars[index], index)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isNumbers(char aChar, int index) {
        return ('0' <= aChar && aChar <= '9');
    }

    private static String parseInteger3(String val) {
        try {
            Double.parseDouble(val);
        } catch (Exception e) {
            return "Bad String";
        }
        return val;
    }


}
