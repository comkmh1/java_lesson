package koreait.day05;

public class C22_AssignTest {

	public static void main(String[] args) {

	
	//참고 : 증가연산자, 축약연산자(+=, -=, *=, /=,...)
	int i = 10, sum = 0; 
	i = i + 1;			//i = 11
	i += 1;				//i = 12
	i++;			    //i = 13 후치
	++i;				//i = 14 전치
	System.out.println("i++ ? " + i++ );	//출력은 14, i값은 15
	System.out.println("++i ? " + (++i));	//출력은 16, i값은 16
	
	sum = sum + i;
	sum += i; 
	System.out.println("sum ? " + sum);
	
	//
	i--;
	--i;
	sum = sum - 10;
	sum -= 10;
	
	
	
	}

}
