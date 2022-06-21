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
		System.out.println("============ 나의 선생님 정보 =============");
		System.out.println(this.className + "입니다.");
		System.out.println("이름은 " + this.name + "입니다.");
		System.out.println("성별은" + this.type + "입니다.");
		System.out.println("나이는 " + this.age + "입니다.");
		System.out.println("=====================================");
	}
	
}
