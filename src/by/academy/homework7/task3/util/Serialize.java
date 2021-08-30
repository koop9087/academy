package by.academy.homework7.task3.util;

import by.academy.homework7.task3.entity.User;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class Serialize {
    public void serialize(List<User> array) {
        for (int i = 0; i < array.size(); i++) {
            try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(new Pattern().getPatternFile(array, i)))) {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                objectOutputStream.writeObject(array.get(i));
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
