package stringreverse;
import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	 System.out.print("Enter a string to reverse: ");
     String original = scanner.nextLine();
     
     String reversed = new StringBuilder(original).reverse().toString();
     System.out.println("Reversed string: " + reversed);
	}

}



