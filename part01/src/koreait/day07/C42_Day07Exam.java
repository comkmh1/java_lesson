package koreait.day07;

import java.util.Random;
import java.util.Scanner;
// �ۼ���: �ȵ���
public class C42_Day07Exam {

	public static void main(String[] args) {
		
		System.out.println("-------------------------");
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		System.out.println("-------------------------");
		System.out.println("�����մϴ�");
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int point1[] = new int[5];
		int point2[] = new int[5];
		int answer[] = new int[5];
		int[] cnt = new int[5];
		int a = 0;
		for(int i = 0; i < 5; i++ ) {
			point1[i] = r.nextInt(99);
			point2[i] = r.nextInt(99);
			System.out.print("����"+(i + 1)+"."+ point1[i] + "+" + point2[i] + " = �� �Է� -> ");
			answer[i] = sc.nextInt();
			System.out.print(answer[i]);
			System.out.println();
			cnt[i] = answer[i];
			if(point1[i] + point2[i] == cnt[i]) {
				a++;
			}	
		}	
		
		System.out.println("ä�� �մϴ�. ���� ����" + a + "("+ (a*10) + "��)");
		System.out.println("::::: Ʋ�� ���� ���� ���� :::::");
		for(int i =0; i < cnt.length; i++) {
			if(point1[i] + point2[i] != cnt[i]) {
				System.out.println("����"+(i+1)+"." + point1[i] + "+" + point2[i] + " = " + (point1[i] + point2[i]));			
			}
		}
		
		
		
		
		
		
		
		
						
		
		
		
			
	sc.close();
	}
	
	}


