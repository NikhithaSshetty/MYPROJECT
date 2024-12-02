package abstract_exmp;

import java.util.Scanner;

public class Circle extends Shape11{
	
	float radius;
	
	@Override
	void collectinput() {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter radius");
		radius=scan.nextFloat();
	}
	@Override
	void calculatearea() {
		area=3.14f*radius*radius;
	}

}
