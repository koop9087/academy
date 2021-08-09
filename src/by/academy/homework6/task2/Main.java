package by.academy.homework6.task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    static Random random = new Random();
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        LinkedList<Object> linkedList = new LinkedList<>();
        findTimeOfOperation(arrayList,linkedList);
        findTimeOfRandomOperation(arrayList,linkedList);
    }
    private static void findTimeOfOperation(ArrayList<Object> arrayList, LinkedList<Object> linkedList) {
        for (int i = 0; i < 1_000_001; i++){
            arrayList.add(i);
            linkedList.add(i);
        }
    }

    private static void findTimeOfRandomOperation(ArrayList<Object> arrayList, LinkedList<Object> linkedList){
        findTimeOfOperation(arrayList,linkedList);
        long timeForArrayList = System.currentTimeMillis();
        for(int i = 0; i < 100_000; i++){
            arrayList.get(random.nextInt(1_000_001));
        }
        System.out.println("Время затраченное в ArrayList : " + (System.currentTimeMillis() - timeForArrayList));
        long timeForLinkedList = System.currentTimeMillis();
        for(int i = 0; i < 100_000; i++){
            linkedList.get(random.nextInt(1_000_001));
        }
        System.out.println("Время затраченное в LinkedList : " + (System.currentTimeMillis() - timeForLinkedList));
    }
}
//Обьяснение :
//Процесс добавление обьектов в LinkedList по времени больше, чем в ArrayList примерно в 2+ раза
//Это обусловенно тем что, хоть и размерность ArrayList увеличивается в * 2 + 1 раз, LinkedList заполняет ссылки внутреннего класса Node, a ArrayList - нет.
//Взятие случайных элементов по индексу в ArrayList реализован за константное время, в то время как в LinkedList за линейное время
//Плюсы ArrayList - быстрый доступ по индексу, быстрая вставка и удаление элементов с конца
//Минусы ArrayList - медленная вставка и удаление элементов в середину (Из-за сдвига элементов)
//Плюсы LinkedList - быстрое добавление и удаление элементов
//Минусы LinkedList - медленный доступ по индексу (из-за того что приходится перебирать все элементы)