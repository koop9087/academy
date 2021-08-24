package by.academy.homework7.task4;

import by.academy.homework7.task4.logic.CountCalculator;
import by.academy.homework7.task4.logic.RandomTextFiller;
import by.academy.homework7.task4.service.Creator;

public class Main {
    public static void main(String[] args) {
        Creator creator = new Creator();
        creator.createDirectory();                  //создали папку task4
        creator.createFiles();                      //создали 100 фаилов .txt
        creator.createResultFile();                 // создали фаил где будет записываться результат
        CountCalculator countCalculator = new CountCalculator();
        countCalculator.getCountLetters();          //узнали количество символов в нашем Lorem Ipsum
        RandomTextFiller randomFiller = new RandomTextFiller();
        randomFiller.fill();                        //заполнили 100 фаилов текстом (string.substring) и наш result.txt
    }
}
