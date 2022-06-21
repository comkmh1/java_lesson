package project;

public class Aschool {
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
}
