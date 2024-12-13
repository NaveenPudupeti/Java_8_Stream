package OptionalClass;

import java.util.Optional;

public class OptionalClassDemo {

	public static void main(String[] args) {
		
		
		// of,empty,ofNullable --- is a static methods
		
		//String email = null;
	    String email= "Naveen@gmail.comm";   //check
		
		
  // 1. Empty()
		
		//Optional<Object> emptyOptional = Optional.empty();
		//System.out.println(emptyOptional);
		
	//2.of()
	//	Optional<String>  emailoptional = Optional.of(email);
	//	System.out.println(emailoptional);
		
		//3.odNullable()
		
		//Optional<String> emailOptional = Optional.ofNullable(email);
		//System.out.println(emailOptional);
		
		//get()
		//System.out.println(emailOptional.get());   //get() is not used  for realtimme 

		//if(emailOptional.isPresent()) {
			//System.out.println(emailOptional.get());	
		//}
		//else {
			//System.out.println("no value present");
		//}
		
		//orElse() Method
		Optional<String> stringOptional = Optional.ofNullable(email);
		String defaultOptional= stringOptional.orElse("drfault@gamil.com");
		System.out.println(defaultOptional);
		
		String defaultOptional2 = stringOptional.orElseGet(() ->"default@gmmail.com");
		System.out.println(defaultOptional2);
		
	}

}