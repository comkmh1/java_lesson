package koreait.day13a;


public class User implements Comparable<User> {
		private String name;
		private int age;
		
		public User(String name, int age) {
			this.name = name;
			this.age = age;
		}
		public int getAge() {
			return age;
		}
		public String getName() {
			return name;
		}

//Comparable 인터페이스 추상메소드 구현
public int compareTo(User o) {
		Integer o1 = this.age;
		Integer o2 = o.getAge();
		return o1.compareTo(o2);
		}
@Override
public String toString() {
	return "User [name=" + name + ", age=" + age + "]";
}
//객체를 직접 비교할수 있는 상태로 만드는가? User
//비교기준 내용과 방법을 sort에 적용한 것이 Member


	
}


	







