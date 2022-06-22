package koreait.ext;

import java.util.Scanner;

public class BinaryTest2 {
	public static void main(String[] args) {
		
		int n10 = 123;
		int n16 = 0xa41c; 	//16진수 표기 0x로 시작합니다.
		int n2 = 0b1010010000011100;	// 2진수 표기	0b로 시작합니다.
		
		System.out.println("1. 변수를 그대로 출력");
		System.out.println("10진수 리터럴 : " + n10);
		System.out.println("16진수 리터럴 : " + n16);	//정수값 출력은 format 지정 안하면 10진수로 나옵니다.
		System.out.println("2진수 리터럴 : " + n2);
		
		System.out.println("2. format 지정");
		System.out.println(String.format("%x", n2));	//16진수 형식 %x
		System.out.println(String.format("%x", n16));
		
		//결론 :10진수 42012, n16과 n2 변수 값이 메모리에 저장될때는 모두 동일한 0,1 표현값입니다.
	
		System.out.println("3. -1의 2진수, 16진수 표현 확인");
		n16 = 0xffffffff;
		System.out.println("16진수 0xffffffff : " + n16);		//-1
		System.out.printf("-1은 16진수%x\n",-1);
		System.out.println("-1은 2진수 : " + Integer.toBinaryString(-1));
		
		System.out.println("4. 입력한 2진수 또는 16진수값을 10진수로 바꾸어 드립니다.");
		Scanner sc = new Scanner(System.in);
		System.out.println("2진수 값 입력 >>> ");
		String t2 = sc.nextLine();
		System.out.println("16진수 값 입력 >>>");
		String t16 = sc.nextLine();
		//원래는 integer.parstInt(s)는 s문자열이 10진수 표현이라는 의미입니다.
		System.out.println(String.format("2진수 %s 는 10진수 %d 입니다." ,t2,Integer.parseInt(t2,2)));	//t2는 2진수이다  
		System.out.println(String.format("16진수 %s 는 10진수 %d 입니다." ,t16,Integer.parseInt(t16,16))); //t16은 16진수이다.
		
		//n진법 문자열 -> 10진 정수값 변환 Integer.parseInt(문자열,n)
		//10진 정수갑갑 -> n진법 문자열 Integer.toBinaryString 메소드, toHexString 메소드
		
		//format 에서 %d는 10진수, %x는 16진수, %o는 8진수 , 2진수는 포멧형색이 없습니다.
		
		//2진수의 비트 연산 : %, |, ^, ~, >>, << 등등 
		
	}
}
