package day16;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {
	public static void main(String[] args) {
		Date now = new Date();
		
		// 일단 출력해보자
		System.out.println(now);
		
		// 년월일 시분초도 모두 표시 가능하다.
		// 하지만 Deprecated(비권장 : 나중에 삭제 예정) 되저 있어
		// 이제부터는 사용하지 않는다. 몇개월 또는 몇년후 삭제될 가능성이 크다.
		System.out.println(now.getYear() + 1900);
		System.out.println(now.getMonth() + 1);
		System.out.println(now.getDate());
		
		// 그럼 일단 SimpleDateFormat로 출력
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sdf.format(new Date()));
		
		// 내가 보기 편한 형식 날자로 표시해보자
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println(sdf1.format(now));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy년 M월 d일 h시 mm분 ss초");
		System.out.println(sdf2.format(now));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		System.out.println(sdf3.format(now));
	}
}
