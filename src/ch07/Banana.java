package ch07;

public class Banana extends Apple {
	
	private String strBanana="Banana";
	

	public void printBanana() {
		System.out.println("banana");
	}
	public String getStrBanana() {
		return strBanana;
	}

	public void setStrBanana(String strBanana) {
		this.strBanana = strBanana;
	}

}
