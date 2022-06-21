package project;

// �������̽��� ���(����)�ϴ� ��� implements SpecialJob
public class Boss extends Teacher implements SpecialJob {
	final static String JOB = "���弱����";
	final static String SCHOOL = "�ڸ���IT�б�";

	private int joblevel;
	private String jobname;
	private int roomno;
	
	public Boss() {
		this('��', "", 0);
		joblevel = 10;
		roomno = 101;
	}
	
	public Boss(char type, String name, int age) {
		// ���弱������ ���� ���� ����.
		// �׷��� className�� �б��̸����� ����
		super(SCHOOL, type, name, age);

		jobname = JOB;
		joblevel = 10;
		roomno = 101;
	}
	
	@Override
	public int getJobLevel() {
		return joblevel;
	}

	@Override
	public String getJobName() {
		return jobname;
	}

	public int getRoomNo() {
		return roomno;
	}
	
	public String getSchool() {
		return this.getClassName();
	}

	@Override
	public void setJobLevel(int joblevel) {
		this.joblevel = joblevel;
	}

	@Override
	public void setJobName(String jobname) {
		this.jobname = jobname;		
	}
	
	public void setRoomNo(int roomno) {
		this.roomno = roomno;
	}
	
	public void setSchool(String school) {
		this.setClassName(school);
	}
	
	@Override
	public void print() {
		System.out.println("============ ���� ���� ���� =============");
		System.out.println( this.getClassName() + "�� " + jobname + "�Դϴ�.");
		System.out.println("�̸��� " + this.getName() + "�Դϴ�.");
		System.out.println("���̴� " + this.getAge() + "�Դϴ�.");
		System.out.println("���ȣ�� " + roomno + "ȣ �Դϴ�.");
		System.out.println("�������δ� " + joblevel + "���� �Դϴ�.");
		System.out.println("=====================================");
	}
}
