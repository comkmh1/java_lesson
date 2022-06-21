package koreait.day03;

import java.util.Scanner;

public class C12_ConditionOp {
//조건식의 결과에 따라 명령을 선택하는 조건연산자 : 조건식? 값/수식T 
	public static void main(String[] args) {
		int korean, math; //국어점수, 수학점수
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 입력 ->");
		korean = sc.nextInt();
		System.out.println("수학 점수 입력 ->");
		math = sc.nextInt();
		
		//국어점수와 수학점수 모두 80점 이상인가? ->모범학생
		System.out.println("모범학생 ? " + ((korean>=80 && math>=80)? "맞습니다.":"아닙니다."));
		
//		if: 처리하는 명령을 제어하는 조건문
//		{}안에 들어가는 명령이 1개일 때는 생략할 수 있습니다.
		if(korean >= 80 && math >= 80) {  
			//조건식이 참일 때 실행하는 명령들 
			System.out.println("맞습니다");
		} 
		else {
			// 조건식이 거짓일 때 실행하는 명령들
			System.out.println("아닙니다.");
		}
		if(korean>=90 || math >=90)
			System.out.println("맞습니다");
		else
			System.out.println("아닙니다.");
		

//		else { } 에 해당하는 내용이 없으면 작성 안합니다.
		
			
		
	}

}
