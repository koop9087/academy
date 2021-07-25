package by.academy.othertasks.task3;

public class Main {
    public static void main(String[] args) {
        int[][] array = Matrix.fillingTheMatrix(5, 5);
        Matrix firstMatrix = new Matrix(5, 5);
        array = firstMatrix.multiplicationTheMatrix(array);
        firstMatrix.printTheMatrix(array);
    }
}
