package day15;

import java.util.Arrays;

public class StringExam {
	public static void main(String[] args) {
		// �Ϲ������� String Ŭ���� ���� ���� ���� ����ϴ� �ڵ� ���� ���
		String str1 = "Hello";
		String str2 = "Hello";
		
		// Ŭ���� ��ü ���� ��Ĵ�� new �����ڸ� �̿��� ��ü ���� ���
		String nstr1 = new String("Hello");
		String nstr2 = new String("Hello");
		
		// �� ����� �޸� �ּ�(����) ��
		System.out.println("String ��ü�� �޸� �ּ� Ȯ�� ===============>");
		System.out.printf("str1 address : 0x%X\n", System.identityHashCode(str1));
		System.out.printf("str2 address : 0x%X\n", System.identityHashCode(str2));
		
		System.out.printf("nstr1 address : 0x%X\n", System.identityHashCode(nstr1));
		System.out.printf("nstr2 address : 0x%X\n", System.identityHashCode(nstr2));
		
		System.out.println("\n�� �����ڸ� ���� String ��ü ��");
		System.out.println(str1 == str2);
		System.out.println(str1 == nstr1);
		System.out.println(str1 == nstr2);
		System.out.println(nstr1 == nstr2);
		
		System.out.println("\nequals() �޼ҵ� �̿� �� �� ================>");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(nstr1));
		System.out.println(str1.equals(nstr2));
		System.out.println(nstr1.equals(nstr2));
		
		// char charAt(int index) ����� ��ġ(index)�� �ִ� ���ڸ� �˷��ش�.
		System.out.println("===========================================");
		System.out.println(str1.charAt(1));
		 
		// int compareTo(String str) �Ű����� ���� ���ڿ�(str)�� ������ ��, ���� 0�� �� ����, �� ���.
		System.out.println(str1.compareTo("Hello"));
		System.out.println(str1.compareTo("Gello"));
		System.out.println(str1.compareTo("Iello"));
		System.out.println(str1.compareTo("Aello"));
		System.out.println(str1.compareTo("Aello"));
		System.out.println(str1.compareTo("Hallo"));
		
		// int indexOf(int ch) �־��� ����(ch)�� ���ڿ��� �����ϴ��� Ȯ�� ��ġ(index)��ȯ, ������ -1��ȯ
		System.out.println(str1.indexOf('H'));
		System.out.println(str1.indexOf('l'));
		System.out.println(str1.indexOf('L'));
		System.out.println(str1.indexOf("Hell"));
		System.out.println(str1.indexOf("llo"));
		
		// String substring(int begin)
		// String substring(int begin, int end)
		// �־��� ������ġ(begin)���� �� ��ġ(end) ������ ���Ե� ���ڿ��� ��ȯ
		// ��, ������ġ�� ���Ե����� �� ��ġ�� ���Ե��� �ʴ´�.
		System.out.println(str1.substring(1));
		System.out.println(str1.substring(1, 3));
		System.out.println(str1.substring(2, 3));
		
		// int length() ���ڿ��� ���� ��ȯ
		System.out.println(str1.length());
		
		// String replace(char old, char nw) ���ڿ� �� ����(old)�� ���ο� ����(new)�� ġȯ
		System.out.println(str1.replace("l", "L"));
		System.out.println(str1.replace("el", "EL"));
		
		String text = "Welcome Hello Hello Hello Welcome";
		System.out.println(text);
		System.out.println(text.replace("Hello", "�ȳ��ϼ���"));
		System.out.println(text.replaceAll("Hello", "�ȳ��ϼ���"));
		
		System.out.println("===========================================");
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		System.out.println(" �ȳ� �ϼ���   ".trim());
		System.out.println(" �ȳ� �ϼ���   ".replaceAll(" ", ""));
		
		String sp = "���#����#����#�ݰ���!";
		String arr[] = sp.split("#");
		System.out.println(Arrays.toString(arr));
		
		String jointxt = String.join(" ", arr);
		System.out.println(jointxt);
	}
}
	












