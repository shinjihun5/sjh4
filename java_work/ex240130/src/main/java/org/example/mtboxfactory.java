package org.example;

import javax.swing.*;

public class mtboxfactory {

    public static <T> box<T> makebox(){
    box<T> Box = new box<T>();
    return Box;
    }

//public static void peekbox(box<?> Box){
 //       System.out.println(Box);


    public static void  outbox(box <? extends toy> Box, toy n) {
    toy Tot = Box.getObj();
        System.out.println(Box);
    }
    public static void  inbox(box <? super toy> Box, toy n) {
        Box.setObj(new toy());
    }
}
