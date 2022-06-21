package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
// �ۼ��� �ȵ���
public class C66_FileReadTest  {
	public static void main(String[] args) {
		
		String filename = "C:\\temp\\�ڹ��׽�Ʈ.txt";
		String filename2 = "C:\\temp\\�ڹ��׽�Ʈ2.txt";
	
		File file = new File(filename);
		
		//��� ����� ���� Ŭ����
 //Unhanded exception type FileNotFoundException : ������ ���ɼ��� �����Ƿ� try ~ catch �ʿ��ϴ�.		
		//Scanner : �Է� ����� ���� Ŭ���� 
		Scanner sc = null;
		try {
			
			sc = new Scanner(file);
			System.out.println("���Ͽ��� ���� ���� : " + sc.nextLine());
			System.out.println("���Ͽ��� ���� ���� : " + sc.nextLine());
			System.out.println("���Ͽ��� ���� ���� : " + sc.nextLine());
			System.out.println("���� ����� �Ϸ�Ǿ����ϴ�."); // system.int : ǥ�� �Է� (�ܼ� �Է�)
			while(sc.hasNext()){	// ������ ���͸� �������� ���� �����Ͱ� ������ true 
				System.out.println(sc.nextLine());
			}
			System.out.println("���� �бⰡ �Ϸ�Ǿ����ϴ�.");
		}catch(FileNotFoundException e) {
			System.out.println("���� �߻� : " + e.getMessage());
		} finally {
			if(sc!=null)
			sc.close();
		}
		
		
			
// try~ catch �ڿ����� ����� finally �Ⱦ���  => java 7 ���� ���� �ٸ� ���� ������ �����մϴ�. 
	
// try-with-resource �������� ���� 	
	/*public static void main(String[] args) {
		String filename = "C:\\temp\\�ڹ��׽�Ʈ.txt";	//�б� : �����ϴ� ����
		String filename2 = "C:\\temp\\�ڹ��׽�Ʈ2.txt";	//���� : �������� �ʴ� ����
		
		File ifile = new File(filename);
		File ofile = new File(filename);
		
		 
		try(Scanner sc = new Scanner(ifile);PrintWriter pw = new PrintWriter(ofile);){
			
			while(sc.hasNext()){	// ������ ���͸� �������� ���� �����Ͱ� ������ true 
			String temp = sc.nextLine();
			System.out.println(temp);
			pw.println();
			}
			System.out.println("���� ���� �Ϸ�");
			
		}catch(FileNotFoundException e) {
			System.out.println("���� �߻� : " + e.getMessage());
	*/
	}
	
	}
//
		
	
	





