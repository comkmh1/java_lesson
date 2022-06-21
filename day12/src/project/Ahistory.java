package project;
/*
 * 2차 프로젝트 과제 목표
 * 	추상 클래스
 * 	캡슐화(접근지정자)
 * 
 * 
 * 모든 멤버 변수는 private로 한다.
 * 모든 멤버 함수는 public로 한다.
 * 
 * ClassRoom 클래스의 멤버 변수인
 * 	String[] students; 문자열 배열 변수를
 * 	Student[] students; 클래스 배열 변수로
 * 변환한다.
 */

/* 1.
 * Human 추상 클래스로 만들고 아래와 같이 수정하자
 * 
 * 멤버 변수 수정
 * 	private char type;		// 성별
 * 
 * 멤버 함수 추가
 *  	// 추상 메서드
 * 	public abstract void print()
 */

/* 2.
 * Teacher 클래스를 만들고 Human을 상속하고 아래와 같이 수정한다.
 * 
 * 멤버 변수 수정
 * 	private String className;
 * 	private String name;
 * 	private int age;
 * 
 * 멤버 함수 추가
 * 	// 추상 메소드 구현
 *	@Override
 * 	 void print()
 */

/* 3.
 * Student 클래스를 만들고 Human을 상속하고 아래와 같이 수정한다. 
 * 
 * 멤버 변수 수정
 * 	private String className;
 * 	private String name;
 *  	private int age;
 * 	private int score;
 * 
 * 멤버 함수 추가
 * 	// 추상 메소드 구현
 *	@Override
 * 	 void print()
 */

/* 4.
 * ClassRoom을 아래와 같이 수정한다.
 * 
 * 생성자
	ClassRoom() {
		className = "";
		
		// Teacher 객체를 생성한다.
		teacher = new Teacher();
		
		// Student 배열을 생성한다(Student 객체 생성이 아님에 주의하자).
		students = new Student[10];

		// 반복문으로 초기화(이 방법을 더 많이 사용한다)
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student();
		}
	}
	
	ClassRoom(String className) {
		//this() 메소드는 기본 생성자를 호출하여 실행한다(메소드 재사용).
		this();	// 초기화를 꼭 해줘야 한다.
		
		// className 매개변수 값을 내자신의 멤버 변수에 저장한다.
		this.className = className;
	}
 * 
 * 멤버 변수
 * 	private String className;
 *	private Teacher teacher;
 *	private Student[] students;
 *
 * 멤버 함수
 *	//setter
 * 	setClassName(String className)
 * 	setStudent(int index, Student student)
 * 	setTeacher(Teacher teacher)
 * 
 * 	//getter
 * 	getClassName()
 * 	getStudent(int index)
 * 	getTeacher()
 * 
 * 	printClassName()
 * 	printTeacher()
 * 	printStudents()
 * 
 * hint>
  	public void setStudent(int index, Student student) {
		students[index] = student;
	}
	
	public Student getStudent(int index) {
		return students[index];
	}
	
	public void printStudents() {
		for(int i = 0; i < students.length; i++) {
			System.out.println(i+1 + "번 학생정보.");
			students[i].print();
		}
	}
 */


/*
 * 5.
 * School의 확인 결과는 아래와 같다.
 * 그리고 아래와 같이 위에서 만들어진 클래스들을 테스트한다. 
 * 
	public static void main(String[] args) {
		// ClassRoom 클래스 객체 생성 및 테스트
		ClassRoom room = new ClassRoom("컴퓨터 공학과");
		
		// 선생님 클래스를 생성하여 클래스 room에 설정한다.
		Teacher te = new Teacher(room.getClassName(), '남', "이성계", 50);
		room.setTeacher(te);
		
		String clsname = room.getClassName();
		
		// 첫번째 학생 클래스의 객체를 생성한다(학생을 생성한다)
		Student st1 = new Student(clsname, '남', "이순신", 22,  90);
		// room 객체에 학생을 설정한다(교실을 배정한다).
		room.setStudent(0, st1);
		
		// 두번째 학생 클래스의 객체를 생성한다.
		Student st2 = new Student(clsname, '남', "이순신", 22,  90);
		// room 객체에 학생을 넣는다(교실을 배정한다).
		room.setStudent(1, st2);
		
		// 세번째부터는 학생 클래스 객체의 생성과 설정을 동시에 간단하게.
		room.setStudent(2, new Student(clsname, '남', "김유신", 22,  80));
		room.setStudent(3, new Student(clsname, '남', "김영철", 22,  60));
		room.setStudent(4, new Student(clsname, '남', "김대한", 22,  100));
		room.setStudent(5, new Student(clsname, '남', "김민국", 22,  50));
		room.setStudent(6, new Student(clsname, '여', "안녕히", 22,  20));
		room.setStudent(7, new Student(clsname, '여', "김말순", 22,  80));
		room.setStudent(8, new Student(clsname, '여', "이복길", 22,  0));
		room.setStudent(9, new Student(clsname, '여', "한강희", 22,  50));
		
		// 프린트 메소드 테스트
		room.printClassName();
		room.printTeacher();
		room.printStudents();
	}
	
	출력결과

	컴퓨터 공학과입니다.
	============ 나의 선생님 정보 =============
	컴퓨터 공학과입니다.
	이름은 이성계입니다.
	성별은남입니다.
	나이는 50입니다.
	=====================================
	1번 학생정보.
	============ 나의 학생 정보 =============
	컴퓨터 공학과입니다.
	이름은 이순신입니다.
	성별은 남입니다.
	나이는 22입니다.
	점수는 90점 입니다.
	=====================================
	2번 학생정보.
	============ 나의 학생 정보 =============
	컴퓨터 공학과입니다.
	이름은 이순신입니다.
	성별은 남입니다.
	나이는 22입니다.
	점수는 90점 입니다.
	=====================================
	
	~~~~~~~~~~~~~~~~ 중략 ~~~~~~~~~~~~~~~~

	=====================================
	10번 학생정보.
	============ 나의 학생 정보 =============
	컴퓨터 공학과입니다.
	이름은 한강희입니다.
	나이는 22입니다.
	점수는 50점 입니다.
	=====================================
 */
