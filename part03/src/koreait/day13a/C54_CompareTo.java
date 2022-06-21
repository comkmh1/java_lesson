package koreait.day13a;

public class C54_CompareTo {

	public static void main(String[] args) {
//모든 객체에는 compareTo 메소드가 있습니다.
		
		String na = "kim";
		String you = "momo";
		String he = "Son";
		
		//String은 알파벳 사전 비교
		System.out.println("kim과momo : " + na.compareTo(you));	//-2(음수) :  kim < momo
		System.out.println("kim과Son : " + na.compareTo(he));	//24(정수) :  kim > Son

		int a = 12, b =45;
		System.out.println("a-b : " + (a-b));
		
		Integer aa =12;
		Integer bb =45;
		System.out.println("aa와bb : " + aa.compareTo(bb));
		aa = 90;
		System.out.println("aa와bb : " + aa.compareTo(bb));
		aa = 45;
		System.out.println("aa와bb : " + aa.compareTo(bb));
	
		//compareTo와 같은 비교는 sort(정렬) 에 사용됩니다.
		//정렬은 오름차순 , 내림차순 2가지 상태로 정렬 할 수 있습다다
		
	}

}
