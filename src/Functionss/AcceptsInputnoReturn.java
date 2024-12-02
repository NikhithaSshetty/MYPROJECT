package Functionss;


class Calculator1{
	void add(int sum1,int sum2) {  //void not accepts inputs/nothing
		int sum =sum1+sum2;
		System.out.println("The sum is"+" "+sum);
	}
}

public class AcceptsInputnoReturn {

	public static void main(String[] args) {
		Calculator1 cl=new Calculator1();
		cl.add(20,40);

	}

}
