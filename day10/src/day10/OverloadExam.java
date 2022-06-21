package day10;

class Overload {
	String name;
	
	public Overload() {
	}
	
	public Overload(String name) {
		this.name = name;
		System.out.println("테스트");
	}

	// 이름을 출력해주는 print 메소드
	public void print() {
		System.out.println(this.name);
	}
	
	// 이름을 N번 반복 출력하는 메소드
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
		Overload ov = new Overload("홍길동");
//		ov.print();
//		ov.print(3);
		ov.print("천재학생");
	}
}













