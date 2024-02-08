package org.example;

import java.util.*;

import static java.util.Collection.*;


// 문자열을 정렬할 수 있는 list를 만들어보자.
public class Main {

    public static void main(String[] args) {


        List<String> list = Arrays.asList("BOX", "TOY","ROBOT","WEAPON");
        list = new ArrayList<>(list);

       // Collections.sort(list);
       // Collections.sort(list
      //          ,(a,b) -> ((Car)a).getDisp() -
       //         ((Car)b).getDisp());
       // ;
        System.out.println(list);


    }

}