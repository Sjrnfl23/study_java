package ch06;

public class SecondCarExample {

	public static void main(String[] args) {
		SecondCar sc1=new SecondCar();
		
		System.out.println("company:"+sc1.company);
		System.out.println("model:"+sc1.model);
		System.out.println("color:"+sc1.color);
		System.out.println("maxspeed:"+sc1.maxSpeed);
		
		SecondCar sc2=new SecondCar("소나타");
		System.out.println("-----------------");
		System.out.println("company:"+sc2.company);
		System.out.println("model:"+sc2.model);
		System.out.println("color:"+sc2.color);
		System.out.println("maxspeed:"+sc2.maxSpeed);
		
		System.out.println("-----------------");
		SecondCar sc3=new SecondCar("티코","하얀색");
		
		System.out.println("company:"+sc3.company);
		System.out.println("model:"+sc3.model);
		System.out.println("color:"+sc3.color);
		System.out.println("maxspeed:"+sc3.maxSpeed);
		System.out.println("-----------------");
		
		SecondCar sc4=new SecondCar("프라이드","빨간색",200);
		
		System.out.println("company:"+sc4.company);
		System.out.println("model:"+sc4.model);
		System.out.println("color:"+sc4.color);
		System.out.println("maxspeed:"+sc4.maxSpeed);

	}

}
