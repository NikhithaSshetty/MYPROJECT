package Functionss;

class Value{
	int add(int num1,int num2) {
	int sum;
	sum=num1+num2;
	return sum;
	}
	
}
public class Acceptinputandreturn {

	public static void main(String[] args) {
		Value v=new Value();
		int res=v.add(100,30);
		System.out.println(res);

	}
}

