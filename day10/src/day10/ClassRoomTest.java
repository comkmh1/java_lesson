package day10;

public class ClassRoomTest {

	public static void main(String[] args) {
//		ClassRoom clsroom = new ClassRoom();
//		
//		// setter 메소드 사용하여 값 설정
//		clsroom.setClassName("컴퓨터공학과");
//		
//		clsroom.setTeacher("이순신");
//
//		clsroom.setStudent(0, "홍길동");
//		clsroom.setStudent(1, "김유신");
//		clsroom.setStudent(2, "강감찬");
//		
//		System.out.println("==================================");
//		
//		// getter 메소드 사용하여 값 읽어오기
//		System.out.println("학과명 : " + clsroom.getClassName());
//		System.out.println("선생님 : " + clsroom.getTeacher());
//		System.out.println("1번 학생 : " + clsroom.getStudent(0));
//		System.out.println("2번 학생 : " + clsroom.getStudent(1));
//		System.out.println("3번 학생 : " + clsroom.getStudent(2));
//		
//		System.out.println("==================================");
		
		// 학생을 저장하는 배열을 만든다.
		String[] students = new String[] {"이순신", "김유신", "홍길동" };
		// 클래스를 만들로 배열의 학생을 파라메터로 전달
		ClassRoom cr = new ClassRoom("컴퓨터 공학과", "김말순", students);

		// print 메소드 사용
		cr.printClassName();
		cr.printTeacher();
		cr.printStudents();
	}
}

















