package org.example;

class ebox<T extends Number>{

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}



public class main5 {

    public static void main(String[] args) {
        ebox<Integer> ebox1 = new ebox<>();
        ebox1.setT(100);
        System.out.println(ebox1.getT());
    }
}
