package by.academy.homework6.task3.Service;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIterator<T> implements Iterator<T> {

    private T[][] array;
    private int size;
    private int cursor = 0;
    private int line = 0;
    private int column = 0;

    public MyIterator(T[][] array) {
        this.array = array;
        this.size = countElements(array);
    }

    private int countElements(T[][] array) {
        int count = 0;
        for (T[] row : array) {
            count += row.length;
        }
        return count;
    }

    @Override
    public boolean hasNext() {
        return cursor < size;
    }

    @Override
    public T next() {
        if (cursor >= size) {
            throw new NoSuchElementException();
        }
        T element = array[line][column];
        cursor++;
        column++;
        while (line < array.length && column >= array[line].length) {
            column = 0;
            line++;
        }
        return element;
    }
}
