package koreait.day11;

import koreait.day10.Person;

public class ClassAbsTest {

	public static void main(String[] args) {
		
		Person momo = new Person();
//		ClassAbs abs = new ClassAbs();  // ���� : ClassAbs�� �߻�Ŭ�� new�� ����� �� ����. �߻�޼ҵ带 ��üȭ���� �� �߱� ������
		ClassAbs abs = new ClassX();	//�θ� Ÿ�� ����
		ClassX cls = new ClassX();		//�ڽ� Ŭ���� Ÿ�� ����
		
		abs.test();
		cls.test();
		abs.name = "�����";
		cls.name = "���";
		abs.print();
		cls.print();
//		abs.setNum(1);  	���� : �θ� Ÿ�� �����̱� ������ �ڽ� Ŭ���������� ���ǵ� �޼ҵ�� ��� �Ұ�
		cls.setNum(2);
		ClassX x = (ClassX)abs;
		x.setNum(100);
		
		
	}

}
