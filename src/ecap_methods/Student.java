package ecap_methods;

public class Student {
	String name;
	String qualification;
	int age;
	
	Student(){
		System.out.println("student constructor");
	}
	
	void study() {
		System.out.println("student is studying");
	}
	
	void run() {
		System.out.println("student is running");
	}
	
	void sleep() {
		System.out.println("student is sleeping");
	}
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.study();
		s1.run();
		s1.sleep();
	}
}
