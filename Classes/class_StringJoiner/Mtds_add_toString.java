package class_StringJoiner;

import java.util.StringJoiner;

public class Mtds_add_toString {

	public static void main(String[] args) {
		
		   StringJoiner sj = new StringJoiner(":", "[", "]");
		     sj.add("George").add("Sally").add("Fred");
		    String desiredString = sj.toString();
		    
		   System.out.println(sj.toString());
		
	}
}
