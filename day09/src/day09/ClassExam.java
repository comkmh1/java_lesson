package day09;

class ClassRoom {
	String teacher = "김말순";
	String[] students = {"이순신", "김유신"};
	
	public void teach() {
		System.out.println("김말순 선생님이 영어를 가르칩니다.");
	}
	
	public void study() {
		System.out.println("이순신, 김유신 학생들이 영어를 배웁니다.");
	}
}

public class ClassExam {
	public static void main(String[] args) {
		System.out.println("클래스 예제....");
		
		// ClassRoom 클래스의 cls 객체 선언
		ClassRoom cls;
		// cls 객체 생성(실제 객체가 메모리에 생성)
		cls = new ClassRoom();
		
		// 선생님과 학생들 멤버 변수를 출력해보자.
		System.out.println(cls.teacher);
		System.out.println(cls.students[0]);
		System.out.println(cls.students[1]);

		// 멤버 함수(기능)을 사용해 보자.
		cls.teach();
		cls.study();
	}
}










