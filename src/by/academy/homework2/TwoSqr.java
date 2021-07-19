package by.academy.homework2;

public class TwoSqr {
    private static final int MAX_VALUE = 1_000_000;

    public static void calculateTwoInSqr() {
        int i = 2;
        int sqr = 0;
        int result = 0;
        while(result < MAX_VALUE) {
            result = i << sqr;
            System.out.println("Двойка в степени : " + sqr + " Равна : " + result);
            sqr++;
        }
    }
}
