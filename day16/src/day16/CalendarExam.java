package day16;

import java.util.Calendar;
import java.util.TimeZone;

/* private생성자와 정적 변수를 이용하여 싱글톤을 만드는 방법*/
class Singleton {
  private static Singleton uniqueInstance;
  private Singleton(){}
  public static Singleton getInstance(){
    if(uniqueInstance == null) uniqueInstance = new Singleton();
    return uniqueInstance;
  }
}

public class CalendarExam {
	public static void main(String[] args) {
		// 주요 상수는 실제 내부에서 그냥 정수로 사용한다.
//		System.out.println(Calendar.YEAR);
//		System.out.println(Calendar.MONDAY);
		
		// Calendar 객체 가져오기(싱글톤 패턴)
		// https://sujl95.tistory.com/2 참고
		Calendar now = Calendar.getInstance();
		
		// 년월일 출력
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH) + 1);	// 0 ~ 11
		System.out.println(now.get(Calendar.DATE));
		
		// 시분초 출력
		System.out.println(now.get(Calendar.HOUR));
		System.out.println(now.get(Calendar.MINUTE));
		System.out.println(now.get(Calendar.SECOND));
		
		// 요일 및 오전 오후를 출력
		System.out.println(now.get(Calendar.DAY_OF_WEEK));	// 단, 숫자로 표시
		System.out.println(now.get(Calendar.AM_PM));		// 단, 숫자로 표시
		
		switch(now.get(Calendar.DAY_OF_WEEK)) {
			case Calendar.SUNDAY: System.out.println("일"); break;
			case Calendar.MONDAY: System.out.println("월"); break;
			case Calendar.TUESDAY: System.out.println("화"); break;
			case Calendar.WEDNESDAY: System.out.println("수"); break;
			case Calendar.THURSDAY: System.out.println("목"); break;
			case Calendar.FRIDAY: System.out.println("금"); break;
			case Calendar.SATURDAY: System.out.println("토"); break;
		}
		
		switch(now.get(Calendar.AM_PM)) {
			case Calendar.AM: System.out.println("오전"); break;
			case Calendar.PM: System.out.println("오후"); break;
		}
		
		// 현재 년월일 시분초를 출력
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DATE);
		int hour = now.get(Calendar.HOUR);
		int min = now.get(Calendar.MINUTE);
		int sec = now.get(Calendar.SECOND);
		
		System.out.println(year + "/" + month + "/" + day + " " + hour + ":" + min + ":" + sec);
		
		
		
		// 싱글톤 패턴을 사용해 모든 객체의 메모리 주소가 동일한다.
//		Singleton a1 = Singleton.getInstance();
//		Singleton a2 = Singleton.getInstance();
//		Singleton a3 = Singleton.getInstance();
//		
//		System.out.println(System.identityHashCode(a1));
//		System.out.println(System.identityHashCode(a2));
//		System.out.println(System.identityHashCode(a3));
		
		System.out.println("확인하기");
	}
}














