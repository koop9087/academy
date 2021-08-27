package by.academy.homework7.task4.util;

public class CustomFilePattern {
    public static final String FILE_PATH = "src\\io\\homework7\\task4\\";
    public static final String EXTENDS_NAME = ".txt";

    public String getFilePattern(int i) {
        StringBuilder sb = new StringBuilder(FILE_PATH);
        sb.append(i).append(EXTENDS_NAME);
        return sb.toString();
    }

    public String getFilePattern(String fileName) {
        StringBuilder sb = new StringBuilder(FILE_PATH);
        sb.append(fileName).append(EXTENDS_NAME);
        return sb.toString();
    }
}
