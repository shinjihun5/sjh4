package org.example;

class dbox<L,R>{
    private L l;

    private R r;

    public dbox(L l, R r) {
        this.l = l;
        this.r = r;
    }

    @Override
    public String toString() {
        return "dbox{" +
                "l=" + l +
                ", r=" + r +
                '}';
    }
}

public class main3 {

    public static void main(String[] args) {
        dbox<String,Integer> dbox = new dbox<>("더블박스",1);
        System.out.println(dbox);
    }


}
