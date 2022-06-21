package day16;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {
	public static void main(String[] args) {
		Date now = new Date();
		
		// �ϴ� ����غ���
		System.out.println(now);
		
		// ����� �ú��ʵ� ��� ǥ�� �����ϴ�.
		// ������ Deprecated(����� : ���߿� ���� ����) ���� �־�
		// �������ʹ� ������� �ʴ´�. ��� �Ǵ� ����� ������ ���ɼ��� ũ��.
		System.out.println(now.getYear() + 1900);
		System.out.println(now.getMonth() + 1);
		System.out.println(now.getDate());
		
		// �׷� �ϴ� SimpleDateFormat�� ���
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sdf.format(new Date()));
		
		// ���� ���� ���� ���� ���ڷ� ǥ���غ���
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		System.out.println(sdf1.format(now));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy�� M�� d�� h�� mm�� ss��");
		System.out.println(sdf2.format(now));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		System.out.println(sdf3.format(now));
	}
}
