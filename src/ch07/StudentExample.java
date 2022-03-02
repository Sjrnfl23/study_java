package ch07;

public class StudentExample {

	public static void main(String[] args) {
	
		Student student =new Student("Tony","1234-1234",21);
		
		System.out.println(student.name);
		System.out.println(student.ssn);
		System.out.println(student.studentNo);
		
		Student student2= new Student("cris","22142");
		
		System.out.println(student2.studentNo);
	}

}
