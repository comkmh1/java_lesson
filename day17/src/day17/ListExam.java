package day17;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExam {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr = new int[]{1, 2, 3, 4, 5};
		
//		arr[5]  = 10; // ????
		System.out.println(arr.length);
		
		// ���� Ÿ�� ������ �Ұ�
//		ArrayList<int> list = new ArrayList<E>();
		// Wrapper Ŭ���� �ڷ����� ����
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list.size());
		
		// ����Ʈ�� ���� �߰��ϸ� ũ�Ⱑ �ڵ����� �þ��.
		list.add(Integer.valueOf(10));	// ������ Ÿ������ �־�� �Ѵ�.
		System.out.println(list.size());
		list.add(Integer.valueOf(11));	// �׷��� ����ڽ����� �ڵ� ��ȯ�ؼ� �־��ش�.
		list.add(Integer.valueOf(12));
		list.add(Integer.valueOf(11));
		System.out.println(list.size());
		System.out.println(list.toString());
		
		// ���� ũ�� ���� index�� ���� �����ϴ� ���� ����
		list.set(1, 20);
		System.out.println(list.toString());
		
		// ũ�⸦ ��� set�� ����.
//		list.set(5, 40);
//		System.out.println(list.toString());
		
		// ������ �о����
		System.out.println(list.get(0));
		System.out.println(list.get(2));
//		System.out.println(list.get(5));
		
		System.out.println("============================");
		// �÷����� �ݺ��ϴ� ��� 1
		for (int i = 0; i < list.size(); i++) {
			Integer item = list.get(i);
			System.out.println(item);
		}
		
		// �÷����� �ݺ��ϴ� ��� 2
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		
		// �÷����� �ݺ��ϴ� ��� 3
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		System.out.println("=============================");
		
		// �׸��� ������ �����ϴ�.
		list.remove(1);
		System.out.println(list.toString());
		System.out.println(list.size());
		
		// ������ ����� ��� ��ü ����(Ŭ����)
		list.clear();
		System.out.println(list.size());
		
		// ��� ��� �� �޼ҵ� ����
		// ��ü ����(List�� ���ͷ��̽��̹Ƿ� ����� �ڽ� Ŭ������ ��ü�� �����ؾ� �Ѵ�.
		ArrayList<String> strlist = new ArrayList<String>();
		
		strlist.add("123");		// �������� ������ �߰�
		strlist.add(0, "abc"); 	// �ش� �ε��� ��ġ�� �����͸� ����(�߰�����)
		System.out.println(strlist);
		strlist.set(0, "234");	// �ش� �ε����� �� ����
		strlist.get(0); 		// �ش� �ε����� �� �б�
		strlist.remove(0); 		// �ش� �ε����� �� ����
		strlist.size();			// �÷����� ��� ���� Ȯ��
		strlist.clear();		// ��� ������ ����
		strlist.toString();		// �÷����� ���� ���ڿ��� ���
			
	}
}












