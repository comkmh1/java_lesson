package day06;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է����ּ��� : ");
		int age = sc.nextInt();

		sc.nextLine();

		System.out.print("�̸��� �Է����ּ��� : ");
		String name = sc.nextLine();

		System.out.printf("���̴� %d �̸��� %s �Դϴ�.", age, name);
	}
}
