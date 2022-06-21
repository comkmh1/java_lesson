package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEx {

	public static void main(String[] args) {
		
		System.out.println("[[성적 집계 프로그램]]");
		String best = "미정";	// 특기과목명 참조할 변수
		Scanner sc = new Scanner(System.in);
		
		int korean = sc.nextInt();
		int english = sc.nextInt();
		int science = sc.nextInt();
		int total = korean + english + science;
		int average =  (korean + english + science) / 3;
		
		System.out.println("국어 -> " + korean);
		System.out.println("영어 -> " + english);
		System.out.println("과학 -> " + science);
		System.out.println("총점은 " + total +" 점 입니다.");
		System.out.println("평균은 " + average + " 점 입니다.");	
		System.out.println("과목수는 3과목 입니다.");
	
		int max;
		if(korean > english) {
			max = korean;
		}
		else {
			max = english;
		}
		if(max < science) {
			max = science;
		}
		
		if(max == korean) {
			 best = "국어";
		}
		else if(max == english) {
			 best = "영어";
		}
		else if(max == science) {
			 best = "과학";
		}
		System.out.printf("이 학생의 특기과목은 %s 입니다.",best);
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
