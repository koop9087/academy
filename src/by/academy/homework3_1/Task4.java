package by.academy.homework3_1;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static final Scanner scanner = new Scanner(System.in);
    public static final Random random = new Random();
    public static final int COUNT_OF_CARDS = 52;
    public static final int[] DEFAULT_DECK;
    public static int[] deck = new int[COUNT_OF_CARDS];

    static {
        DEFAULT_DECK = new int[COUNT_OF_CARDS];
        for (int i = 0, index = 0; i < 4; i++) {
            for (int j = 2; j < 15; j++) {
                DEFAULT_DECK[index] = j;
                index++;
            }
        }
    }

    public static int countOfPlayers() {
        int countOfPlayer = scanner.nextInt();
        scanner.close();
        return countOfPlayer;
    }

    public static void startMatch(){
        System.arraycopy(DEFAULT_DECK,0,deck,0,COUNT_OF_CARDS);
    }

    protected static int[] issuesWithCards(){
        int[] array = new int[5];
        for(int i = 0; i < 5; i++){
            int index = random.nextInt(COUNT_OF_CARDS);
            if(deck[index] == 0){
                i--;
                continue;
            }
            array[i] = deck[index];
            deck[index] = 0;
        }
        return array;
    }
}