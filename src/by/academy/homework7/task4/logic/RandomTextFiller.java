package by.academy.homework7.task4.logic;

import by.academy.homework7.task2.util.Writer;
import by.academy.homework7.task4.service.Creator;
import by.academy.homework7.task4.util.*;

import java.io.File;

public class RandomTextFiller {
    public static final CountCalculator COUNT_CALCULATOR = new CountCalculator();
    public static final Randomizer RANDOM_NUM = new Randomizer(COUNT_CALCULATOR.getCountLetters());
    public static final Pattern PATTERN = new Pattern();
    public static final StringWriter STRING_WRITER = new StringWriter();
    public static final CustomFileWriter WRITER = new CustomFileWriter();
    public static final CustomToString CUSTOM_TO_STRING = new CustomToString();
    public static final int COUNT_OF_FILES = 100;

    public void fill() {
        for (int i = 0; i <= COUNT_OF_FILES; i++) {
            String text = STRING_WRITER.getStringFromFileText(Writer.SOURCE_PATH_NAME);
            int num = RANDOM_NUM.getRandomNumber();
            String line = text.substring(RANDOM_NUM.getRandomNumber());
            WRITER.write(PATTERN.getFilePattern(i), text);
            WRITER.writeForTxt(Creator.PATTERN_FOR_RESULT_FILE, CUSTOM_TO_STRING.getStringFromFile((new File(PATTERN.getFilePattern(i))), line, num));
        }
    }
}
