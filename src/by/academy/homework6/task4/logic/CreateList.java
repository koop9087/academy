package by.academy.homework6.task4.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateList {
    public static final Random RANDOM = new Random();
    private List<Integer> markList = new ArrayList<>();
    private int size;

    public CreateList(int size) {
        this.size = size;
    }

    public void createListWithPeopleMarks() {
        for (int i = 0; i <= size; i++) {
            markList.add(RANDOM.nextInt(10) + 1);
        }
    }

    public List<Integer> getMarkList() {
        return markList;
    }
}
