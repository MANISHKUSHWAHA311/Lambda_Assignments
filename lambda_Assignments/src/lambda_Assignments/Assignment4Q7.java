package lambda_Assignments;


import java.util.HashMap;
import java.util.Set;

public class Assignment4Q7 {
	
	public static String convertKeyValueToString(HashMap<String, Integer> map) {

		String str = "";
		Set<java.util.Map.Entry<String, Integer>> s = map.entrySet();

		for (java.util.Map.Entry<String, Integer> e : s) {
			str += e.getKey() + " ";
			str += e.getValue().toString() + " ";
		}
		return str;
	}

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("john", 1);
		map.put("chris", 2);
		map.put("rock", 3);
		System.out.println(convertKeyValueToString(map));
	}

}


