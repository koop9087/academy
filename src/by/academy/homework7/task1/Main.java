package by.academy.homework7.task1;

import by.academy.homework7.task1.service.Creator;
import by.academy.homework7.task1.util.Writer;

public class Main {
    public static void main(String[] args) {
        Creator creator = new Creator();
        creator.createDirAndFile();
        Writer writer = new Writer();
        writer.writeFile();
    }
}
