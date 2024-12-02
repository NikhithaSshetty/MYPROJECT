package Class_exmp;
class Parent {
	 public void printParent() {
	     System.out.println("This is parent class");
	 }
	}

class Child extends Parent {
	 public void printChild() {
	     System.out.println("This is child class");
	 }
	}
public class parentchild_exmp {

	public static void main(String[] args) {
		Parent parentObj = new Parent();
	     parentObj.printParent();
	     
	     Child childObj = new Child();
	     childObj.printChild();
	     
	     childObj.printParent();

	}

}

