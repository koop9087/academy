package by.academy.homework6.task4.service;

import by.academy.homework6.task4.logic.CreateList;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FindHighestMark {
    private Scanner scanner = new Scanner(System.in);
    private CreateList ourDiaryMark = new CreateList(scanner.nextInt());
    private int temp;

    public int getHighestMark() {
        ourDiaryMark.createListWithPeopleMarks();
        List<Integer> integerArrayList = ourDiaryMark.getMarkList();
        temp = integerArrayList.get(0);
        Iterator<Integer> iterator = integerArrayList.iterator();
        try{
            while (iterator.hasNext()) {
                if (temp < iterator.next()) {
                    temp = iterator.next();
                }
            }
        }
        catch (NoSuchElementException e){
            System.out.println("Введите другое количество учеников");
        }
        return temp;
    }
}
