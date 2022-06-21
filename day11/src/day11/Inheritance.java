package day11;

class Human {
	String type;

	public void print() {
		System.out.println("저는 인간입니다. 성별은 " + this.type + "입니다.");
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
}

//인간 > 학생
class Student extends Human { }

//인간 > 선생님
class Teacher extends Human { }

// 인간 > 선생님 > 교장 선생님
// Human > Teacher > BossTeacher
class BossTeacher extends Teacher { }

// 인간 > 선생님 > 주임 선생님
class LeaderTeacher extends Teacher {}

public class Inheritance {

	public static void main(String[] args) {
//		Human hm = new Human();
//		hm.setType("남성");
//		System.out.println(hm.getType());
//		
//		Human hw = new Human();
//		hw.setType("여성");
//		System.out.println(hw.getType());
		
		Student st = new Student();
		st.setType("여성");
		st.print();
		
		Teacher tc = new Teacher();
		tc.setType("남성");
		tc.print();
		
		BossTeacher bts = new BossTeacher();
		bts.setType("교장선생님");
		bts.print();
		
		LeaderTeacher lt = new LeaderTeacher();
		lt.setType("주임선생님");
		lt.print();
	}
}
















