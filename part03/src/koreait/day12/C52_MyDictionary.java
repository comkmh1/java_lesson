package koreait.day12;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.IntConsumer;

public class C52_MyDictionary {
//�ۼ��� �ȵ���
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		TreeMap<String,String> map = new TreeMap<>();
		
		boolean run = true;
		String sel,eng,kor;
		System.out.println("���� ��� -> 1.�ܾ� ���� 2.�ܾ� �˻� 3. �ܾ��� ���� 4. ���α׷� ������");
		while(run) {
			System.out.print("���� ->");
			sel = sc.nextLine();
			switch(sel) {
			case "1": 
				System.out.println("English -> ");
				eng = sc.nextLine();
				System.out.println("Korean -> ");
				kor = sc.nextLine();
				map.put(eng,kor);
				break;
			
			case "2":
				System.out.println("English -> ");
				eng =sc.nextLine();
				if(!map.containsKey(eng)) {
				System.out.println("���� �ܾ��Դϴ�.");
				} 
				else{
				System.out.println("�ܾ��� �˻��߽��ϴ�." + map.get(eng));
				}
				break;
			case "3":	
				System.out.println("�ܾ��� ��ü���� : " + map);
				break;
			case "4":
				run=false;
				break;
			
				
				
			}
		}	
		
		System.out.println(map);
		
			//���� : ����	������ �Է��� �޾ƾ� �Ѵٸ� ���ڿ� 	nextLine() �޾Ƽ� ������ ��ȯ�մϴ�. 	Integer.parseInt(sc.nextLine())
		 	// ����: nextInt()�� ���͸� ó�� ���� �ʾƼ� ������ ������ nextInt()���� �Ǿ� �Է� �帧�� ���ذ� �˴ϴ�.
				
				
		 
		 
			
		
		
		
		
	
	
	}
	
	
}
