package by.academy.homework7.task1.service;

import java.io.File;
import java.io.IOException;

public class Creator {
    public static final String DIRECTORY_PATH = "src\\io\\homework7\\task1";
    public static final String FILE_PATH = "src\\io\\homework7\\task1\\text.txt";

    public void createDirAndFile() {
        File file = new File(DIRECTORY_PATH);
        if (!file.exists()) {
            file.mkdirs();
        }
        File newFile = new File(FILE_PATH);
        try {
            if (!newFile.exists()) {
                newFile.createNewFile();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
