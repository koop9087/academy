package by.academy.homework7.task4.service;

import by.academy.homework7.task2.util.Writer;
import by.academy.homework7.task4.util.CustomFileCreator;
import by.academy.homework7.task4.util.CustomFilePattern;
import by.academy.homework7.task4.util.CustomFileReader;
import by.academy.homework7.task4.util.CustomFileWriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

public class CustomFileService {
    public static final CustomFilePattern PATTERN = new CustomFilePattern();
    public static final CustomFileReader FILE_READER = new CustomFileReader();
    public static final CustomFileWriter WRITER = new CustomFileWriter();
    public static final Random RANDOM = new Random();

    public static int findCountOfSymbols() {
        int count = -1;
        try (FileInputStream fileInputStream = new FileInputStream(Writer.SOURCE_PATH_NAME)) {
            byte[] b = fileInputStream.readAllBytes();
            count = b.length;
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return count;
    }

    public void randomFill(int value) {
        for (int i = 0; i <= value; i++) {
            String text = FILE_READER.readStringFromFile(Writer.SOURCE_PATH_NAME);
            int num = RANDOM.nextInt(findCountOfSymbols() + 1);
            String line = text.substring(num);
            WRITER.write(PATTERN.getFilePattern(i), text, false);
            WRITER.write(PATTERN.getFilePattern(CustomFileCreator.RESULT_FILE_NAME),
                    FILE_READER.readPropertiesOfFile(
                            (new File(PATTERN.getFilePattern(i))), line, num), true);
        }
    }
}
