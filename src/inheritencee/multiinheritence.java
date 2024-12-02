package inheritencee;

class X{
	int a=32;
	void display() {
		System.out.println(a);
	}
}

class Y extends X{
	int b=20;
	void show() {
		System.out.println(b);
	}
}

class Z extends Y{
	int c=30;
	void print() {
		System.out.println(c);
	}
}

public class multiinheritence {

	public static void main(String[] args) {
		Z obj=new Z();
		obj.display();
		obj.show();
		obj.print();
			
		

	}

}
