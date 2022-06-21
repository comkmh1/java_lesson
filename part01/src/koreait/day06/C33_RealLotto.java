package koreait.day06;

import java.util.Arrays;
import java.util.Random;
// �ۼ��� : �ȵ��� 
public class C33_RealLotto {

	public static void main(String[] args) {

		int[] numbers = new int[45];   
		Random r = new Random();
		// ó�� ���� : ���� �ε��� + 1 -> �ε��� ������ �̰� �ش� ���� ���� �ϸ� �� ��Ģ�� ������ �ȵ˴ϴ�.
		for(int i = 0; i < 45; i++) {//�ε����� ���� : 0 ~44
			numbers[i] = i + 1;		//���� ���� : 1 ~ 45
		}
		
		System.out.println("numbers �迭 �ʱⰪ------------------------------");
		System.out.println(Arrays.toString(numbers));
		System.out.println("-----------------------------------------------");
	
		int[] lotto = new int[6]; // �ζ� ��÷ ��ȣ ������ 6�� 
		int k;	//���� ���� �ε��� - ������ ���մϴ�.
		for(int cnt = 0; cnt < 6; cnt++) {
			k = r.nextInt(45-cnt);	//45 -cnt -> ��ȣ�� ��÷�� �� ������ ����
			System.out.println("k = " + k+ ",numbers =" + numbers[k]);
			
			lotto[cnt] = numbers[k]; //��÷��ȣ�� ���� �ζǹ�ȣ�� ����
			//k��ġ�� ���� ���� : �ε��� k - 1 ���� ��������� ���� �������� �̵�
			for(int i = k; i < numbers.length - 1; i++) {//���õ� �ζ� ��ȣ�� ���� -> �ߺ����� 
				numbers[i] = numbers[i + 1];
			}
			System.out.println(Arrays.toString(numbers));
		    
		}	
		System.out.print("���� ���� ���� : ");	
		System.out.println(Arrays.toString(lotto));
		
		Arrays.sort(lotto); // lotto �迭���� ũ�� ������� ��ġ�� �����մϴ�.
		System.out.println(Arrays.toString(lotto)); //������������ ���
		
		}
		}


