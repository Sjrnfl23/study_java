package ch13;

public class BoxExample {

	
	public static void main(String[] args) {
		
		Box<Integer> box=new Box<Integer>();
		box.set(11);
		int number= box.get();
		System.out.println("number: "+number);
		
		Box<String> box2=new Box<String>();
		box2.set("장원영");
		String str=box2.get();
		System.out.println("str: "+str);
	}

}
