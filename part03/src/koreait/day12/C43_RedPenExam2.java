package koreait.day09;

import java.util.Random;
import java.util.Scanner;

public class C43_RedPenExam2 {
// C42���� MathProblem Ŭ������ ����ϴ� ������ �ٲٱ� : ������ ������.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int size = 5;		// ���� ���� ���� ���� �� �ʱ�ȭ�Ͽ� �ڵ��� ������ �����ϰ� ��!!
		int max_size = MathProblem.MAX_SIZE();		// size �������� MAX_SIZE�� �ʰ��ϴ��� �˻� �߰��ϱ�.
		
		MathProblem[] problems = new MathProblem[size];
		// ��� ������ �����ϴ� �迭
		
		// �迭�� Ÿ���� MathProblem ��ü ������ : n1, n2, op, isCorrect
		
		int ans;
		int cnt = 0;
		
		System.out.println("=============================");
		System.out.println("   ������ ���� 2�ڸ� ���� ���� Ǯ��      ");
		System.out.println("=============================");
		System.out.println("�����մϴ�.");
		
		for(int i = 0; i < size; i++) {
			MathProblem temp = new MathProblem('+');		// ������ �ϰ� ������ ��ü�� �������ָ� ��.
			temp.makeProb();			// n1, n2�� ���� ��ü�� �ʵ�� ���� ����.
			
			System.out.print("���� " + (i + 1) + ". " + temp.problem() + " �� �Է� -> ");
//			System.out.print("���� " + (i + 1) + ". " + temp.getN1() + " + " + temp.getN2() + " = �� �Է� -> ");
			ans = sc.nextInt();
			if(ans == temp.showAnswer()) {		// ����� ��, ���� ���߸� ī��Ʈ
				cnt++;			// ���� ���� �� ī��Ʈ
				temp.setCorrect(true);
			}
			problems[i] = temp;		// �̷� ���� ����� ���°� �³�.. Line 44 �ؿ��� ä�����.. ��
		}
		System.out.println("=============================");
		System.out.println("ä���մϴ�. ���� ���� " + cnt + " ( " + (cnt * 100 / size) + " �� )");
		System.out.println("::::::: Ʋ�� ���� ���� ���� :::::::");
		for(int i = 0; i < problems.length; i++) {		
			if(problems[i].isCorrect() == false) {	// Ʋ���� ��
				System.out.println("���� " + (i + 1) + ". " + problems[i].problem() + problems[i].showAnswer());
			}	// ù��° ���
			if(!problems[i].isCorrect()) {		// problems[i].isCorrect()�� �����̸� !�������� ���� ������ �ٲ��.
				System.out.println("���� " + (i + 1) + ". " + problems[i].problem() + problems[i].showAnswer());
			}	// �ι�° ���
		}	// Ʋ�� ���� ��� ����
		// �������������������
		//  for each�� �����ϱ�. : ���� ��ȣ ��� X
		// �������������������
		for(MathProblem mp : problems) {
			if(!mp.isCorrect()) {
			System.out.println(mp.problem() + mp.showAnswer());
			}
		}
		
		sc.close();		// ���α׷� ����
	}
}
