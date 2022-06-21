package review;

// 이제 Human 클래스는 추상 클래스가 되었다.
public class Student extends Human {
	// 멤버 변수
	private String className;
	private String name;
	private int age;
	private int score;

	// 생성자
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
		
		// 상속한 부모의 멤버 변수 type 값을 설정한다.
		// 부모 클래스에서 type이 private가 되었으므로
		// 이제 더이상 this.type으로 직접 접근이 불가능하다.
		// this.type = type;
		
		// 따라서 setter을 이용해 설정해야 한다.
		this.setType(type);
	}

	// setter 메소드
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

	// getter 메소드
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
	
	// print 메소드(추상 메소드 오버라이드)
	@Override
	public void print() {
		System.out.println("============ 나의 학생 정보 =============");
		System.out.println(className + "입니다.");
		System.out.println("이름은 " + name + "입니다.");
		//System.out.println("성별은 " + type + "입니다."); // 접근불가
		System.out.println("성별은 " + this.getType() + "입니다.");
		System.out.println("나이는 " + age + "입니다.");
		System.out.println("점수는 " + score + "점 입니다.");
		System.out.println("=====================================");
	}
}