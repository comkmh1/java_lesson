package review;

public class Student extends Human {
	 String className;
	 String name;
	 int age;
	 int score;
	 
	public Student() {
		super();
		this.className = "";
		this.name = "";
		this.age = 0;
		this.score = 0;
	}

	public Student(String className, char type, String name, int age, int score) {
		super(type);
		this.className = className;
		this.type = type;
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public void print() {
		System.out.println("============ ���� �л� ���� =============");
		System.out.println(this.className + "�Դϴ�.");
		System.out.println("�̸��� " + this.name + "�Դϴ�.");
		System.out.println("������ " + this.type + "�Դϴ�.");
		System.out.println("���̴� " + this.age + "�Դϴ�.");
		System.out.println("������ " + this.score + "�� �Դϴ�.");
		System.out.println("=====================================");
	}
}
