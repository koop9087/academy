package by.academy.homework4.deal;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Valid {
    public static final String FIRST_FORMAT_VALID = "^(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[012])-((19|20)\\d\\d)$";
    public static final String SECOND_FORMAT_VALID = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)$";

    public static String scanLine() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void isValid(String text) {
        System.out.println(Pattern.matches(FIRST_FORMAT_VALID, text));
    }

    public void isValidForSecondFormat(String text) {
        System.out.println(Pattern.matches(SECOND_FORMAT_VALID, text));
    }
}
