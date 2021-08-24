package by.academy.homework7.task4.util;

import java.util.Random;

public class Randomizer {
    int a;
    public static final Random RANDOM = new Random();

    public Randomizer(int a) {
        this.a = a;
    }

    public int getRandomNumber() {
        return RANDOM.nextInt(a) + 1;
    }
}
