package lambda_Assignments;

import java.util.ArrayList;

public class Assignment4Q4 {
	
public static ArrayList<String> removeOddLength(ArrayList<String> employeeList) {
		
		employeeList.removeIf(n -> n.length() % 2 != 0);
		return employeeList;
}

	public static void main(String[] args) {
		
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Manish");
		arr.add("Vivek");
		arr.add("Sumit");
		arr.add("Mayank");
		arr.add("Tanmay");
		arr.add("Bhavishya");

		ArrayList<String> arr1 = removeOddLength(arr);
		for (String str : arr1)
			System.out.println(str);

	}

}
