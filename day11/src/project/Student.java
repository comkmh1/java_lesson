package project;

// extends�� ���� Human Ŭ������ ��� �޴´�.
// ��, Human�� �θ� Ŭ������ �ǰ� Student�� �ڽ� Ŭ������ �ȴ�.
public class Student extends Human {
	// ��� ����
	String className;
	String name;

	// age, score ��� ���� �߰�
	int age;
	int score;

	// ������(�⺻ ������)
	public Student() {
		className = "";
		name = "";
		
		// �ʱ�ȭ �߰�
		age = 0;
		score = 0;
	}

	// ������(�ʱ�ȭ ������)
	public Student(String className, char type, String name, int age, int score) {
		this.className = className;
		this.name = name;

		// �ʱ�ȭ �߰�
		this.age = age;
		this.score = score;

		// ����� �θ��� ��� ���� type ���� �����Ѵ�.
		this.type = type;
	}

	// setter �޼ҵ�
	public void setClassName(String className) {
		this.className = className;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	// setType()�� �θ� ������ �����Ƿ� �������� �ʴ´�. 

	// getter �޼ҵ�
	public String getClassName() {
		return this.className;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public int getScore() {
		return this.score;
	}
	
	// getType()�� �θ� ������ �����Ƿ� �������� �ʴ´�.

	// print �޼ҵ�
	public void print() {
		System.out.println("============ ���� �л� ���� =============");
		System.out.println(className + "�Դϴ�.");
		System.out.println("�̸��� " + name + "�Դϴ�.");
		System.out.println("������ " + type + "�Դϴ�.");
		System.out.println("���̴� " + age + "�Դϴ�.");
		System.out.println("������ " + score + "�� �Դϴ�.");
		System.out.println("=====================================");
	}
}