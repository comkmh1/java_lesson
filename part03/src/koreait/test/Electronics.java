package koreait.test;
//작성자 안동근	
public class Electronics extends Product {

	private double kwh; 
	
	public Electronics() {
	}

	public Electronics(int price, String prdName) {
	this.price = price;
	this.prdName = prdName;
	}
		
	@Override
	public String sell(Object obj) {
		return String.format("묶음 상품 - %d (1set)", obj);
	}
		
		
	public double getKwh() {
		return kwh;
	}
	public void setKwh(double kwh) {
		this.kwh = kwh;
	}	
		
	public double power() {
			return kwh * 24;
	}

	@Override
	public String toString() {
		return "Electronics [kwh=" + kwh + ", price=" + price + ", prdName=" + prdName + "]";
	}
	
	
	
	
	
	

		
	}