package koreait.day04;

public class C17_StringTest {

	public static void main(String[] args) {

		String name = "kim";	//������ ����(Ŭ���� Ÿ��)
		String name2 = "kim";
		String name3 = "lee";
		String name4 = new String("kim");
		
		System.out.println("name == name2 ������ġ?" + (name == name2)); //true
		System.out.println("name == name4 ������ġ?" + (name == name4)); //false
		System.out.println("name2 == name4 ������ġ?" + (name2 == name4)); //false
		
		name2 = "son";
		System.out.println("name == name2 ������ġ?" + (name == name2)); //false
	
	
	
	
	}

}
/*		���ڿ�: ��ȣ""�� ����ϸ� ���ڿ��Դϴ�.
 * 		�ڹٿ����� �⺻�� ������ �ƴϰ� String Ŭ���� Ÿ������ ����մϴ�.
 * 										�� �ʵ�, �޼ҵ� �̿��Ͽ� ���ڿ� ��� ���  
 */