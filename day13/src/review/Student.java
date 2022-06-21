package review;

// ���� Human Ŭ������ �߻� Ŭ������ �Ǿ���.
public class Student extends Human {
	// ��� ����
	private String className;
	private String name;
	private int age;
	private int score;

	// ������
	public Student() {
		className = "";
		name = "";
		age = 0;
		score = 0;
	}

	public Student(String className, char type, String name, int age, int score) {
		this.className = className;
		this.name = name;
		this.age = age;
		this.score = score;
		
		// ����� �θ��� ��� ���� type ���� �����Ѵ�.
		// �θ� Ŭ�������� type�� private�� �Ǿ����Ƿ�
		// ���� ���̻� this.type���� ���� ������ �Ұ����ϴ�.
		// this.type = type;
		
		// ���� setter�� �̿��� �����ؾ� �Ѵ�.
		this.setType(type);
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
	
	// print �޼ҵ�(�߻� �޼ҵ� �������̵�)
	@Override
	public void print() {
		System.out.println("============ ���� �л� ���� =============");
		System.out.println(className + "�Դϴ�.");
		System.out.println("�̸��� " + name + "�Դϴ�.");
		//System.out.println("������ " + type + "�Դϴ�."); // ���ٺҰ�
		System.out.println("������ " + this.getType() + "�Դϴ�.");
		System.out.println("���̴� " + age + "�Դϴ�.");
		System.out.println("������ " + score + "�� �Դϴ�.");
		System.out.println("=====================================");
	}
}