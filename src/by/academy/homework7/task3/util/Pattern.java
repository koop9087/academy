package by.academy.homework7.task3.util;

import by.academy.homework7.task3.entity.User;

import java.util.List;

public class Pattern {
    public static final String FILE_PATH = "src\\io\\homework7\\task3\\users\\";
    public static final String UNDERSCORE = "_";
    public static final String EXTENDS_NAME = ".txt";

    public String getPatternFile(List<User> array, int i) {
        return FILE_PATH + array.get(i).getName() + UNDERSCORE + array.get(i).getLastName() + EXTENDS_NAME;
    }
}
