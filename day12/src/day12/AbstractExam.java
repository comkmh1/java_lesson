package day12;

public class AbstractExam {

	public static void main(String[] args) {
		Student st = new Student();
		st.print();
		st.name = "ȫ�浿"; // public ���� ����
		st.age = 12;	// protected�� ���� ����

		Teacher te = new Teacher();
		te.print();
	}

}
