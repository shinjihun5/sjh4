package org.example;


class apple{
    private String name;

    public apple(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "apple{" +
                "name='" + name + '\'' +
                '}';
    }
}

class orange{
    private String name;

    public orange(String name) {
        this.name = name;
    }
}

class box<A>{
    public box(A obj) {
        this.obj = obj;
    }
public box(){}
    private A obj;

    public A getObj() {
        return obj;
    }

    public void setObj(A obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "box{" +
                "obj=" + obj +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {


        box<apple> Box1 = new box();
        Box1.setObj(new apple("사과"));

        box<orange> Box2 = new box();
        Box2.setObj(new orange("오렌지"));

        apple Apple = Box1.getObj();
        orange Orange = Box2.getObj();

        System.out.println(Apple);
        System.out.println(Orange);

    }
}