package by.academy.homework2;

import java.util.Scanner;

public class MultiplicatorTable {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int MAX_VALUE_OF_NUM = 10;

    public static void multiplication() {
        int num = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= MAX_VALUE_OF_NUM; i++) {
            System.out.println(num * i);
        }
    }
}
