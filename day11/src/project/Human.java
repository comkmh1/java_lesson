package project;

class Human {
	char type; // ¼ºº°

	public Human() {
		this.type = 0;
	}
	
	public Human(char type) {
		this.type = type;
	}
	
	// getter
	public char getType() {
		return type;
	}

	// setter
	public void setType(char type) {
		this.type = type;
	}
}