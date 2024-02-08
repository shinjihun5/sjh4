package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("ROBOT","APPLE","BANANA");
        list = new ArrayList<>(list);

/*
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
*/
        Comparator<String> comp = (o1, o2) -> o1.length() - o2.length();
        Collections.sort(list,comp);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            System.out.println();



            list.stream().forEach(s -> System.out.println(s));
        }


    }
}