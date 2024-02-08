package org.example;

import java.io.PipedReader;

class  A1{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public A1(){}
    public A1(String name) {
        this.name = name;
    }
    public  String toString() {
            return "A1{name= '"+ name + '\'' +
                    '}';
    }

}

public class Main2 {

    public static void main(String[] args) {
        A1 a1 = new A1("A1");
        System.out.println(a1);

        A1 a11 = new A1();
        a11.setName("a11");
        System.out.println(a11);
    }
}
