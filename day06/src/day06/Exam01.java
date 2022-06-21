package day06;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		* 1,2,3 숫자를 입력했을 때도 선택한 메뉴가 출력되고
		* 햄버거, 콜라,  사이다를 선택 했을 때도 메뉴가 출력되게
		* 할수 있는 방법은 없을까요?
		*/
		
		System.out.print("1 ~ 3번 메뉴를 선택하세요 : ");
		String no = sc.next();
		
		switch(no) {
		case "1":
		case "햄버거":
			System.out.println("햄버거를 선택하셨습니다.");
			break;	
		case "2":
		case "콜라":
			System.out.println("콜라를 선택하셨습니다.");
			break;
		case "3":
		case "사이다":
			System.out.println("사이다를 선택하셨습니다.");
			break;
		default:
			System.out.println("메뉴가 존재하지 않습니다.");
			break;
		}
	}
}








