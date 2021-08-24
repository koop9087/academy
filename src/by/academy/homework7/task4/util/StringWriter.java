package by.academy.homework7.task4.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StringWriter {
    public String getStringFromFileText(String fileName) {
        try {
            return new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}
