package day09;

/*
 * Student 라는 클래스를 만들고
 * 멤버 변수로 학생이름을 저장한다.
 * 멤버 변수로 학생의 영어 점수를 저장한다.
 * 멤버 변수로 학생의 국어 점수를 저장한다.
 * 
 * 멤버 함수로 학생의 이름을 출력하는 메소드를 만든다.
 * 멤버 함수로 학생의 성적을 출력하는 메소드를 만든다(영어, 국어 점수 출력).
 * 멤버 함수로 학생의 이름과 총점을 출력하는 메소드를 만든다.
 */

public class Student {
	String name;
	int eng;
	int kor;
	
	// 기본 생성자
	Student() {
		this.name = "";
		this.eng = 0;
		this.kor = 0;
	}
	
	// 초기화 생성자
	Student(String name, int eng, int kor) {
		this.name = name;
		this.eng = eng;
		this.kor = kor;
	}

	public void printName() {
		System.out.println("제 이름은 " + this.name + "입니다.");
	}
	
	public void printScore() {
		System.out.println("영어 점수는" + this.eng + "입니다.");
		System.out.println("국어 점수는" + this.kor + "입니다.");
	}
	
	public void printInfo() {
		// 총점
		int total = eng + kor;
		System.out.println("제 이름은 " + name + "이고, 점수는 " + total + "접 입니다.");
	}
	
	public int getTotal() {
		return eng + kor;
	}
}
