package xx0109;

import java.util.Scanner;

public class xx8 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		char opt = '0';

		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		score = Integer.parseInt(tmp);

		System.out.printf("", score);

		if (score >= 90) {
			grade = 'A';
			if (score >= 98) {
				opt = '+';
			} else if (score >= 94) {
				opt = '-';
			}
		} else if (score >= 80) {
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score >= 84) {
				opt = '-';
			}
		} else if (score >= 70) {
			grade = 'C';
		}
		if(score < 70) {
			grade = 'D';
		}
		if (opt == '0') 
			
		System.out.println(grade);
			else
			System.out.println(grade + "" + opt);
		}
		
	}


