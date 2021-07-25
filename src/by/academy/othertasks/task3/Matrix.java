package by.academy.othertasks.task3;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    private static final int MAX_VALUE = 100;
    private static final int MAX_VALUE_OF_MATRIX_VALUE = 50;
    private static final Random random = new Random();
    private int[][] array;
    private int line;
    private int column;

    static {
        System.out.println("< Работа с матрицами >");
    }

    public Matrix(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public void setArray(int[][] array) {
        this.array = array;
    }

    public int[][] getArray() {
        return array;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getLine() {
        return line;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getColumn() {
        return column;
    }

    public int[][] additionWithTheMatrix(int[][] array) {
        int[][] newArray = fillingTheMatrix(getLine(),getColumn());
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                newArray[i][j] = newArray[i][j] + array[i][j];
            }
        }
        return newArray;
    }

    public int[][] multiplicationTheMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array[i][j] * random.nextInt(MAX_VALUE);
            }
        }
        return array;
    }

    public void printTheMatrix(int[][] array) {
        System.out.println(Arrays.deepToString(array));
    }

    public static int[][] fillingTheMatrix(int line, int column) {
        int[][] array = new int[line][column];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(MAX_VALUE_OF_MATRIX_VALUE);
            }
        }
        return array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        Matrix matrix = (Matrix) o;
        return array != null ? Arrays.deepEquals(array, matrix.array) : matrix.array == null
                && line == matrix.line
                && column == matrix.column;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result += result * prime + (array != null ? array.hashCode() : 0);
        result += result * prime + line;
        result += result * prime + column;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Matrix{");
        sb.append("array=").append(Arrays.toString(array));
        sb.append(", line=").append(line);
        sb.append(", column=").append(column);
        sb.append('}');
        return sb.toString();
    }
}
