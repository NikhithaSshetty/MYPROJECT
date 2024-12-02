package project1;

public class Condition {

	public static void main(String[] args) {
		/*int a=10;
		if(a<5) {
			System.out.println("number is less then 20");
		}else {
			System.out.println("number not less then 20");
		}*/
		
		/*int age=60;
		if(age<=80) {
			System.out.println("age is 80");
		}else if(age<=30){
			System.out.println("age is 30");
		}else if(age<=40) {
			System.out.println("age is 40");
		}else {
			System.out.println("he is gay");
		}*/
		
		int day=9;
		switch(day) {
		case 1:{
			System.out.println("monady");
			break;
		}
		case 2:{
			System.out.println("tuesday");
			break;
		}
		case 3:{
			System.out.println("wednesday");
			break;
		}
		case 4:{
			System.out.println("saturday");
			break;
		}
		default:{
			System.out.println("default");
			break;
		}
		}
		
	}

}
