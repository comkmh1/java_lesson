package day12;

public class AbstractExam {

	public static void main(String[] args) {
		Student st = new Student();
		st.print();
		st.name = "홍길동"; // public 접근 가능
		st.age = 12;	// protected도 접근 가능

		Teacher te = new Teacher();
		te.print();
	}

}
