package by.academy.homework3_1;

import java.util.Scanner;

public class Task3 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void scanTwoLine() {
        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();
        scanner.close();
        if (firstLine.length() % 2 == 0 && secondLine.length() % 2 == 0) {
            System.out.println(firstLine.substring(0, firstLine.length() / 2) + secondLine.substring(secondLine.length() / 2));
        }
    }
}