package xx0110;

import java.util.Scanner;

public class xx11 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        
        for(Character c : a.toCharArray()){
        	// if 입력된 c값 문자열에 대문자들이 ture이라는 뜻 
        	// 즉 대문자들이 소문자들로 변환(lowercase)
        	if(Character.isUpperCase(c)){ // 
                answer += Character.toLowerCase(c);
            }
        	// 반대로 소문자들이 있을경우 대문자들로 변환
            else if(Character.isLowerCase(c)){
                answer += Character.toUpperCase(c);
            }
        } 
        System.out.println(answer);
    }
}