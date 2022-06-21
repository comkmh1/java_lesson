//package project;
//
//public class ClassRoom {
//	// 멤버 변수
//	public String className;	// 학과명
//	public String teacher;		// 선생님 이름 나이
//	public String[] students;	// 학생들 이름[최대 3명]
//
//	// 생성자(기본 생성자)
//	public ClassRoom() {
//		this.className = "";				// 문자열에서 지원하는 자동 초기화
//		this.teacher = new String();		// 문자열 클래스 생성자를 이용한 초기화(객체 생성)
//
//		this.students = new String[3];	// 1차원 배열 생성
//		
//		this.students = new String[3];		// String 배열 초기화
//
//		// 1차원 배열 생성 및 초기화(문자열에서만 가능)
//		// students = new String[]{"","",""};
//
//		// 1차원 배열 생성 및 초기화(클래스 생성자를 이용한 객체 생성)
//		// students = new String[]{new String(),new String(),new String()};
//	}
//	
//	// 초기화 생성자
//	public ClassRoom(String className, String teacher, String[] students) {
//		this.className 	= className;
//		this.teacher 	= teacher;
//		this.students 	= students;
//	}
//
//	// 출력하기 메소드
//	public void printClassName() {
//		System.out.println("우리 학과명 : " + this.className);
//	};
//	public void printTeacher() {
//		System.out.println("우리반 선생님 : " + this.teacher);
//	};
//	public void printStudents() {
//		for (int i = 0; i < students.length; i++) {			
//			System.out.println("학생명 : " + this.students[i]);
//		}
//	}
//
//	// setter 메소드
//	public void setClassName(String className) {
//		this.className = className;
//	};
//	
//	public void setTeacher(String teacher) {
//		this.teacher = teacher;
//	};
//	
//	// students가 배열이므로 각 배열 요소에 값을 저장하기 위해
//	// index는 배열 요소의 위치를 나타낸다.
//	public void setStudent(int index, String name) {
//		// index가 가르키는 요소의 메모리 공간에
//		// 파라메터로 넘어온 name을 저장한다.
//		this.students[index] = name;
//		
//		// index = 0이면 this.students[0] 요소에 매개변수 name를 저장;
//		// index = 1이면 this.students[1] 요소에 매개변수 name를 저장;
//		// index = 2이면 this.students[2] 요소에 매개변수 name를 저장;
//		// index = 3이면 this.students[3] 요소에 매개변수 name를 저장;
//		// index = 4이면 this.students[4] 요소에 매개변수 name를 저장;
//	};
//
//	// getter 메소드
//	public String getClassName() { 
//		return this.className; 
//	};
//	
//	public String getTeacher() { 
//		return this.teacher; 
//	};
//	
//	// students가 배열이므로 각 배열 요소에 값을 가져오기 위해
//	// index는 배열 요소의 위치를 나타낸다.	
//	public String getStudent(int index) {
//		// index가 가르키는 요소의 메모리 공간에 저장된 값을 반환한다.
//		return this.students[index]; 
//		
//		// index = 0이면 this.students[0] 요소에 객체를 반환;
//		// index = 1이면 this.students[1] 요소에 객체를 반환;
//		// index = 2이면 this.students[2] 요소에 객체를 반환;
//		// index = 3이면 this.students[3] 요소에 객체를 반환;
//		// index = 4이면 this.students[4] 요소에 객체를 반환;	
//	};
//}