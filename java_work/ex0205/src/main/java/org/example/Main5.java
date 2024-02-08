package org.example;

/*
enum person{
    int MAN = 1;
    int WOMEN = 2;
}
*/
/*
enum   Animal{
    int DOG = 1;
    int Cat = 2;
}
*/
enum person{
    MAN,WOMAN
}
enum Animal{
    DOG,CAT
}

public class Main5 {
    public static void who(person Person){
        switch (Person) {
            case  MAN:
                System.out.println("남성입니다.");
                break;
            case  WOMAN:
                System.out.println("여성입니다.");
                break;
        }

    }

    public static void main(String[] args) {
            who(person.MAN);
        // who(Animal.DOG);


        }


    }


