package by.academy.homework5.task3;

import by.academy.homework5.task3.logic.MyArray;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{1, 2, 3, 4, 5};
        MyArray<Integer> array = new MyArray<>(numbers);
        Iterator<Integer> iterator = array.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
