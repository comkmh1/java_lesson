package day10;

public class ClassRoom {
	public String className;	// 학과명
	public String teacher;		// 선생님 이름 나이
	public String[] students;	// 학생들 이름[최대 3명]

	// 기본 생성자
	public ClassRoom() {
		this.className = "";
		this.teacher = "";

		this.students = new String[3];	// String 배열 초기화
	}
	
	// 초기화 생성자
	public ClassRoom(String className, String teacher, String[] students) {
		this.className 	= className;
		this.teacher 	= teacher;
		this.students 	= students;
	}

	// 출력하기 메소드
	public void printClassName() {
		System.out.println("우리 학과명 : " + this.className);
	};
	public void printTeacher() {
		System.out.println("우리반 선생님 : " + this.teacher);
	};
	public void printStudents() {
		for (int i = 0; i < students.length; i++) {			
			System.out.println("학생명 : " + this.students[i]);
		}
	}

	// setter 메소드
	public void setClassName(String className) {
		this.className = className;
	};
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	};
	public void setStudent(int index, String name) {
		// index가 가르키는 요소의 메모리 공간에
		// 파라메터로 넘어온 name을 저장한다.
		this.students[index] = name;
	};

	// getter 메소드
	public String getClassName() { 
		return this.className; 
	};
	public String getTeacher() { 
		return this.teacher; 
	};
	public String getStudent(int index) {
		// index가 가르키는 요소의 메모리 공간에 저장된 값을 반환한다.
		return this.students[index]; 
	};
}


















