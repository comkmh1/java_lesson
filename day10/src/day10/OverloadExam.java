package day10;

class Overload {
	String name;
	
	public Overload() {
	}
	
	public Overload(String name) {
		this.name = name;
		System.out.println("�׽�Ʈ");
	}

	// �̸��� ������ִ� print �޼ҵ�
	public void print() {
		System.out.println(this.name);
	}
	
	// �̸��� N�� �ݺ� ����ϴ� �޼ҵ�
	public void print(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(this.name);			
		}
	}

	public void print(String prefix) {
		System.out.println(prefix + " " + this.name);
	}
}

public class OverloadExam {
	public static void main(String[] args) {
		Overload ov = new Overload("ȫ�浿");
//		ov.print();
//		ov.print(3);
		ov.print("õ���л�");
	}
}













