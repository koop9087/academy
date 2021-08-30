package by.academy.homework7.task2.util;

import by.academy.homework7.task2.logic.Replacer;
import by.academy.homework7.task2.service.Creator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Writer {
    public static final String SOURCE_PATH_NAME = "src\\io\\homework7\\task2\\text.txt";

    public void write() {               //в этом методе мы просто копируем содержимое из text в result
        new Creator().createFile();
        try (FileOutputStream fileOutputStream = new FileOutputStream(Creator.FILE_PATH);
             FileInputStream fileInputStream = new FileInputStream(SOURCE_PATH_NAME)) {
            int a;
            while ((a = fileInputStream.read()) != -1) {
                fileOutputStream.write(a);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public void writeNewFile() {      //в этом методе мы перезаписываем наш текст, но уже без пробелов
        String line = new Replacer().replace();
        byte[] b = line.getBytes(StandardCharsets.UTF_8);
        try (FileOutputStream fileOutputStream = new FileOutputStream(Creator.FILE_PATH)) {
            fileOutputStream.write(b);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
