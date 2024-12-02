package thiskeyword;

public class keyword {

	int x,y;
	keyword(int x,int y){
		this.x=x;
		this.y=y;
		
	}
	 void display() {
		 System.out.println(x);
		 System.out.println(y);
	 }
	public static void main(String[] args) {
		keyword th=new keyword(200,890);
		th.display();

	}

}
