package koreait.day16;
//Exception 처리 명령이 별도 메소드에서 정의될 때 다른 방법:
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C68_FileReadWrite {
	//main 메소드가 throws Exception 한다면 jvm 에게 전달 처리내용은 printStackTrace결과와 동일.
	public static void main(String[] args) {
		
		String filename = "C:\\temp\\자바테스트0617.txt";
	try {
		fileWrite2(filename);
//		filename = "C:\\temp\\자바테스트0618.txt";	//없는 파일 테스트 
		fileRead(filename);
	}catch(FileNotFoundException e) {
		System.out.println("사용자 실행 오류 : " + e.getMessage());
		System.out.println("파일이 존재하는지 확인하세요");
	}
	
	
	
	//출력 기능을 갖는 클래스
// Unhanded exception type FileNotFoundException : 오류의 가능성이 있으므로 try ~ catch 필요하다.		
		
		
	}	
	
	public static void fileWrite(String filename) {
		
		File file = new File(filename);
	//	생성자 메소드java.io.PrintWriter.PrintWriter(File file) throws FileNotFoundException
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(file);	//file 로 지정된 위치에 출력을 위한 객체
			pw.println("모모 90 89 82");
			pw.println("다현 89 90 82");
			pw.println("나연 82 89 90");
			System.out.println("파일 출력이 완료되었습니다."); // system.out : 표준 출력 (콘솔 출력)
		
		}catch(FileNotFoundException e) {
			System.out.println("오류 발생 : " + e.getMessage());
		} finally {
			pw.close();
		}
	}

		//	방법2 : throws 키워드는 해당 Exception 처리를 호출한 곳(여기서는 main메소드)으로 넘긴다. 
//		
		
		public static void fileWrite2(String filename) throws FileNotFoundException {
			
			File file = new File(filename);
			
			PrintWriter pw = null;
			
			pw = new PrintWriter(file);	//file 로 지정된 위치에 출력을 위한 객체
			pw.println("모모 90 89 82");
			pw.println("다현 89 90 82");
			pw.println("나연 82 89 90");
			System.out.println("파일 출력이 완료되었습니다."); // system.out : 표준 출력 (콘솔 출력)
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