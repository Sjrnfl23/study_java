package ch06;

public class Point {

	int point=0;
	int pointUse=0;
	int pointStack=0;
	
	public int usePoint(int point,int pointUse) {
		return point-pointUse;
	}
	public int stackPoint(int point,int pointStack) {
		return point+pointStack;
	}
	public void viewPoint(int point) {
		System.out.println(point);
	}
	
	//책목록 어디에서 삿고 얼마 등등
	
}
