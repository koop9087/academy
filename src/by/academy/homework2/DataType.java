package by.academy.homework2;

import java.util.Scanner;

public class DataType {
    private static final Scanner scanner = new Scanner(System.in);

    public static void determinateDataType() {
        String dataType = scanner.nextLine();
        String valueOfDataType = scanner.nextLine();
        scanner.close();
        switch (dataType) {
            case "int":
                System.out.println(Integer.parseInt(valueOfDataType) % 2);
                break;
            case "double":
                System.out.println(Double.parseDouble(valueOfDataType) * 0.7d);
                break;
            case "float":
                System.out.println(Math.pow(Float.parseFloat(valueOfDataType), 2));
                break;
            case "char":
                System.out.println(Character.getNumericValue(valueOfDataType.charAt(0)));
                break;
            case "String":
                System.out.println("Hello " + valueOfDataType);
                break;
            default:
                System.out.println("Unsupported type");
        }
    }
}