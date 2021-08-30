package by.academy.homework7.task3.service;

import by.academy.homework7.task3.entity.User;
import by.academy.homework7.task3.util.Pattern;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Creator {

    public void createDirectory() {
        File file = new File(Pattern.FILE_PATH);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public void createFiles(List<User> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            File file = new File(new Pattern().getPatternFile(arrayList, i));
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}