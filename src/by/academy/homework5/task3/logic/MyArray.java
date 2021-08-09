package by.academy.homework5.task3.logic;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Iterator;

public class MyArray<T> implements Iterable<T> {
    private T[] array;
    private int sizeOfArray;

    public MyArray() {
        super();
    }

    public MyArray(T[] array) {
        this.array = array;
        this.sizeOfArray = array.length;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public int getSizeOfArray() {
        return sizeOfArray;
    }

    public void deleteElementByIndex(int index) {
        if (index == sizeOfArray - 1) {
            array[index] = null;
        } else {
            System.arraycopy(array, index + 1, array, index, sizeOfArray - 1 - index);
            array[sizeOfArray - 1] = null;
        }
        sizeOfArray--;
    }

    public void deleteElementByValue(T obj) {
        for (int i = 0; i < array.length; i++) {
            if (obj.equals(array[i])) {
                deleteElementByIndex(i);
            }
        }
    }

    public void addElement(T obj) {
        if (sizeOfArray >= array.length) {
            array = Arrays.copyOf(array, array.length + 1);
        }
        array[sizeOfArray] = obj;
        sizeOfArray++;
    }

    @Override
    public @NotNull Iterator<T> iterator() {
        return new Iterator<T>() {
            private int currentIndex = -1;

            @Override
            public boolean hasNext() {
                return currentIndex + 1 < sizeOfArray;
            }

            @Override
            public T next() {
                return array[++currentIndex];
            }

            @Override
            public void remove() {
                deleteElementByIndex(currentIndex);
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyArray<?> myArray = (MyArray<?>) o;
        if (sizeOfArray != myArray.sizeOfArray) return false;
        return Arrays.equals(array, myArray.array);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(array);
        result = 31 * result + sizeOfArray;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyArray{");
        sb.append("array=").append(Arrays.toString(array));
        sb.append(", sizeOfArray=").append(sizeOfArray);
        sb.append('}');
        return sb.toString();
    }
}
