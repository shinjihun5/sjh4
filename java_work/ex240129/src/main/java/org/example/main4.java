package org.example;

class  mbox<T>{
    private T t;

    public mbox(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "mbox{" +
                "t=" + t +
                '}';
    }
}
public class main4 {

    public static void main(String[] args) {

        mbox<String> Mbox = new mbox<>("i am so happy");
        System.out.println(Mbox);

        mbox<mbox<String>> mmbox = new mbox<mbox<String>>(Mbox);
        System.out.println(mmbox);
    }

}
