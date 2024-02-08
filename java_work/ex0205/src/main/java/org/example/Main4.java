package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main4 {


    public static void main(String[] args) {

        List<String> list = Arrays.asList("BOX", "ROBOT", "APPLE");
        list = new ArrayList<>(list);

        List<String> copylist = new ArrayList<>(list);

        Collections.copy(list,copylist);
//        Collections.copy(list,copylist);

        System.out.println(copylist);

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("BOX")){
                System.out.println(list.get(i));
            }
        }

        Collections.sort(list);
        System.out.println();

        int idx = Collections.binarySearch(list,"APPLE");
        System.out.println(idx);

        System.out.println(list.get(idx));

    }
}
