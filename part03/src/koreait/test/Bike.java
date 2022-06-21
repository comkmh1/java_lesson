package koreait.test;
//작성자 안동근	
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
		return String.format("추가 할인 행사 - %d %% 인하", obj);
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String ride() {
		return String.format("당신은 이것을 시속 %dkm로 탈 수 있습니다.",speed);
	
	}

	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", price=" + price + ", prdName=" + prdName + "]";
	}
	
	
	
	
	

	




}
