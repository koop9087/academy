package by.academy.homework7.task4.util;

import java.io.FileWriter;
import java.io.IOException;

public class CustomFileWriter {
    public void write(String pathName, String line, boolean append) {
        try (FileWriter writer = new FileWriter(pathName, append)) {
            writer.write(line);
            writer.append("\n");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}