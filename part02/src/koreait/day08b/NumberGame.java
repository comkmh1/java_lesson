package koreait.day08b;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		
	Random r = new Random();
	Scanner sc = new Scanner();
	int[] triallst = new int[10];
	
	System.out.println("���� ���߱� ���� �����մϴ�. �� ��ǻ�ʹ� ���ڸ� �����߽��ϴ�");
	System.out.println("��, �޸��� ���纸����. (101 ~ 299)");
	int numComputer = r.nextInt(199) + 101; 
	int numHuman;
	int i = 0;
	
	do {
		System.out.println("������ ���� �Է�(��ȸ : " + (10 - i) + ") -> ");
		numHuman = sc.nextInt();
		if (numComputer > numHuman) {
			triallst[i] = numHuman;
			i++;
			System.out.println("�ƴմϴ�. �� ū ���Դϴ�.");
		} else if (numComputer < numHuman) {
			triallst[i] = numHuman;
			i++;
			System.out.println("�ƴմϴ�. �� ���� ���Ԥ���.");
		}
		
		if(i == 10) break;
	} while (numComputer != numHuman); 
	}
}
