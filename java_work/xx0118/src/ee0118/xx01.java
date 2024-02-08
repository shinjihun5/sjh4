package ee0118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class xx01 {

		 public static void main(String[] args) {
			 String[] animals = {"monkey", "zebra", "rabbit"};
		        List<String> remainingAnimals = new ArrayList<>(Arrays.asList(animals));

		        int attempts = 0; // 시도 횟수 초기화

		        // 게임 반복
		        while (!remainingAnimals.isEmpty()) {
		            // 랜덤으로 동물 선택
		            Random random = new Random();
		            int randomIndex = random.nextInt(remainingAnimals.size());
		            String selectedAnimal = remainingAnimals.get(randomIndex);

		            // 동물에 따른 힌트 선택
		            String hint = getHint(selectedAnimal);

		            // 힌트 출력
		            System.out.println("힌트: " + hint);

		            // 사용자 입력 받기
		            Scanner scanner = new Scanner(System.in);
		            System.out.print("동물을 맞춰보세요: ");
		            String userGuess = scanner.nextLine();

		            // 정답 확인 및 결과 출력
		            if (userGuess.equalsIgnoreCase(selectedAnimal)) {
		                System.out.println("정답입니다! 축하합니다.");
		                // 맞춘 동물을 남은 동물 리스트에서 제거
		                remainingAnimals.remove(selectedAnimal);
		            } else {
		                System.out.println("틀렸습니다. 다시 시도해보세요.");
		            }

		            attempts++; // 시도 횟수 증가
		        }

		        // 게임 종료 메시지
		        System.out.println("모든 동물을 맞추셨습니다. 게임 종료!");
		        System.out.println("총 시도 횟수: " + attempts);
		    }

		    private static String getHint(String animal) {
		        switch (animal) {
		            case "monkey":
		                return "바나나를 좋아한다";
		            case "zebra":
		                return "줄무늬가 있다";
		            case "rabbit":
		                return "귀가 길다";
		            default:
		                return "힌트 없음";
		        }
		    }
		}