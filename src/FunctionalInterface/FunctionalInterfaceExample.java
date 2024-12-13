package FunctionalInterface;

import java.util.function.Function;


class FunctionImpl implements Function<String,Integer>{

	@Override
	public Integer apply(String s) {
		
		return s.length();
	}
	
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		
		
		Function<String,Integer> function = (String s) -> {
			
			return s.length();
		
		
		//Function<String,Integer> function =	(String s) ->  s.length();
		
//	System.out.println(	function.apply("Naveen"));

		
	};
System.out.println(function.apply("Naveen"));
	}
	}
