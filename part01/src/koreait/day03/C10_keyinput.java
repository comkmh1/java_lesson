package koreait.day03;

import java.util.Scanner;

public class C10_keyinput {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
			
	int data;
	
	System.out.println("정수값 입력하세요. -> ");
	
	data = sc.nextInt();
	System.out.println("입력된 값은 " + data + " 입니다.");
   	
	double point;
	System.out.println("실수값 입력하세요. -> ");
	
	point = sc.nextDouble();
	System.out.println("입력된 값은" + point + " 입니다"); 
		
	
	
	int width;
	int height;
	int box_area;
	double hat,round,circle_area;
	final double PI = 3.14;
	
	System.out.println("[[사각형 도형의 넓이 구하기]]");
	System.out.println("사각형 넓이 입력 -> ");
	width = sc.nextInt();
	System.out.println("사각형 높이 입력 -> ");
	height = sc.nextInt();
	
	box_area = width*height;
	
	
	}

}
/* 표준 출력 : System.out (out은 System 클래스의 정적인 필드)
   표준 입력 : System.in  (out은 System 클래스의 정적인 필드)
      -> Scanner 클래스를 이용해서 입력값을 특정 기본형식으로 변환시키는 기능 사용.
      -> 기본 패키지의 클래스가 아니므로 import 가 필요합니다. 
		*참고: 기본패키지 java.lang은 import 없이 사용합니다.
*/
