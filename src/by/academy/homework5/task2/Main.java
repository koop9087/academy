package by.academy.homework5.task2;

import by.academy.homework5.task2.logic.ParametryArray;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[16];
        ParametryArray<Object> array = new ParametryArray<>(arr);
        array.addElement(70);
        array.addElement(50);
        array.addElement(9);
        array.deleteElementByIndex(2);
        array.deleteElementByValue(50);
        System.out.println(array.getFirstElement());
        System.out.println(array.getLastElement());
    }
}
