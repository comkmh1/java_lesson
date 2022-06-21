package day05;

import java.util.Scanner;

public class OperatorCondition {
	public static void main(String[] args) {
		System.out.println(true ? 10 : 20);
		System.out.println(false ? 10 : 20);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		
		int age = sc.nextInt();

//		// age > 19 ? "성인" : "미성년자"
//		System.out.println(age > 19 ? "성인" : "미성년자");
//		// 60살이 넘으면 노인 아니면 성인
//		System.out.println(age > 60 ? "노인" : "성인");
		
		// 19이하면 미성년자 19 ~ 60 성인 60세이상이면 노인
		System.out.println(age > 19 ? age > 60 ? "노인" : "성인" : "미성년자");
	}
}
