package day07;

import java.util.Scanner;

public class HomeworkExp {
	public static void main(String[] args) {
		// 1. 
		// 구구단 2~9단 출력하기
		// ------ 2단 -------
		// 2 x 1 = 2
		// .....
		// 2 x 9 = 18
		// ------ 3단 -------
		// 3 x 1 = 3
		// .....
		// 3 x 9 = 27

		// 전기홍
//		for (int i = 2; i < 10; i++) {
//			System.out.println("-----"+ i + "단" + "-----");
//			for (int j = 1; j < 10; j++) {
//				int result = i * j;
//				System.out.println(i + " x " + j + " = " + result);
//				
//			}
//		}

		/* 2.
		 * 반복문을 사용하고 1 ~ 100중 하나의 값을 입력받아
		 * 1부터 입력된 숫자까지 총합을 구하는 반복문을 만드시요.
		 * 
		 * 1 ~ 100까지의 숫자중 하나를 입력하세요 : 10
		 * 1에서 10까지의 총합은 55입니다.
		 * 
		 */

		// 김종현
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		System.out.print("1~100까지의 숫자 중 하나를 입력하세요 : ");
//
//		int num = sc.nextInt();
//		for(int i=1;i<=num;i++) {
//			sum += i;	// sum = sum + i; 동일하다.
//		}
//		System.out.printf("1부터 %d까지의 총합은 %d입니다.",num,sum);

//		if(num>=1 && num<=100) {	// 예외상황 처리
//			for(int i=1;i<=num;i++) {
//				sum+=i;
//			}
//			System.out.printf("1부터 %d까지의 총합은 %d입니다.",num,sum);
//		}
//		else {
//			System.out.println("1부터 100까지의 숫자가 아닙니다.");
//		}

//		System.out.println();
//		System.out.println("================================================");

		/* 3.
		 * 반복문을 사용하여 아래와 같이 출력되도록 만드세요.
		 * 
		 * #
		 * ##
		 * ###
		 * 
		 * #을 1 ~ 3번까지 차례로 출력
		 * hint) 
		 * 1. String 변수에 "#"을 저장, 연산 하는 방법
		 * 2. for문 안에 for문을 사용한 이중 반복문 사용 방법.
		 * # 밖의 for 문이 1일때 안쪽 for 문도 1번 실행된다.
		 * ## 밖의 for 문이 2일때 안쪽 for 문도 2번 실행된다.
		 * ### 밖의 for 문이 3일때 안쪽 for 문도 3번 실행된다.
		 */

		// 김동하
//		String t ="#";
		
		for(int i=1;i<=3;i++) {			

			for(int j=1;j<=i;j++) {
				System.out.print("#");
			}

			System.out.println();
		}
	}
}
