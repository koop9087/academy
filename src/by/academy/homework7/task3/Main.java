package by.academy.homework7.task3;

import by.academy.homework7.task3.entity.User;
import by.academy.homework7.task3.service.Creator;
import by.academy.homework7.task3.util.Serialize;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> array = new ArrayList<>();
        array.add(new User("Саша", "Петров", 10));
        array.add(new User("Витя", "Галкин", 12));
        array.add(new User("Игорь", "Смирнов", 13));
        array.add(new User("Паша", "Викторов", 9));
        array.add(new User("Наташа", "Шарикова", 15));
        array.add(new User("Маша", "Котикова", 12));
        array.add(new User("Даша", "Берёзкина", 10));
        array.add(new User("Семен", "Круглов", 16));
        array.add(new User("Джон", "Галт", 20));
        array.add(new User("Юра", "Веревкин", 19));
        Creator creator = new Creator();
        creator.createDirectory();
        creator.createFiles(array);
        Serialize serialize = new Serialize();
        serialize.serialize(array);
    }
}
