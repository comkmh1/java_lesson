package project;
/*
 * 3차 프로젝트 과제 목표
 * 	형변환
 *  	다형성
 * 
 * 소스 리펙토링(중복 제거)
 * 	Student 클래스의 멤버 변수인
 * 		int score; 	변수를
 * 		int[] score;	배열 변수로
 * 변경한다. 배열 개수는 5개이다.
 */

/* 1.
 *  
 * 기존의 Human을 상속 받은 클래스 Student/Teacher 클래스에서
 * 중복된 코드가 있습니다. 해당 코드의 중복을 제거하세요. 
 * 즉, 자식 클래스에서 공통적으로 사용하는 멤버 변수와 함수를
 * 부모 클래스로 이동하여 중복을 제거하세요.
 * 이러한 과정을 리펙토링이라고 부르기도 한다.
 * hint) 모든 클래스가 name, age를 갖고 있다. 
 */

/* 2.
 * Student 클래스의 score를 배열로 변경한다.
 * int score[] = new int[5]
 * 최개 과목 개수는 5개까지만 한다. 
 */

/* 3.
 * School 클래스를 만들고 여기에 main() 메소드를 추가한다.
 * 그리고 아래와 같이 위에서 만들어진 클래스들을 테스트한다. 
 * 
	public static void main(String[] args) {
		// ClassRoom 클래스 객체 생성 및 테스트
		ClassRoom room = new ClassRoom("컴퓨터 공학과");
		
		// 선생님 클래스를 생성하여 클래스 room에 설정한다.
		Teacher te = new Teacher(room.getClassName(), '남', "이성계", 50);
		room.setTeacher(te);
		
		String clsname = room.getClassName();

		// 첫번째 학생의 성적을 배열로 생성 및 초기화한다.
		int[] arr1 = new int[]{10, 80, 80, 90, 70};
		// 첫번째 학생 클래스의 객체를 생성한다(학생을 생성한다)
		Student st1 = new Student(clsname, '남', "이순신", 22,  arr1);	// scores 배열도 설정
		// room 객체에 학생을 설정한다(교실을 배정한다).
		room.setStudent(0, st1);

		// 두번째 학생 클래스의 객체를 생성과 동시에 성적을 배열을 생성 및 초기화.
		Student st2 = new Student(clsname, '남', "이순신", 22,  new int[]{10, 80, 80, 90, 70});
		// room 객체에 학생을 넣는다(교실을 배정한다).
		room.setStudent(1, st2);
		
		// 세번째부터는 학생 클래스 객체의 생성과 설정을 동시에 간단하게.
		room.setStudent(2, new Student(clsname, '남', "김유신", 22,  new int[]{30, 80, 80, 90, 70}));
		room.setStudent(3, new Student(clsname, '남', "김영철", 22,  new int[]{40, 80, 80, 90, 70}));
		room.setStudent(4, new Student(clsname, '남', "김대한", 22,  new int[]{50, 80, 80, 90, 70}));
		room.setStudent(5, new Student(clsname, '남', "김민국", 22,  new int[]{60, 80, 80, 90, 70}));
		room.setStudent(6, new Student(clsname, '여', "안녕히", 22,  new int[]{70, 80, 80, 90, 70}));
		room.setStudent(7, new Student(clsname, '여', "김말순", 22,  new int[]{80, 80, 80, 90, 70}));
		room.setStudent(8, new Student(clsname, '여', "이복길", 22,  new int[]{90, 80, 80, 90, 70}));
		room.setStudent(9, new Student(clsname, '여', "한강희", 22,  new int[]{100, 80, 80, 90, 70}));
		
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
	나이는 50입니다.
	성별은 남입니다.
	=====================================
	1번 학생정보.
	============ 나의 학생 정보 =============
	컴퓨터 공학과입니다.
	이름은 이순신입니다.
	나이는 22입니다.
	성별은 남입니다.
	점수는 [10, 80, 80, 90, 70]점 입니다.
	총점은 330점입니다.
	평점은 66.0점입니다.
	=====================================
	2번 학생정보.
	============ 나의 학생 정보 =============
	컴퓨터 공학과입니다.
	이름은 이순신입니다.
	나이는 22입니다.
	성별은 남입니다.
	점수는 [10, 80, 80, 90, 70]점 입니다.
	총점은 330점입니다.
	평점은 66.0점입니다.
	=====================================
	.
	.
	.
	10번 학생정보.
	============ 나의 학생 정보 =============
	컴퓨터 공학과입니다.
	이름은 한강희입니다.
	나이는 22입니다.
	점수는 [100, 80, 80, 90, 70]점 입니다.
	총점은 420점입니다.
	평점은 84.0점입니다.
	=====================================
 */