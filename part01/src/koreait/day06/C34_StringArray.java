package koreait.day06;

import java.util.Scanner;

public class C34_StringArray {
	
	public static void main(String[] args) {
	
		String massage = "hi java!";
				
		String[] engKey = {"continue", "break", "public", "static", "dynamic"};
		
		//int, double, char �迭������ ��Ҹ� ��Ÿ���� nums[2], carr[1], point[2]
		//											�����⺻�� ������ Ÿ��
		//
		//engKey[2]�� ������
		
		
		for(int i = 0; i < engKey.length; i++)
			System.out.println(engKey[i]);
		
		String[] koreans = new String[5];	//�迭��� ���� �⺻�� �����Ͱ� X, ������ ����
		
		for(int i = 0; i < koreans.length; i++)
			System.out.println(koreans[i]);
		
		System.out.println("1. �迭��� ���� �����ϴ� ���ڿ��� ����");
		for(int i = 0; i < engKey.length; i++)
			System.out.println(engKey[i] + ":" + engKey[i].length());
		
		koreans[0] = "����ϴ�";
		koreans[1] = "���ߴ�"	;
		koreans[2] = "������";
	
		System.out.println("2. koreans �迭��Ұ��� �����ϴ� ���ڿ��� ����");
		for(int i = 0; i < koreans.length;i++) {
			if(koreans[i] != null) //***
			System.out.println(koreans[i] + ":" + koreans[i].length());
		//�����ϰ� �ִ� ��ü�� ���� �� �޼ҵ�/�ǵ� �������� ���� 
		}
   
		Scanner sc = new Scanner(System.in);
		System.out.print("static ��? >>>");
		koreans[3] = sc.nextLine();
		System.out.print("dynamic ��? >>>");
		koreans[4] = sc.nextLine();
		
		System.out.println("3. ��� �Էµ� koreans �迭 Ȯ��");
		for(int i = 0; i < koreans.length; i++)
			System.out.println(koreans[i]);
		
		// ����ڰ� �Է��� ����ܾ engKey �迭 �ε��� �������?
		System.out.print("ã�� �ܾ�� >>>  ");
		String find = sc.nextLine();
		int index = -1;
		
		for(int i = 0; i < engKey.length; i++) {
			if(find.equals(engKey[i])){
			index = i;
			break;
			}
		}
		System.out.println("ã�� �ܾ� ��ġ :" + index);
		if(index == -1)
			System.out.println("ã�� �ܾ engKey�� �����ϴ�!");
		else
			System.out.println("�ѱ� �� : " + koreans[index]);
			
			
	
	
	}
	}		
		
		
		
		
		
		
		
		
		
		
		
