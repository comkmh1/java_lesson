package koreait.day07;
//C39
public class Student {
	int no;
	String name;
	int grade;
	Score score; // �ٸ� Ŭ���� ��ü�� ���� �ʵ�(�������)�� ���� �˴ϴ�.
	
	
	void setData(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", grade=" + grade + ", score=" + score + "]";
	}
	


}
