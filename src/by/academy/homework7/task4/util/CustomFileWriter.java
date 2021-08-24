package by.academy.homework7.task4.util;

import java.io.FileWriter;
import java.io.IOException;

public class CustomFileWriter {
    public void write(String pathName, String line) {                                  //этот метод предназначен для фаилов от 1 - 100
        try (FileWriter writer = new FileWriter(pathName, false)) {
            writer.write(line);
            writer.append("\n");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public void writeForTxt(String pathName, String line) {                           //этот метод предназначен конкретно для фаила result.txt
        try (FileWriter writer = new FileWriter(pathName, true)) {            //потому что по моей идее фаилы от 1 до 100 не должны быть перезаписаны
            writer.write(line);                                                       //перезапись фаилов идет чтобы увидеть динамику размера.
            writer.append("\n");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
