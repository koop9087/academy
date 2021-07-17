package by.academy.homework3_1;

import java.util.Scanner;

public class Task1 {

    public static final Scanner scanner = new Scanner(System.in);

    public static void sStringEquals() {
        int k = 0;
        String[] firstLine = scanner.nextLine().split("");
        String[] secondLine = scanner.nextLine().split("");
        boolean[] isTrue = new boolean[firstLine.length];
        if(firstLine.length == secondLine.length) {
            for(int i = 0; i < firstLine.length; i++){
                for(int j = 0; j < secondLine.length; j++) {
                    if(firstLine[i].equals(secondLine[j])) {
                        secondLine[j] = "!8not7allowed6to1enter5474,.,.5<<";
                        isTrue[k] = true;
                        k++;
                    }
                }
            }
        }
        for(int i = 0; i < isTrue.length; i++) {
            if(!isTrue[i]) {
                System.out.println("Не является частью слова");
                return;
            }
        }
    }
}