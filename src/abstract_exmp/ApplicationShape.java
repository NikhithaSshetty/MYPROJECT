package abstract_exmp;

public class ApplicationShape {

	public static void main(String[] args) {
		System.out.println("calculating area of circle");
		Circle sq=new Circle();
		sq.collectinput();
		sq.calculatearea();
		sq.display();
	}

}
