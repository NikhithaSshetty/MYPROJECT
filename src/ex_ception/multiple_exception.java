package ex_ception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class multiple_exception {

	public static void main(String[] args) {
	try {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("enter value for a");
		int a=sc.nextInt();
		System.out.println("enter value for b");
		int b=sc.nextInt();
		int c=a/b;
		System.out.println("result is "+c);
		System.out.println("enter the array index");
		int index=sc.nextInt();
		arr[index]=5;
		System.out.println("program terminated normally");

	}
	catch (InputMismatchException e) {
		System.out.println("input mismatched");	
	}
	
	catch (ArithmeticException e) {
		System.out.println("arithmetic exception");	
	
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("array error");	
	}
	catch (Exception e) {
		System.out.println("program is normal");	
	}
}
}
