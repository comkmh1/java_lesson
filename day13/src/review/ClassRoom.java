package review;

// 학급 클래스로 선생님 객체와 학생 객체들을 가지고 있는 클래스이다.
public class ClassRoom {
	// 멤버 변수
	private String className;
	private Teacher teacher;
	private Student[] students;	// 배열은 일단 10개만

	// 생성자
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
	
	// setter
	public void setClassName(String className) {
		// 내 클래스의 멤버 변수에 먼저 저장하고
		this.className = className;
		
		// 학과명은 학생과 선생님 모두 동일하므로 데이터 일치가 필요하다.
		// 선생님 객체의 학과명도 변경해주자
		this.teacher.setClassName(className);

		// 학생 객체들의 학과명도 변경해주자
		for(int i = 0; i < students.length; i++ ) {
			students[i].setClassName(className);
		}
	}
	
	// students가 배열이므로 각 배열 요소에 값을 저장하기 위해
	// index는 배열 요소의 위치를 나타낸다.
	public void setStudent(int index, Student student) {
		this.students[index] = student;

		// index = 0이면 this.students[0] 요소에 매개변수 students를 저장;
		// index = 1이면 this.students[1] 요소에 매개변수 students를 저장;
		// index = 2이면 this.students[2] 요소에 매개변수 students를 저장;
		// index = 3이면 this.students[3] 요소에 매개변수 students를 저장;
		// index = 4이면 this.students[4] 요소에 매개변수 students를 저장;
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	// getter
	public String getClassName() {
		return this.className;
	}
	
	// students가 배열이므로 각 배열 요소에 값을 가져오기 위해
	// index는 배열 요소의 위치를 나타낸다.
	public Student getStudent(int index) {
		return this.students[index];
		
		// index = 0이면 this.students[0] 요소에 객체를 반환;
		// index = 1이면 this.students[1] 요소에 객체를 반환;
		// index = 2이면 this.students[2] 요소에 객체를 반환;
		// index = 3이면 this.students[3] 요소에 객체를 반환;
		// index = 4이면 this.students[4] 요소에 객체를 반환;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}
	
	// print 메소드
	public void printClassName() {
		System.out.println(this.className + "입니다.");
	}
	
	public void printTeacher() {
		this.teacher.print();
	}

	public void printStudents() {
		for(int i = 0; i < this.students.length; i++) {
			System.out.println(i+1 + "번 학생정보.");
			this.students[i].print();
		}
	}
}

















