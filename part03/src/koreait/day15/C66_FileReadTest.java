package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
// 작성자 안동근
public class C66_FileReadTest  {
	public static void main(String[] args) {
		
		String filename = "C:\\temp\\자바테스트.txt";
		String filename2 = "C:\\temp\\자바테스트2.txt";
	
		File file = new File(filename);
		
		//출력 기능을 갖는 클래스
 //Unhanded exception type FileNotFoundException : 오류의 가능성이 있으므로 try ~ catch 필요하다.		
		//Scanner : 입력 기능을 갖는 클래스 
		Scanner sc = null;
		try {
			
			sc = new Scanner(file);
			System.out.println("파일에서 읽은 내용 : " + sc.nextLine());
			System.out.println("파일에서 읽은 내용 : " + sc.nextLine());
			System.out.println("파일에서 읽은 내용 : " + sc.nextLine());
			System.out.println("파일 출력이 완료되었습니다."); // system.int : 표준 입력 (콘솔 입력)
			while(sc.hasNext()){	// 구분자 엔터를 기준으로 다음 데이터가 있으면 true 
				System.out.println(sc.nextLine());
			}
			System.out.println("파일 읽기가 완료되었습니다.");
		}catch(FileNotFoundException e) {
			System.out.println("오류 발생 : " + e.getMessage());
		} finally {
			if(sc!=null)
			sc.close();
		}
		
		
			
// try~ catch 자원해제 방법을 finally 안쓰고  => java 7 버전 부터 다른 구문 형식이 가능합니다. 
	
// try-with-resource 형식으로 변경 	
	/*public static void main(String[] args) {
		String filename = "C:\\temp\\자바테스트.txt";	//읽기 : 존재하는 파일
		String filename2 = "C:\\temp\\자바테스트2.txt";	//쓰기 : 존재하지 않는 파일
		
		File ifile = new File(filename);
		File ofile = new File(filename);
		
		 
		try(Scanner sc = new Scanner(ifile);PrintWriter pw = new PrintWriter(ofile);){
			
			while(sc.hasNext()){	// 구분자 엔터를 기준으로 다음 데이터가 있으면 true 
			String temp = sc.nextLine();
			System.out.println(temp);
			pw.println();
			}
			System.out.println("파일 복사 완료");
			
		}catch(FileNotFoundException e) {
			System.out.println("오류 발생 : " + e.getMessage());
	*/
	}
	
	}
//
		
	
	





