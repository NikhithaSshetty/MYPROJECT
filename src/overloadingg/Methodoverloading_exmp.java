package overloadingg;

class Adder{
	void add() {
		int num1,num2,sum; 
			num2=10;
		    num1=20;
			sum=num1+num2;
			System.out.println("the sum is "+sum);
	}

	void add(float a,float b) {
		   float res;
			res=a+b;
			System.out.println("the res is "+res);
	
		}
	void add(double a,double b) {
		    double res;
			res=a+b;
			System.out.println("the res is "+" "+res);
	
		}
	void add(int a,float b) {
	    float res;
		res=a+b;
		System.out.println("the res is "+" "+res);
	
	}
}
	
public class Methodoverloading_exmp {

	public static void main(String[] args) {
	
		Adder ad=new Adder();
		ad.add();
		ad.add(1.22f,33.4f);
		ad.add(123.2,432.46);
		ad.add(23,4.3f);
	}


}
