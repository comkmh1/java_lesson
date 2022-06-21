package review;
/*
 * 자바 1에서 만들었던 기본 클래스를 가져온 것
 * 
 * Aschool을 메인으로하여
 * ClassRoom 클래스
 * Student 클래스
 * 가 각각 개별적인 클래스로 구성되어 있다.
 * 즉, 서로간의 연관 관계가 없다.
 */

/* 1.
 * ClassRoom 라는 클래스를 만들고
 * 
 * 멤버 변수는 아래와 같이 정의한다.
 	String className;		// 학과명
	String teacher;			// 선생님 이름
	String[] students;		// 학생들 이름[최대 3명]
	
 * 단, 학생들은 위에서 만든 String 클래스를 사용하여 배열로 선언
 * ClassRoom 생성자에서 아래와 같이 배열을 초기화 한다.
 * hint) students = new Student[3];
 * 
 * 멤버 함수는 아래와 같이 정의한다.
 * 출력하기 함수
 * 		학과명 표시
 * 		선생님 이름 표시
 * 		학생 명단 표시
 * 설정하기(Setter) 함수
 * 		학과명 설정
 * 		선생님 이름 설정
 * 		학생별 이름 설정
 * 		hint) setStudent(index, 이름) > (0, "홍길동")
 * 가져오기(Getter) 함수
 * 		학과명 가져오기
 * 		선생님 이름 가져오기
 * 		학생별 이름 가져오기
 * 		hint) getStudent(index) return "홍길동" 이름 반환

 hint>
	day10 패키지를 생성한다.
	ClassRoom 클래스(ClassRoom.java) 파일을 생성한다.
	ClassRoom.java 파일 안에 동일하게 ClassRoom 클래스를 생성한다

	public class ClassRoom {
	// 멤버변수
		String className;		// 학과명
		String teacher;			// 선생님 이름
		String[] students;		// 학생들 이름

	// 생성자
	public ClassRoom() {
		className = "";				// 문자열에서 지원하는 자동 초기화
		teacher = new String();		// 문자열 클래스 생성자를 이용한 초기화(객체 생성)
		
		students = new String[3];	// 1차원 배열 생성
		
		// 반복문으로 초기화(이 방법을 더 많이 사용한다)
		for(int i = 0; i < students.length; i++) {
			students[i] = new String("");
		}
	}

	print 메소드,
	setXXX 메소드[setter 메소드], 
	getXXX 메소드[getter 메소드]

	등등 코드 작성
	}


	테스트(사용) 예

	ClassRoom clsroom = new ClassRoom();
		
	// setter 메소드 사용하여 값 설정
	clsroom.setClassName("컴퓨터공학과");
	clsroom.setStudent(0, "홍길동");
	clsroom.setStudent(1, "김유신");
	clsroom.setStudent(2, "강감찬");

	System.out.println("==================================");
	
	// getter 메소드 사용하여 값 읽어오기
	System.out.println("학과명 : " + clsroom.getClassName());
	System.out.println("1번 학생 : " + clsroom.getStudent(0));
	System.out.println("2번 학생 : " + clsroom.getStudent(1));
	System.out.println("3번 학생 : " + clsroom.getStudent(2));
	
	System.out.println("==================================");
	
	// print 메소드 사용
	clsroom.printClassName();
	clsroom.printTeacher();
	clsroom.printStudents();
	
	System.out.println("==================================");
*/

/* 
	추가 힌트

	public class ClassRoom { 
		// 멤버변수
	 	String className;		// 학과명
		String teacher;			// 선생님 이름
		String[] students;		// 학생들 이름[최대 3명]
	
		// 생성자
		public ClassRoom()
	
		// print 메소드
		public void printClassName()
		public void printTeacher()
		public void printStudents()
	
		// setXXX 메소드[setter 메소드]
		public void setClassName(String className)
		public void setTeacher(String name)
		public void setStudent(int index, String name)
	
		// getXXX 메소드[getter 메소드]
		public String getClassName()
		public String getTeacher()
		public String getStudent(int index)
	}
 */