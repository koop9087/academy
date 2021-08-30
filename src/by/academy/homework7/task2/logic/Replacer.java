package by.academy.homework7.task2.logic;

import by.academy.homework7.task2.service.Creator;
import by.academy.homework7.task2.util.Reader;

public class Replacer {
    public String replace() {                       //удаляем все пробелы из нашего текста
        return new Reader().readFile(Creator.FILE_PATH).replaceAll(" ", "");
    }
}
