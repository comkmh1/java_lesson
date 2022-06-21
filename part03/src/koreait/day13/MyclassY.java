package koreait.day13;
// InterfaceB ±¸ÇöÃ¼
public class MyclassY implements InterfaceB {

	@Override
	public String name(String name) {
		return "MyClassY : " +name;
	}
	
}
class MyclassZ implements InterfaceA,InterfaceB{

	@Override
	public void methodA() {
		System.out.println("MyclassZ methodA");
	}

	@Override
	public int methodB(int num) {
		System.out.println("MyclassZ methodB");		
		return 3333;
	}
	
	@Override
	public String name(String name) {
		return "MyClassZ : " +name;
	}
	}