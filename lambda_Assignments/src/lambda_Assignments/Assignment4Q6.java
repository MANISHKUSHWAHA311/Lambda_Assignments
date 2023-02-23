package lambda_Assignments;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Assignment4Q6 {
	
	static List<String> list = Arrays.asList("abhay", "bhavishya", "chris", "deepak", "elephant", "fox");

	public static List<String> convertToUpperCase(List<String> list) {
		
		UnaryOperator<String>unOperator=String::toUpperCase;
		list.replaceAll(unOperator);
		
		return list;
	}

	public static void main(String[] args) {
		
	   
		List<String>list=Arrays.asList("abhay", "bhavishya", "chris", "deepak", "elephant", "fox");
		System.out.println(convertToUpperCase(list)); 
		
		
	}

}


