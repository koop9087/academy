package by.academy.homework5.task2;

import java.util.Arrays;

public class ParametryArray<T> {
    private T[] arrayObjects;
    private int sizeOfArray;

    public ParametryArray() {
        this.sizeOfArray = 16;
    }

    public ParametryArray(int sizeOfArray) {
        this.sizeOfArray = sizeOfArray;
    }

    public void addElement(T obj) {
        if (sizeOfArray >= arrayObjects.length) {
            arrayObjects = Arrays.copyOf(arrayObjects, arrayObjects.length + 1);
        }
        arrayObjects[sizeOfArray] = obj;
        sizeOfArray++;
    }

    public T getElementFromIndex(int index) {
        return index >= 0 && index < sizeOfArray ? arrayObjects[index] : null;
    }

    public T getLastElement() {
        return arrayObjects[sizeOfArray - 1] != null ? arrayObjects[sizeOfArray - 1] : null;
    }

    public T getFirstElement() {
        return arrayObjects[0] != null ? arrayObjects[0] : null;
    }

    public void printArrayLength() {
        System.out.println("Array length" + sizeOfArray);
    }

    public void printIndexOfLastFilledElement() {
        System.out.println("Last filled element" + sizeOfArray);
    }

    public void deleteElementByIndex(int index) {
        if (index == sizeOfArray - 1) {
            arrayObjects[index] = null;
        } else {
            System.arraycopy(arrayObjects, index + 1, arrayObjects, index, sizeOfArray - 1 - index);
            arrayObjects[sizeOfArray - 1] = null;
        }
        sizeOfArray--;
    }

    public void deleteElementByValue(T obj) {
        for (int i = 0; i < arrayObjects.length; i++) {
            if (obj.equals(arrayObjects[i])) {
                deleteElementByIndex(i);
            }
        }
    }

    public T[] getArrayObjects() {
        return arrayObjects;
    }

    public void setArrayObjects(T[] arrayObjects) {
        this.arrayObjects = arrayObjects;
    }

    public int getSizeOfArray() {
        return sizeOfArray;
    }

    public void setSizeOfArray(int sizeOfArray) {
        this.sizeOfArray = sizeOfArray;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParametryArray<?> that = (ParametryArray<?>) o;
        if (sizeOfArray != that.sizeOfArray) return false;
        return Arrays.equals(arrayObjects, that.arrayObjects);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(arrayObjects);
        result = 31 * result + sizeOfArray;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ParametryArray{");
        sb.append("arrayObjects=").append(Arrays.toString(arrayObjects));
        sb.append(", sizeOfArray=").append(sizeOfArray);
        sb.append('}');
        return sb.toString();
    }
}
