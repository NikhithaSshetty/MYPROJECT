package Functionss;


//no inputs no return


class Calculator{
	void add() {  //void not accepts inputs/nothing
		int sum1=10;
		int sum2=20;
		int sum =sum1+sum2;
		System.out.println("The sum is"+" "+sum);
	}
}

public class About_functions {
		
	public static void main(String[] args) {
		
		Calculator cl=new Calculator();
		cl.add();
		
	}

}
