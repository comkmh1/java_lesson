package koreait.test;
//작성자 안동근	
public class ProductTest {

	public static void main(String[] args) {
		//[13]
		Product[] cart = new Product[10];
		
		cart[0] = new Bike(123000,"MTB",25);
		cart[1] = new Electronics(35000,"USB");
		cart[3] = new Bike(99000,"삼천리",15);
		cart[5] = new Electronics(117000,"ipad");
		cart[7] = new Electronics(2250000,"lg 냉장고");
		//[14]
		Electronics elec = (Electronics)cart[7];
		elec.setKwh(0.9);
		System.out.println(elec.power());
		//[15]
		for(int i = 0; i < cart.length; i++)
			if(cart[i] != null && cart[i].price >= 100000)
				System.out.println(cart[i]);
		//[16]
		for(Product temp : cart) {
			if(temp != null && temp instanceof Bike) {
				Bike bik = (Bike)temp;
				System.out.println(bik.ride());
			}
		}
		
	
	}

}
