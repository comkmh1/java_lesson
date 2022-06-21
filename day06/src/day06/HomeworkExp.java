package day06;

import java.util.Scanner;

public class HomeworkExp {
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
		

		// 이향준
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번 째 수를 입력하세요 : ");
		int num1 = sc.nextInt();

		System.out.print("두번 째 수를 입력하세요 : ");
		int num2 = sc.nextInt();

//		System.out.printf(num1 > num2 ? "두 수의 차는 %d 입니다." : "두 수의 차는 %d 입니다.", 
//				num1-num2, num2-num1);
		
		// 무식한 방법(오답) 코더
//		int res = num1 - num2;
		
		// 조금 생각한 방법(정답) - 설계자
//		int res = num1 > num2 ? num1 - num2 : num2 - num1;
		
		// 
		int res = num1 - num2;
		res = res < 0 ? res * -1 : res;

		System.out.printf("두 수의 차는 %d 입니다.", res);

		System.out.println();
		System.out.println("===============================================\n");

		/* 2.
		 * 국어, 영어, 수학 점수를 입력 받아 평균을 구한 후
		 * 평균이 80점 이상이면 합격, 아니면 불합격 출력
		 * 
		 * 국어점수 : 90
		 * 영어점수 : 90
		 * 수학점수 : 90
		 * 평균점수는 90점으로 합격입니다.
		 */

		// 김동하
		System.out.print("국어 점수 :");
		int kor = sc.nextInt();

		System.out.print("영어 점수 :");
		int eng =sc.nextInt();

		System.out.print("수학 점수 :");
		int math = sc.nextInt();

		int ever = (kor+eng+math)/3;

//		if(ever >= 80) {
//			System.out.println("평균점수는 " + ever + "으로 합격입니다");
//		} else {
//			System.out.println("평균점수는 " + ever + "으로 불합격입니다");
//		}

		String score = ever >= 80 ? "합격" : "불합격";
		System.out.println("평균점수는 " + ever + "으로" + score + "입니다.");

		System.out.println("===============================================\n");		

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
		

		// 표혜민
		System.out.println("*******메뉴********");
		System.out.println("차");
		System.out.println("음료수");
		System.out.println("--------------");

		System.out.println("차와 음료수 중 하나를 선택하세요.");

//		String choice = sc.nextLine();
		String choice = sc.next();

		if(choice.equals("차")) {
			System.out.println("차를 선택하셨습니다.");
		} else if(choice.equals("음료수")) {
			System.out.println("음료수를 선택하셨습니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

		System.out.println("===============================================\n");		

		/* 4.
		 * 사용자에게 1~3번 까지의 메뉴를 입력받고
		 * 그 번호에 해당하는 메뉴를 아래와 같이 표시한다.
		 * 단, 그외의 번호를 선d택하면 "메뉴가 존재하지 않습니다."를 출력
		 * switch문을 사용 할 것
		 * 
		 * 1 ~ 3번 메뉴를 선택하세요 : 
		 * 1. 햄버거를 선택하셨습니다.
		 * 2. 콜라를 선택하셨습니다.
		 * 3. 사이다를 선택하셨습니다.
		 * 메뉴가 존재하지 않습니다.
		 */

		System.out.print("1 ~ 3번 메뉴를 선택하세요 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("1. 햄버거를 선택하셨습니다.");
			break;
		case 2:
			System.out.println("2. 콜라를 선택하셨습니다.");
			break;
		case 3:
			System.out.println("3. 사이다를 선택하셨습니다.");
			break;
		default:
			System.out.println("메뉴가 존재하지 않습니다.");
			break;
		}
		
		sc.close();
		
		
	}
}














