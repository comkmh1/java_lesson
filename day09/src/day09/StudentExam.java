package day09;

//import java.util.Scanner;
//import day09.Student;

public class StudentExam {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Student st = new Student();
		
		// ������, 100, 60
//		st.name = "������";
//		st.eng = 100;
//		st.kor = 60;
		
		Student st = new Student("������", 100, 60);

//		System.out.println(st.name);	// ȫ�浿
		st.printName();
		st.printScore();
		st.printInfo();
		
//		Student st1 = new Student();		
//		st1.name = "�̼���";
//		st1.eng = 90;
//		st1.kor = 100;
		
		Student st1 = new Student("�̼���", 90, 100);		
		st1.printInfo();
	}

}
