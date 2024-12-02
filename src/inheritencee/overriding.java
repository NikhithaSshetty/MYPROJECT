package inheritencee;

class Bank{
	int getROI()
	{
		return 0;
	}
}

class SBI extends Bank{
	int getROI()
	{
		return 10;
	}
}

class ICICI extends Bank{
	int getROI()
	{
		return 15;
	}
}

public class overriding {

	public static void main(String[] args) {
		
		Bank b=new Bank();
		System.out.println(b.getROI());
		
		SBI sbiobj=new SBI();
		//sbiobj.getROI();
		System.out.println(sbiobj.getROI());
		ICICI iciciobj =new ICICI();
		System.out.println(iciciobj.getROI());

	}

}
