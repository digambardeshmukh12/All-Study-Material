package java8_1;

import java.util.function.*;

public class preDefineFunctionalInterfaces {

	public static void main(String[] args) {
		
		Consumer<String> c =(s) -> System.out.println("Hello" + s);
		c.accept("Ravan");
		
		
		Supplier<Integer> x =()-> 40;
		System.out.println("Value given by supplier is"+x.get());
		
		
		Predicate<Integer> p = (y) -> y>67;
		System.out.println(p.test(343));
		
		Function<String , Integer> f1 = (s1) -> s1.length();
		System.out.println(f1.apply("Ravan"));
		
		
		
		
		
	}
	
}
