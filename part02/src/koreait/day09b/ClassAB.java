package koreait.day09b;
import koreait.day09a.ClassA;
public class ClassAB extends ClassA{
	
	public void test() { 
//		System.out.println("name = " + name); // ���� : name �ʵ� ���������ڴ� ����Ʈ �ٸ� ��Ű������ ��� ���մϴ�.
		title = "momo"; // ��ӹ��� tilte �ʵ� : �ٸ���Ű�� ������ protected ���������ڷ� �ڽ�Ŭ������ ���.
		System.out.println("tilte = " + title);
		System.out.println("�ź�");
		System.out.println("name = " + getName());
		
		
	}
	
	
}
