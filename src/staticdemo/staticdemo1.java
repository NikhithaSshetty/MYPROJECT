package staticdemo;

public class staticdemo1 {
		int a=10;
		static int b=20;
		

		static void m1() {
			System.out.println("this is m1");
		}
		
		void m2() {
			System.out.println("this is m2");
		}
		public static void main(String[] args) {
		
			System.out.println("b");
			m1();
			staticdemo1 sd=new staticdemo1();
			System.out.println(sd.a);
			sd.m2();
	}

}
	
	
