package stream;

import java.util.stream.Stream;

public class stream1 {

	public static void main(String[] args) {

//		 Step 1  Build Stream 
		Integer a[] = {1,2,3,4,5,6,7,8,9};
		Stream<Integer> s = Stream.of(a);
		
//		Step 2  Transform Stream 
		
		Stream<Integer> s2 = s.filter(x->x%2==0);
		
//		Step 3 Collection reasult 
		
		s2.forEach(i->System.out.println(i));
		
	}

}
