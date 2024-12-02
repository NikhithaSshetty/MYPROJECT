package project1;

import java.util.Scanner;

public class array {

	/*public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter a number");
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}*/
	
	/*int n=1;
	while(n<11)
	{
			System.out.println(n);
			n++;
	}*/
		
		
	/*public static void main(String[] args) {
		int arr[][]=new int[2][2];
		Scanner scan=new Scanner(System.in);
		arr[0][0]=10;
		arr[0][1]=20;
		arr[1][0]=30;
		arr[1][1]=40;
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		
	}*/
	
	public static void main(String[] args) {
		int arr[][]=new int[2][2];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println("enter number["+i+"]["+j+"]:");
				arr[i][j]=scan.nextInt();
				
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println(arr[i][j]+ " ");
			}
		}
			
			
	}
	
	
}
