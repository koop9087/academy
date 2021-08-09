package by.academy.homework6.task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> listArray = new ArrayList<>();
        listArray.add("Петя");
        listArray.add("Вася");
        listArray.add("Петя");
        listArray.add("Вася");
        listArray.add("Галина");
        Set<?> stringSet = createUniqueCollection(listArray);
        stringSet.forEach(System.out::println);
    }
    private static Set<?> createUniqueCollection(Collection<?> collection){
        return Set.copyOf(collection);
    }
}
