package org.example;

enum person{

    MAN(10,"김길동"),WOMAN(20,"이순자");
    private int age;
    private String name;


    person(int age,String name) {
        this.age = age;
        this.name = name;
        System.out.println("생성자 호출");
    }

    @Override
    public String toString() {
        return "person age "+age+" person name "+name;
    }
}



public class Main {
    public static void main(String[] args) {
        System.out.println(person.MAN);
        System.out.println(person.WOMAN);
    }


}