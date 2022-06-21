package day05;

import java.util.Scanner;

public class HomeworkExp {
	public static void main(String[] args) {
		/* 1.
		 * 노래 한곡당 300원인 코인 노래방에서 사용자에게 금액을 입력 받은 후 
		 * 부를 수 있는 곡수와 잔돈을 출력한다. 
		 * 
		 * 얼마를 넣겠습니까? :
		 * 1600 부를수 있는 노래는 5곡이고, 잔돈은 100원 입니다.
		 */
		// 이준엽
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("얼마를 넣겠습니까? : ");
//
//		int song = sc.nextInt();
//		int value = song / 300;
//		int rest = song % 300;
//
//		System.out.printf("부를 수 있는 노래는 " + value + "곡이고,");
//		System.out.printf("잔돈은 " + rest + "원 입니다.");
//		
//		System.out.println();
//		System.out.println("=================================");
		
		/* 2.
		 * 10~99 사이의 숫자를 입력 받아서 십의 자리와 일의 자리를 출력한다.
		 * 
		 * 10~99 사이의 정수를 입력하세요 : 98
		 * 십의자리 : 9
		 * 일의자리 : 8
		 */
		
		// 주효명
		System.out.print("10 ~ 99 사이의 숫자를 입력하세요 : ");

		int input = sc.nextInt();
		int tens = input / 10;
		int units = input % 10;

		System.out.printf("십의자리 : %d\n", tens);
		System.out.printf("일의자리 : %d\n", units);

		System.out.println("=================================");

		/* 3.
		 * 사용자에게 국어 영어 수학점수를 입력 받아 당신의 평균은 ???점 입니다.
		 * (단, 점수들은 정수로 받아온다.)
		 * 
		 * 국어점수 : 90
		 * 영어점수 : 50
		 * 수학점수 : 70
		 * 당신의 평균 점수는 70점
		 */

		// 황지민
		System.out.print("국어점수 : ");
		int score = sc.nextInt();

		System.out.print("영어점수 : ");
		int score2 = sc.nextInt();

		System.out.print("수학점수 : ");
		int score3 = sc.nextInt();

		int scoreA = (score + score2 + score3) / 3;

		System.out.println("당신의 평균 점수는 " + scoreA + "점");
	}
}
