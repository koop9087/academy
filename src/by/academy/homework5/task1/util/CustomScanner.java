package by.academy.homework5.task1.util;

import java.util.Scanner;

public class CustomScanner {
    public String scanLine(){
        Scanner  scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();
        return line;
    }
}
