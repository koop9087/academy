package by.academy.homework3_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Task1.sStringEquals(); //task1

        String[] line = Task2.enterLine(); //task2
        int[] array = Task2.array(line);
        int index = Task2.findMinValue(array);
        Task2.findLine(index,line);

        Task3.scanTwoLine();  //task3

        Task4.startMatch(); //task4
        int count = Task4.countOfPlayers();
        System.out.println(Arrays.toString(Task4.deck));
        for(int i = 0; i < count; i++){
            System.out.println(Arrays.toString(Task4.issuesWithCards()));
        }
        System.out.println(Arrays.toString(Task4.deck));
    }
}