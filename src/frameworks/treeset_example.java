package frameworks;

import java.util.TreeSet;

public class treeset_example {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(45);
		//ts.add(50);             doesn't allow duplicates
		//ts.add("nikhi");        doen't allow other datat ypes
		ts.add(20);
		ts.add(61);
		ts.add(900);
		System.out.println(ts);

	}

}
