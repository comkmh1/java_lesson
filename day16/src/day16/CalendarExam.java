package day16;

import java.util.Calendar;
import java.util.TimeZone;

/* private�����ڿ� ���� ������ �̿��Ͽ� �̱����� ����� ���*/
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
		// �ֿ� ����� ���� ���ο��� �׳� ������ ����Ѵ�.
//		System.out.println(Calendar.YEAR);
//		System.out.println(Calendar.MONDAY);
		
		// Calendar ��ü ��������(�̱��� ����)
		// https://sujl95.tistory.com/2 ����
		Calendar now = Calendar.getInstance();
		
		// ����� ���
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH) + 1);	// 0 ~ 11
		System.out.println(now.get(Calendar.DATE));
		
		// �ú��� ���
		System.out.println(now.get(Calendar.HOUR));
		System.out.println(now.get(Calendar.MINUTE));
		System.out.println(now.get(Calendar.SECOND));
		
		// ���� �� ���� ���ĸ� ���
		System.out.println(now.get(Calendar.DAY_OF_WEEK));	// ��, ���ڷ� ǥ��
		System.out.println(now.get(Calendar.AM_PM));		// ��, ���ڷ� ǥ��
		
		switch(now.get(Calendar.DAY_OF_WEEK)) {
			case Calendar.SUNDAY: System.out.println("��"); break;
			case Calendar.MONDAY: System.out.println("��"); break;
			case Calendar.TUESDAY: System.out.println("ȭ"); break;
			case Calendar.WEDNESDAY: System.out.println("��"); break;
			case Calendar.THURSDAY: System.out.println("��"); break;
			case Calendar.FRIDAY: System.out.println("��"); break;
			case Calendar.SATURDAY: System.out.println("��"); break;
		}
		
		switch(now.get(Calendar.AM_PM)) {
			case Calendar.AM: System.out.println("����"); break;
			case Calendar.PM: System.out.println("����"); break;
		}
		
		// ���� ����� �ú��ʸ� ���
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DATE);
		int hour = now.get(Calendar.HOUR);
		int min = now.get(Calendar.MINUTE);
		int sec = now.get(Calendar.SECOND);
		
		System.out.println(year + "/" + month + "/" + day + " " + hour + ":" + min + ":" + sec);
		
		
		
		// �̱��� ������ ����� ��� ��ü�� �޸� �ּҰ� �����Ѵ�.
//		Singleton a1 = Singleton.getInstance();
//		Singleton a2 = Singleton.getInstance();
//		Singleton a3 = Singleton.getInstance();
//		
//		System.out.println(System.identityHashCode(a1));
//		System.out.println(System.identityHashCode(a2));
//		System.out.println(System.identityHashCode(a3));
		
		System.out.println("Ȯ���ϱ�");
	}
}














