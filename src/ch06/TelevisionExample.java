package ch06;

public class TelevisionExample {

	public static void main(String[] args) {
		System.out.println(Television.company);
		System.out.println(Television.model);
		System.out.println(Television.info);
		
		Television television = new Television();
		
		System.out.println(television.company);
		System.out.println(television.model);
		System.out.println(television.info);

	}

}
