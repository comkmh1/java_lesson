package koreait.test;
//�ۼ��� �ȵ���	
public class Bike extends Product{
	private int speed;
	
	public Bike() {
	}
	
	public Bike(int price, String prdName, int speed) {
	this.prdName = prdName;
	this.price = price;
	this.speed = speed;
	}
	
	@Override
	public String sell(Object obj) {
		return String.format("�߰� ���� ��� - %d %% ����", obj);
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String ride() {
		return String.format("����� �̰��� �ü� %dkm�� Ż �� �ֽ��ϴ�.",speed);
	
	}

	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", price=" + price + ", prdName=" + prdName + "]";
	}
	
	
	
	
	

	




}
