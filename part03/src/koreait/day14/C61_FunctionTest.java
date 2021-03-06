package koreait.day14;

import java.util.Random;
import java.util.Scanner;

public class C61_FunctionTest {

	public static void main(String[] args) {
		
		// 1) 익명 클래스
		FunctionA fa = new FunctionA() {
			@Override
		public int methodA(int a, int b) {
			System.out.println("a*b=");
				return a*b;
		}
		};	
		System.out.println(fa.methodA(23,11));
//		2)람다식 : 추상메소드가 1개일 떄 가능 즉 함수형 인터페이스만 표현이 가능합니다.
		fa = (int a, int b) -> {
			System.out.println("a+b =");
			return a+b;
		};
		System.out.println(fa.methodA(23,11));
		
	fa = (int max, int min) -> {
	//min ~max 범위의 난수를 만들어서 리턴합니다.
		Random r = new Random();
		return r.nextInt(max-min+1)+min;
	};
		
	System.out.println(fa.methodA(99,11));
	
	
	
	}
}
