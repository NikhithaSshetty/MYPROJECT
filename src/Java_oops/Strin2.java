package Java_oops;

public class Strin2 {

	// constant pool
	
	/*public static void main(String[] args) {
		String str1="nikhi";
		String str2="nikhi";
		
		// for comparing we use str1.equals(str2)
		if (str1==str2)
		
		{
			System.out.print("address is same");
		}else {
			System.out.print("not same");
		}
	}*/
	
	
	
	/*//non constant pool
	
	public static void main(String[] args) {
		String str1=new String("nikhi");
		String str2=new String("nikhi");
		
		// for comparing we use str1.equals(str2)
		if (str1==str2)
		
		{
			System.out.print("address is same");
		}else {
			System.out.print("address is different");
		}
	}*/
	
	public static void main(String[] args) {
		String str1="nikhi";              //constant pool
		String str2=new String("Nikhi");  //non constant pool
		
		// for comparing we use str1.equals(str2)
		//if (str1==str2)
		if(str1.equals(str2))
		
		{
			System.out.print("address is same");
		}else {
			System.out.print("address is different");
		}
	}

}
