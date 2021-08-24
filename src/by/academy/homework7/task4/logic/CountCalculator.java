package by.academy.homework7.task4.logic;

import by.academy.homework7.task2.util.Writer;

import java.io.FileInputStream;
import java.io.IOException;

public class CountCalculator {
    public int getCountLetters() {
        try (FileInputStream fileInputStream = new FileInputStream(Writer.SOURCE_PATH_NAME)) {
            byte[] b = fileInputStream.readAllBytes();
            return b.length;
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return 0;
    }
}
