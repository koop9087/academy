package by.academy.homework3_1;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static final Scanner scanner = new Scanner(System.in);
    public static final Random random = new Random();
    public static final int COUNT_OF_CARDS = 52;

    public static int countOfPlayers() {
        int countOfPlayer = scanner.nextInt();
        scanner.close();
        return countOfPlayer;
    }

    public static int[] fillTheArrayOfCards() {
        int countOfCards = 52;
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(countOfCards);
        }
        return array;
    }

    public static void sortTheArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
    }
}