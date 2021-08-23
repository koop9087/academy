package by.academy.homework7.task2.service;

import java.io.File;
import java.io.IOException;

public class Creator {
    public static final String FILE_PATH = "src\\io\\homework7\\task2\\result.txt";

    public void createFile() {
        File file = new File(FILE_PATH);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
