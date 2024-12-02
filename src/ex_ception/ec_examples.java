package ex_ception;

import java.util.Scanner;

public class ec_examples {

		public static void main(String[] args) {
			 try {
		
			Scanner scan=new Scanner(System.in);
			System.out.println("enter value for a");
			int a=scan.nextInt();
			
			System.out.println("enter value for b");
			int b=scan.nextInt();
			
			int c=a/b;          //operation
			System.out.println("result is"+" "+c);
			 }catch(Exception e) {
			
			System.out.println("program is terminated");
			System.out.println("program iS excuted");
			 }
		}
	

}
