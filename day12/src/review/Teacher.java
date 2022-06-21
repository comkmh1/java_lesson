package review;

public class Teacher extends Human {
	String className;
	String name;
	int age;
	
	public Teacher() {
		super();

		this.className = "";
		this.name = "";
		this.age = 0;
	}
	
	public Teacher(String className, char type, String name, int age) {
		super(type);
		this.className = className;
		this.name = name;
		this.age = age;
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
	
	public void print() {
		System.out.println("============ ���� ������ ���� =============");
		System.out.println(this.className + "�Դϴ�.");
		System.out.println("�̸��� " + this.name + "�Դϴ�.");
		System.out.println("������" + this.type + "�Դϴ�.");
		System.out.println("���̴� " + this.age + "�Դϴ�.");
		System.out.println("=====================================");
	}
	
}
