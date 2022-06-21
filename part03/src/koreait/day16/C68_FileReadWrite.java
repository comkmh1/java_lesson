package koreait.day16;
//Exception ó�� ����� ���� �޼ҵ忡�� ���ǵ� �� �ٸ� ���:
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C68_FileReadWrite {
	//main �޼ҵ尡 throws Exception �Ѵٸ� jvm ���� ���� ó�������� printStackTrace����� ����.
	public static void main(String[] args) {
		
		String filename = "C:\\temp\\�ڹ��׽�Ʈ0617.txt";
	try {
		fileWrite2(filename);
//		filename = "C:\\temp\\�ڹ��׽�Ʈ0618.txt";	//���� ���� �׽�Ʈ 
		fileRead(filename);
	}catch(FileNotFoundException e) {
		System.out.println("����� ���� ���� : " + e.getMessage());
		System.out.println("������ �����ϴ��� Ȯ���ϼ���");
	}
	
	
	
	//��� ����� ���� Ŭ����
// Unhanded exception type FileNotFoundException : ������ ���ɼ��� �����Ƿ� try ~ catch �ʿ��ϴ�.		
		
		
	}	
	
	public static void fileWrite(String filename) {
		
		File file = new File(filename);
	//	������ �޼ҵ�java.io.PrintWriter.PrintWriter(File file) throws FileNotFoundException
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(file);	//file �� ������ ��ġ�� ����� ���� ��ü
			pw.println("��� 90 89 82");
			pw.println("���� 89 90 82");
			pw.println("���� 82 89 90");
			System.out.println("���� ����� �Ϸ�Ǿ����ϴ�."); // system.out : ǥ�� ��� (�ܼ� ���)
		
		}catch(FileNotFoundException e) {
			System.out.println("���� �߻� : " + e.getMessage());
		} finally {
			pw.close();
		}
	}

		//	���2 : throws Ű����� �ش� Exception ó���� ȣ���� ��(���⼭�� main�޼ҵ�)���� �ѱ��. 
//		
		
		public static void fileWrite2(String filename) throws FileNotFoundException {
			
			File file = new File(filename);
			
			PrintWriter pw = null;
			
			pw = new PrintWriter(file);	//file �� ������ ��ġ�� ����� ���� ��ü
			pw.println("��� 90 89 82");
			pw.println("���� 89 90 82");
			pw.println("���� 82 89 90");
			System.out.println("���� ����� �Ϸ�Ǿ����ϴ�."); // system.out : ǥ�� ��� (�ܼ� ���)
			pw.close();
		}
			
		public static void fileRead(String filename) throws FileNotFoundException{
			
			File file = new File(filename);
			Scanner sc = new Scanner(file);
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		}
	
	
	
	
	
	
	
	
		

	
	
	
	
	
	
	
	
	
	
	
	
	
}