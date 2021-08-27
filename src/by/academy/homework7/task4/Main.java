package by.academy.homework7.task4;

import by.academy.homework7.task4.service.CustomFileService;
import by.academy.homework7.task4.util.CustomFileCreator;

public class Main {
    public static void main(String[] args) {
        CustomFileCreator creator = new CustomFileCreator();
        creator.createDirectory();                                                       //создали папку task4
        creator.createFiles(100);                                                  //создали 100 фаилов .txt
        creator.createResultFile();                                                     // создали фаил где будет записываться результат
        CustomFileService customFileService = new CustomFileService();
        System.out.println(customFileService.findCountOfSymbols());                     //узнали количество символов в нашем Lorem Ipsum
        customFileService.randomFill(100);                                        //заполнили 100 фаилов текстом (string.substring) и наш result.txt
    }
}
