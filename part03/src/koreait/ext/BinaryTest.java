package koreait.ext;

public class BinaryTest {

	public static void main(String[] args) {
		
		
		System.out.println(String.format("%8s\t %8s\t %8s", "10진수","2진수","16진수"));
		for(int i =0; i < 100; i++) {
			System.out.println(String.format("%8d\t %8s\t %8s", i, Integer.toBinaryString(i), 
					Integer.toHexString(i)));
		}
											
	
	
	
	
	
	
	
	
	
	
	}

}
