package by.academy.homework5.task1;

import by.academy.homework5.task1.logic.DateService;
import by.academy.homework5.task1.entity.MyDate;
import by.academy.homework5.task1.util.CustomScanner;
import by.academy.homework5.task1.util.Valid;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        CustomScanner scanner = new CustomScanner();
        String line = scanner.scanLine();                                            // сохраняем нашу вводимую строку в переменную
        MyDate myDate = new MyDate(line);                                           // создаем обьект класса MyDate
        DateService tr = new DateService();                                         // создаем обьект класса DateService
        System.out.println(tr.createOurDayWithConcat(line));                        // преобразуем в дату наши данные, полученные из методов
        Valid valid = new Valid(line);
        System.out.println(valid.validate());                                       // проверка на формат dd-mm-yyyy
        tr.allDaysInOurDate(myDate);                                                // дни в заданном промежутке
        tr.printDayInWeek(line);                                                    // выводим на экран день недели
        System.out.println(tr.isLeapYear(line));                                    // проверка на високосный год
    }
}
