package Java_oops;

public class class_emp {

	int eid;
	String ename;
	String ejob;
	int sal;
	//Methods
	void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(ejob);
		System.out.println(sal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class_emp emp=new class_emp();
		emp.eid=101;
		emp.ename="nikita";
		emp.ejob="trainer";
		emp.sal=200000;
		emp.display();
	}
}
