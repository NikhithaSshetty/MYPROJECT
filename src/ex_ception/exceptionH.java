package ex_ception;

import java.util.Scanner;

public class exceptionH {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter value for a");
		int a=scan.nextInt();
		
		System.out.println("enter value for b");
		int b=scan.nextInt();
		
		int c=a/b;          //operation
		System.out.println("result is"+" "+c);
		System.out.println("program is terminated");
		
	}

}
