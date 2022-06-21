package day05;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		/* 1.
		 * 두 정수를 입력 받아서 두 수의 차를 나타내기
		 * 단 삼항연산자를 이용하여 비교한다.
		 *
		 * 첫번째 수를 입력하세요 : 10
		 * 두번째 수를 입력하세요 : 20
		 * 
		 * 30 15 --> 두 수의 차는 15 입니다.
		 * 90 120 --> 두 수의 차는 30 입니다.
		 */

		/* 2.
		 * 국어, 영어, 수학 점수를 입력 받아 평균을 구한 후
		 * 평균이 80점 이상이면 합격, 아니면 불합격 출력
		 * 
		 * 국어점수 : 90
		 * 영어점수 : 90
		 * 수학점수 : 90
		 * 평균점수는 90점으로 합격입니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수를 입력하세요: ");
		int score1 = sc.nextInt();
		System.out.println("영어점수를 입력하세요: ");
		int score2 = sc.nextInt();
		System.out.println("수학점수를 입력하세요: ");
		int score3 = sc.nextInt();
		int result = (score1 + score2 + score3) / 3;
		if(result >= 80) {
			System.out.println(result + "점으로 합격입니다.");
		}  else {
			System.out.println("불합격입니다.");
		}
		
			
		
		
		
		/* 3.
		 * 사용자에게 차 또는 음료수 두개 중 한개를 선택하도록 하고 
		 * 선택한 메뉴에 대하여 표시하기
		 * 
		 * 차와 음료수 둘 중 하나를 선택하세요 : 
		 * 차를 선택하셨습니다.
		 * 음료수를 선택하셨습니다.
		 * 
		 * hint) 문자 비교시 equals() 메소드 사용
		 */
		
		 
		
		
		/* 4.
		 * 사용자에게 1~3번 까지의 메뉴를 입력받고
		 * 그 번호에 해당하는 메뉴를 아래와 같이 표시한다.
		 * 단, 그외의 번호를 선택하면 "메뉴가 존재하지 않습니다."를 출력
		 * switch문을 사용 할 것
		 * 
		 * 1 ~ 3번 메뉴를 선택하세요 : 
		 * 1. 햄버거를 선택하셨습니다.
		 * 2. 콜라를 선택하셨습니다.
		 * 3. 사이다를 선택하셨습니다.
		 * 메뉴가 존재하지 않습니다.
		 */

	}
}
