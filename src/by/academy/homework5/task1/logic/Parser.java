package by.academy.homework5.task1.logic;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Parser {
    public static final Calendar CALENDAR = Calendar.getInstance();

    public void setPatternForPrint(String nameThatUInclude, String regexForPrint) throws ParseException {
        nameThatUInclude = nameThatUInclude.replaceAll("\\D", "-");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date parsingDate;
        parsingDate = simpleDateFormat.parse(nameThatUInclude);
        System.out.printf(regexForPrint, parsingDate);
    }

    public void setPatternForGetObj(String nameOfType) throws ParseException {
        nameOfType = nameOfType.replaceAll("\\D", "-");
        DateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = dateFormatter.parse(nameOfType);
        CALENDAR.setTime(date);
    }
}
