package koreait.day12;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class C51_TodayMenu {

	public static void main(String[] args) {
		
		System.out.println("������ ����޴� ��ǥ�մϴ�.!!!");
		System.out.println("ġ��, ������, ��â, �Ұ��, �ܹ���, ��¡�ȸ");
		
		//key: �޴��̸�, value : ��ǥ�� 
		
		//�ʱ�ȭ 
		HashMap<String,Integer> map = new HashMap<>();
		map.put("ġ��",0);
		map.put("������",0);
		map.put("��â",0);
		map.put("�Ұ��",0);
		map.put("�ܹ���",0);
		map.put("��¡�ȸ",0);
	
		Scanner sc = new Scanner(System.in);
		//�޴� ����(�ݺ�)
		while(true) {
			System.out.print("���� �޴� ���ĸ� �Է��ϼ���. (����� end �Է�) -> ");
			String menu =sc.nextLine();
			if(menu.equals("end"))
			break;
			
			if(!map.containsKey(menu)) {//map�� key���� menu �Է¹��ڿ��� �ִ���
				System.out.println("���� �޴��Դϴ�.");
				continue;
			}
			//�Է¹��� menu �� value ���� �������� -> +1 �ϱ� -> ����� �����ϱ�
			int temp = map.get(menu);
			++temp;
			map.put(menu, temp);
		}

			
		System.out.println("��ǥ �����մϴ�.");
		System.out.println(map);
		System.out.println("�ִ� ��ǥ�� : " + Collections.max(map.values()));
		System.out.println("���� : " + Collections.max(map.keySet()));	//���� ū key ��
		//Entry<Key,Value> 
		
		
	}

}
