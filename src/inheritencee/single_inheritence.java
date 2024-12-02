package inheritencee;


class A{						   //parent class
	int a=100;
	void display() {
		System.out.println(a);	}
}

class B extends A{                 ///child class
	int b=200;
	void print() {
		System.out.println(b);
	}
}

public class single_inheritence {

	public static void main(String[] args) {
		B obj=new B();
		obj.display();
		obj.print();
		//System.out.println(obj.a);
		//System.out.println(obj.b);

	}

}
