package lambda_Assignments;

import java.util.ArrayList;
import java.util.function.Consumer;



public class Assignment4Q8  {
	
	

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(13);
		arr.add(24);
		arr.add(37);
		arr.add(46);
		arr.add(55);
		
		    
		
		 // First method
		Thread myThread=new Thread(()->{
		Consumer<Integer>consumer=System.out::println;
		arr.forEach(consumer);
		});
		myThread.start();
		
		
		//second method
//		Thread myThread = new Thread( () -> arr.forEach(n -> System.out.println(n)));
//		myThread.start();
		

	}

	

}
