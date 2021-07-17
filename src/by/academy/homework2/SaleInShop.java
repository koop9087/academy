package by.academy.homework2;

import java.util.Scanner;

public class SaleInShop {
    static final int ADULT_AGE = 18;
    static final int TASK_PRICE = 100;
    static final int TASK_PRICE1 = 200;
    static final int TASK_PRICE2 = 300;
    static final int TASK_PRICE3 = 400;
    static final double SALE_PERCENT = 0.05d;
    static final double SALE_PERCENT1 = 0.07d;
    static final double SALE_PERCENT2 = 0.12d;
    static final double SALE_PERCENT3 = 0.15d;
    static final double SALE_PERCENT4 = 0.20d;
    static final double SALE_PERCENT5 = 0.04d;
    static final double SALE_PERCENT6 = 0.03d;
    private static final Scanner scanner = new Scanner(System.in);

    public static void calculateSale() {
        double price = scanner.nextDouble();
        int age = scanner.nextInt();
        scanner.close();
        if (price < TASK_PRICE) {
            price = price - (price * SALE_PERCENT);
        } else if (price >= TASK_PRICE && price < TASK_PRICE1) {
            price = price - (price * SALE_PERCENT1);
        } else if (price >= TASK_PRICE1 && price < TASK_PRICE2) {
            price = price - (price * SALE_PERCENT2);
            if (age >= ADULT_AGE) {
                price = price - (price * SALE_PERCENT5);
            } else {
                price = price + (price * SALE_PERCENT6);
            }
        } else if (price >= TASK_PRICE2 && price < TASK_PRICE3) {
            price = price - (price * SALE_PERCENT3);
        } else if (price >= TASK_PRICE3) {
            price = price - (price * SALE_PERCENT4);
        }
        System.out.println(price);
    }
}
