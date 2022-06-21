package day06;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();

		sc.nextLine();

		System.out.print("이름을 입력해주세요 : ");
		String name = sc.nextLine();

		System.out.printf("나이는 %d 이름은 %s 입니다.", age, name);
	}
}
