package by.academy.homework7.task4.util;

public class Pattern {
    public static final String FILE_PATH = "src\\io\\homework7\\task4\\";
    public static final String EXTENDS_NAME = ".txt";

    public String getFilePattern(int i) {
        return FILE_PATH + i + EXTENDS_NAME;
    }
}
