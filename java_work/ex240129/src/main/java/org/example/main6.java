package org.example;

public class main6 {

    public static <T> box<T> makebot(T o){
        return  new box<T>(o);
    }

    public static void main(String[] args) {
        box<String> sbox = makebot("sweet");
        System.out.println(sbox);

        box<Integer> ibox = makebot(100);
        System.out.println(ibox);
        System.out.println(makebot("문자열"));

    }
}
