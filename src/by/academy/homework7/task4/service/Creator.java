package by.academy.homework7.task4.service;

import by.academy.homework7.task4.util.Pattern;

import java.io.File;
import java.io.IOException;

public class Creator {
    public static final Pattern PATTERN = new Pattern();
    public static final String PATTERN_FOR_RESULT_FILE = Pattern.FILE_PATH + "result" + Pattern.EXTENDS_NAME;

    public void createDirectory() {
        File file = new File(Pattern.FILE_PATH);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public void createFiles() {
        for (int i = 1; i <= 100; i++) {
            File file = new File(PATTERN.getFilePattern(i));
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public void createResultFile() {
        File file = new File(PATTERN_FOR_RESULT_FILE);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
