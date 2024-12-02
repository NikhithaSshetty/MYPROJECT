package wrapper_classes;

public class Data_conv {

	public static void main(String[] args) {
		//int, double boolean chat----->string
		int a=10;
		double d=10.5;
		char c='A';
		boolean bool=true;
		
		
		String s=String.valueOf(bool);
		System.out.println(s);
		
		s=String.valueOf(d);
		System.out.println(s);
		
		s=String.valueOf(c);
		System.out.println(s);
		
		s=String.valueOf(a);
		System.out.println(s);
		}

}
