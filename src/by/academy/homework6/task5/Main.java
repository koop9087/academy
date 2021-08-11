package by.academy.homework6.task5;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static final String EXAMPLE_TEXT = "Я иду по улице. Улица идет вдоль реки. Река идет вдоль моря! Море, же, вдоль  океана?";

    public static void main(String... args) {
        int count = 1;
        Map<Character, Integer> diary = new HashMap<>();
        String[] str = EXAMPLE_TEXT.split("");
        for (int i = 0; i < str.length; i++) {
            for(int j = 1; j < str.length;j++){
                if(str[i].equals(str[j])){
                    count++;
                }
            }
            diary.put(str[i].charAt(0),count);
            count = 0;
        }
        System.out.println(diary);
    }
}
