package by.academy.homework6.task3;

import by.academy.homework6.task3.service.MyIterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        String[][] matrix = {{"Day", "Night", "Midnight"}, {}, {"Java", "C++"}, {"Diamond"}};
        Iterator<String> iterator = new MyIterator<>(matrix);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
