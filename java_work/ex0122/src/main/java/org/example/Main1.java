package org.example;

class Man{
    private String name;

    Man(){
        System.out.println("Man 부모 생성자");
    }
    Man(String name){
        this.name = name;
    }
    public void yourName(){
        System.out.println("name = "+ name);
    }
}
class businessMan extends Man{
    private String company;
    private String position;

    businessMan(){
        System.out.println("기본생성자");
    }
    businessMan(String company, String position, String name){
        this();
        System.out.println("다른 생성자");
        this.company = company;
        this.position = position;
    }


    public void yourinfo() {
        System.out.println("company "+ company);
        System.out.println("position "+ position);
        yourName();
    }
}

public class Main1 {
    public static void main(String[] args) {
    businessMan bm1 = new businessMan();
    bm1.yourName();

    }

}
