package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class C65_FileWriteTest {

	public static void main(String[] args) {
		
		String filename = "C:\\temp\\자바테스트.txt";
	
		File file = new File(filename);
		
		//출력 기능을 갖는 클래스
// Unhanded exception type FileNotFoundException : 오류의 가능성이 있으므로 try ~ catch 필요하다.		
		
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

}
