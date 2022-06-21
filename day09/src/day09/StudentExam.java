package day09;

//import java.util.Scanner;
//import day09.Student;

public class StudentExam {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Student st = new Student();
		
		// ±èÀ¯½Å, 100, 60
//		st.name = "±èÀ¯½Å";
//		st.eng = 100;
//		st.kor = 60;
		
		Student st = new Student("±èÀ¯½Å", 100, 60);

//		System.out.println(st.name);	// È«±æµ¿
		st.printName();
		st.printScore();
		st.printInfo();
		
//		Student st1 = new Student();		
//		st1.name = "ÀÌ¼ø½Å";
//		st1.eng = 90;
//		st1.kor = 100;
		
		Student st1 = new Student("ÀÌ¼ø½Å", 90, 100);		
		st1.printInfo();
	}

}
