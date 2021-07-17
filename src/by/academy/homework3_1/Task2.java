package by.academy.homework3_1;

import java.util.Scanner;

public class Task2 {
    public static final Scanner scanner = new Scanner(System.in);

    public static String[] enterLine() {
        int size = scanner.nextInt();
        scanner.nextLine();
        String[] array = new String[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextLine();
        }
        return array;
    }


    public static int[] array(String[] array) {
        int newArray[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = findCountOfExtraordinaryLiteral(array[i]);
        }
        return newArray;
    }

    public static int findCountOfExtraordinaryLiteral(String line) {
        int countOfExtraordinaryLiteral = 0;
        String[] str = line.split("");
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if ((str[i].equals(str[j]))) {
                    countOfExtraordinaryLiteral++;
                }
            }
        }
        return countOfExtraordinaryLiteral;
    }


    public static int findMinValue(int[] array) {
        int index = 0;
        int minValueOfArray = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValueOfArray) {
                minValueOfArray = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void findLine(int index, String[] array) {
        System.out.println(array[index]);
    }
}