package org.example;

class user{
    enum Gender{
        MALE,FEMALE
    }
    private String name;

    private Gender gen;

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", gen=" + gen +
                '}';
    }

    public user(String name, Gender gen) {
        this.name = name;
        this.gen = gen;

    }
}

public class Main7 {
    public static void main(String[] args) {
        user 홍길동 = new user("홍길동", user.Gender.MALE);
        user 박여자 = new user("박여자", user.Gender.FEMALE);
        System.out.println(홍길동);
        System.out.println(박여자);
    }

}
