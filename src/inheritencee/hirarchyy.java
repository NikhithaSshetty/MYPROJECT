package inheritencee;

class Parent{
	void display(int a) {
		System.out.println(a);
	}
}

class child extends Parent{
	void print(int b) {
		System.out.println(b);	
	}
}

class child2 extends Parent{
	void show(int c) {
		System.out.println(c);
	}
}



public class hirarchyy {

	public static void main(String[] args) {
	   child c1=new child();
	   c1.display(20);
	   c1.print(30);
	   child2 c2=new child2();
	   c2.show(10);
	   c2.display(50);
	   
		
	}

}
