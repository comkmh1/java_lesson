package day05;

import java.util.Scanner;

public class ConditionIF {

	public static void main(String[] args) {
		System.out.println("조건문이 시작하기 전!!!");
		if(11 < 10) {
			System.out.println("if문 안의 출력문 1");
			System.out.println("if문 안의 출력문 2");
		} else {
			System.out.println("else문 안의 출력문 1");
			System.out.println("else문 안의 출력문 2");
		}
		System.out.println("조건문이 종료하고 나서!!!");
		System.out.println("========================");
		
		// 정수 한개를 입력 받아 이 정수가 짝수라면 짝수인지 출력하기
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("정수 한개를 입력해주세요 : ");
//		
//		int num = sc.nextInt();
//		if(num % 2 == 0) {
//			System.out.println("짝수 입니다.");
//		} else {
//			System.out.println("홀수 입니다.");
//		}

//		if(num % 2 == 1) {
//			System.out.println("홀수 입니다.");
//		}
		
		// 사용자가 입력한 값이
		// 3의 배수면 3의 배수입니다.
		// 4의 배수면 4의 배수입니다.
		// 출력하기..

//		System.out.print("정수 한개를 입력해주세요 : ");
//		int number = sc.nextInt();
//
//		if(number % 3 == 0) {
//			System.out.println("3의 배수입니다.");
//		}
//		
//		if(number % 4 == 0) {
//			System.out.println("4의 배수입니다.");
//		}
		
		int score = 72; 
		if(score < 60) {
			System.out.println("F 학점입니다");
		} else if(score >= 60 && score < 70) {
			System.out.println("D 학점입니다.");
		} else if(score >= 70 && score < 80) {
			System.out.println("C 학점입니다.");
		} else if(score >= 80 && score < 90) {
			System.out.println("B 학점입니다.");
		} else {	// score > 90 
			System.out.println("A 학점입니다.");
		}		
	}
}












