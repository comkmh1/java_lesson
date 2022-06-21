package day11;

class Human {
	String type;

	public void print() {
		System.out.println("���� �ΰ��Դϴ�. ������ " + this.type + "�Դϴ�.");
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
}

//�ΰ� > �л�
class Student extends Human { }

//�ΰ� > ������
class Teacher extends Human { }

// �ΰ� > ������ > ���� ������
// Human > Teacher > BossTeacher
class BossTeacher extends Teacher { }

// �ΰ� > ������ > ���� ������
class LeaderTeacher extends Teacher {}

public class Inheritance {

	public static void main(String[] args) {
//		Human hm = new Human();
//		hm.setType("����");
//		System.out.println(hm.getType());
//		
//		Human hw = new Human();
//		hw.setType("����");
//		System.out.println(hw.getType());
		
		Student st = new Student();
		st.setType("����");
		st.print();
		
		Teacher tc = new Teacher();
		tc.setType("����");
		tc.print();
		
		BossTeacher bts = new BossTeacher();
		bts.setType("���弱����");
		bts.print();
		
		LeaderTeacher lt = new LeaderTeacher();
		lt.setType("���Ӽ�����");
		lt.print();
	}
}
















