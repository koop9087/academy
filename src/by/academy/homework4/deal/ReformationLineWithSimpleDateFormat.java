package by.academy.homework4.deal;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class ReformationLineWithSimpleDateFormat {
    public static void reformatLine() throws ParseException {
        Scanner scanner = new Scanner(System.in);                              // вводим строку
        String line = scanner.nextLine();
        line = line.replaceAll("\\D", "-");                   //делаем так, чтобы любой ввод был доступен. Например 21-10.2021
        java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("dd-MM-yyyy");  // приводим наш ввод к типу dd-MM-yyyy
        Date parsingDate;                                                     // парсим и выводим на экран
        parsingDate = format.parse(line);
        System.out.printf("День : <%1$td> %1$nМесяц : <%1$tB>  %1$nГод : <%1$tY>", parsingDate);
    }
}
