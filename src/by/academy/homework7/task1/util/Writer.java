package by.academy.homework7.task1.util;

import by.academy.homework7.task1.service.Creator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writer {
    public static final String STOP_WORD = "Stop";

    public void writeFile() {
        try (Scanner scanner = new Scanner(System.in);
             FileWriter fileWriter = new FileWriter(Creator.FILE_PATH, false)) {
            String line = scanner.nextLine();
            while (!line.equals(STOP_WORD)) {
                fileWriter.write(line);
                fileWriter.append('\n');
                line = scanner.nextLine();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
