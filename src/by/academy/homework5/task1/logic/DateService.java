package by.academy.homework5.task1.logic;

import by.academy.homework5.task1.entity.MyDate;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Calendar;

public class DateService {
    public static final Calendar CALENDAR = Parser.CALENDAR;
    public static final int DAYS_IN_MONTH = 30;
    public static final int DAYS_IN_YEAR = 365;
    public static final String REGEX_TO_PARSE_DAY = "%1$nДень : <%1$td>";
    public static final String REGEX_TO_PARSE_MONTH = "%1$nМесяц : <%1$tB>";
    public static final String REGEX_TO_PARSE_YEAR = "%1$nГод : <%1$tY>";
    Parser parse = new Parser();

    public void allDaysInOurDate(MyDate myDate) {
        String date = myDate.getOurDate();
        date = date.replaceAll("\\D", "-");
        String[] ourDateArray = date.split("-");
        String timeNow = LocalDate.now().toString();
        String[] timeNowArray = timeNow.split("-");
        int years = Integer.parseInt(timeNowArray[0]) - Integer.parseInt(ourDateArray[2]);
        int months = Integer.parseInt(timeNowArray[1]) - Integer.parseInt(ourDateArray[1]);
        int days = Integer.parseInt(timeNowArray[2]) - Integer.parseInt(ourDateArray[0]);
        System.out.println((years * DAYS_IN_YEAR) + (months * DAYS_IN_MONTH) + days);
    }

    public String createOurDayWithConcat(String line) throws ParseException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getOurYear(line)).append("-");
        stringBuilder.append(getOurMonth(line)).append("-");
        stringBuilder.append(getOurDay(line));
        return stringBuilder.toString();
    }

    public boolean isLeapYear(String myDate) throws ParseException {
        parse.setPatternForGetObj(myDate);
        return CALENDAR.getActualMaximum(Calendar.DAY_OF_YEAR) > DAYS_IN_YEAR;
    }

    public void printCountOfDays(String myDate) throws ParseException {
        parse.setPatternForGetObj(myDate);
        int countOfDay = CALENDAR.get(Calendar.DAY_OF_WEEK);
        System.out.println(countOfDay - 1);                                                              // -1 потому что рассчет дней идет с воскресенья
    }

    public void printDayInWeek(String myDay) throws ParseException {
        parse.setPatternForGetObj(myDay);
        System.out.println(CALENDAR.get(Calendar.DAY_OF_WEEK) - 1);
    }

    public int getOurDay(String myDate) throws ParseException {
        parse.setPatternForGetObj(myDate);
        return CALENDAR.get(Calendar.DAY_OF_MONTH);
    }

    public int getOurMonth(String myDate) throws ParseException {
        parse.setPatternForGetObj(myDate);
        return CALENDAR.get(Calendar.MONTH) + 1;
    }

    public int getOurYear(String myDate) throws ParseException {
        parse.setPatternForGetObj(myDate);
        return CALENDAR.get(Calendar.YEAR);
    }

    public void printOurYear(String line) throws ParseException {
        parse.setPatternForPrint(line, REGEX_TO_PARSE_YEAR);
    }

    public void printOurMonth(String line) throws ParseException {
        parse.setPatternForPrint(line, REGEX_TO_PARSE_MONTH);
    }

    public void printOurDay(String line) throws ParseException {
        parse.setPatternForPrint(line, REGEX_TO_PARSE_DAY);
    }
}
