package org.example.cart;

import java.util.Scanner;

public class CartCLI {
    public void inputitem(){

        Scanner scan = new Scanner(System.in);
        System.out.println("넣고 싶은 상품 번호를 입력하세요.");
        String nm = scan.nextLine();
    }

}
