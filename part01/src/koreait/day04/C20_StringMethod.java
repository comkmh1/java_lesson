package koreait.day04;

public class C20_StringMethod {

	public static void main(String[] args) {
		
		String message = "Hello~";
		
//		message.length();
//		message.charAt(0);
		
//		message.equals("Hello~")
		
		int len = message.length();
		char temp = message.charAt(3);
		boolean isState = message.equals("Hello~");
		
		System.out.println("length() = " + len);
		System.out.println("charAt(3) = " + temp);
		System.out.println("equals(\"Hello\") = " + isState);
	
		message.indexOf('e');
		message.indexOf("lo");
		message.substring(2);
		message.substring(2,4);
		message.replace("11", "*@");
// �޼ҵ� �����ε�: �޼ҵ� �̸��� ���������� ���� ���ڰ��� ������ ������ �ٸ��� ���ǵ� ��.	
		
		System.out.println("indexOf('e') " + message.indexOf('e')); //1����ġ 
		System.out.println("indexOf(\"lo\") " + message.indexOf("lo")); // 3�� ��ġ
		System.out.println("indexOf(\"ol\") " + message.indexOf("ol")); // -1 : ã�� ���ڿ��� ���� �� 
		String test = "hello~hello~";
		System.out.println("test.indexOf(\"lo\") " + test.indexOf("lo")); // 3�� ��ġ
		System.out.println("test.lastIndexOf(\"lo\") " + test.lastIndexOf("lo")); // ��ġ�ϴ� ��������ġ 9��
		System.out.println("substring(2) " + message.substring(2)); //�κ�����: llo~
		System.out.println("substring(2,4) " + message.substring(2,4)); // ll 2��(4-2)
		System.out.println("replace(\"11\", \"*@\") " + message.replace("ll", "*@")); // ll�� *@�� ����
		System.out.println("startsWith(\"H\") = " + message.startsWith("H")); 
		System.out.println("endsWith(\"~\") = " + message.endsWith("~"));
	}

}
