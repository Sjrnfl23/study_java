package ch07;

public class MyFriendDetailInfoExample {

	public static void main(String[] args) {
		MyFriendDetailInfo aaa= new MyFriendDetailInfo();
		aaa.setName("이순신");
		aaa.setYears(50);
		aaa.setAddress("서울특별시 강남구 어디동");
		aaa.setPhoneNumber("010-9999-9999");
		
		System.out.println("이름: "+aaa.getName());
		System.out.println("나이: "+aaa.getYears());
		System.out.println("주소: "+aaa.getAddress());
		System.out.println("전화번호: "+aaa.getPhoneNumber());

	}

}
