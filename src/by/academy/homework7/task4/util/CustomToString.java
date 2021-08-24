package by.academy.homework7.task4.util;

import java.io.File;

public class CustomToString {
    public String getStringFromFile(File file, String name, int num) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getName()).append(" ");
        sb.append(num).append(" ");
        sb.append(file.getTotalSpace()).append(" ");
        sb.append(name).append(" ");
        return sb.toString();
    }
}
