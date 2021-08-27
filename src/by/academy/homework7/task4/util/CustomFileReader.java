package by.academy.homework7.task4.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CustomFileReader {
    public String readStringFromFile(String fileName) {
        String line = null;
        try {
            line = new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return line;
    }

    public String readPropertiesOfFile(File file, String name, int num) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getName()).append(" ");
        sb.append(num).append(" ");
        sb.append(file.getTotalSpace()).append(" ");
        sb.append(name).append(" ");
        return sb.toString();
    }
}
