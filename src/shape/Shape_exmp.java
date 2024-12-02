package shape;

class Shape {
	 public void printShape() {
	     System.out.println("This is shape");
	 }
	}

class Rectangle extends Shape {
	 public void printRectangle() {
	     System.out.println("This is rectangular shape");
	 }
	}
class Circle extends Shape {
	 public void printCircle() {
	     System.out.println("This is circular shape");
	 }
	}
class Square extends Rectangle {
	 public void printSquare() {
	     System.out.println("Square is a rectangle");
	 }
	}
public class Shape_exmp {

	public static void main(String[] args) {
		Square squareObj = new Square();
		 squareObj.printShape();     
	     squareObj.printRectangle();  
	     squareObj.printSquare();  

	}

}



