package ch10;

public class TryCatchException {
	public static void main(String[] args) {
		int a[]=new int[5];
		
		try {
			System.out.println(a[-1]);
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			System.out.println("끝");
		}
		
	}

	
}
