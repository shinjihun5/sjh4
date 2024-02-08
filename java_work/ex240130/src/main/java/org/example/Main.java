package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        box<String> box = new box<>();
        box.setObj("String 넣었어");

        System.out.println(box);

        List<box<String>> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            box.setObj("String 넣었어");
            list.add(box);

        }
        list.get(0).setObj("바뀜");
        System.out.println(list);
    }
}