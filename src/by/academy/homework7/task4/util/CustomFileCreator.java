package by.academy.homework7.task4.util;

import java.io.File;
import java.io.IOException;

public class CustomFileCreator {
    public static final CustomFilePattern PATTERN = new CustomFilePattern();
    public static final String RESULT_FILE_NAME = "result";

    public void createDirectory() {
        File file = new File(CustomFilePattern.FILE_PATH);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public void createFiles(int value) {
        for (int i = 1; i <= value; i++) {
            createFile(PATTERN.getFilePattern(i));
        }
    }

    public void createResultFile() {
        createFile(PATTERN.getFilePattern(RESULT_FILE_NAME));
    }

    public void createFile(String filePattern) {
        File file = new File(filePattern);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
