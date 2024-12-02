package Functionss;

class Return{
	int add() {
		int num1,num2,sum;
		num1=10;
		num2=20;
		sum=num1+num2;
		return sum;
		
	}
	
}
public class NoinputsReturnvalue {

	public static void main(String[] args) {
	Return re=new Return();
	int res=re.add();
	System.out.println("The sum is"+" "+res);
	}

}
