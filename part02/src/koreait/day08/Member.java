package koreait.day08;

public class Member {
// �ۼ��� : �ȵ��� 
	
	private String name;
	private String email;
	private int age;
	private int level;
	
	//Ŀ���� ������
	public Member(String name,String email) {
		this.name = name;
		this.email = email;
	}

	public Member() {
		System.out.println("name,email,age,level �ʵ�� �⺻���Դϴ�.");
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	
	
}
