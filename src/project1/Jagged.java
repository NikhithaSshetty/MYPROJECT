package project1;

import java.util.Scanner;

public class Jagged {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][];
		arr[0]=new int[2];
		arr[1]=new int[3];
		arr[2]=new int[4];
		for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("enter number"+i+"th row"+" "+j+"th column");
			arr[i][j]=sc.nextInt();
	}
	
		}
	}

}
