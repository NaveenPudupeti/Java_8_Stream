package MethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable{
	void print(String msg);
}

public class MethodReferenceDemo {
	
	public void display(String msg) {
		msg = msg.toUpperCase();
		System.out.println(msg);
	}
	
	public static int addition(int a,int b) {
		return(a+b);
	}

	public static void main(String[] args) {
		
		
		//1.Method reference to a static method
		
		//lambda Expression
		Function<Integer,Double> function =(input) -> Math.sqrt(input);
		System.out.println(function.apply(4));
		
		
		//using method reference
		
		Function<Integer,Double> functionMethodRef = Math::sqrt;
		System.out.println(functionMethodRef.apply(25));
		
		//Lambda Expression
		BiFunction<Integer , Integer, Integer> bifunctionLambda = (a,b) -> MethodReferenceDemo.addition(a , b);
		System.out.println(bifunctionLambda.apply(2, 4));
		
		//using method reference
		
		BiFunction<Integer, Integer,Integer> bifunctionMethodRef = MethodReferenceDemo::addition;
		System.out.println(bifunctionMethodRef.apply(10, 20));
		
		
		// 2.Method reference to an instance method of an object
		
		MethodReferenceDemo  methodRefrencesdemo = new MethodReferenceDemo();
		
		//Lambda Expression
		Printable printable =(msg) -> methodRefrencesdemo.display(msg);
		printable.print("hello world!");
		
		
		//using method reference
		
		Printable printableMethodRef =methodRefrencesdemo::display;
		System.out.println("Hello World!@");
		
		
		// 3. Method Reference to an instance method if an orbitrary object
		
		//Sometimes,we call a method of argument in the lambda expression.
		//In that case, we can use a method reference to call an instance
		//method of an orbitrary object of a specific type.
		
		Function<String , String> stringFunction = (String input) ->input.toLowerCase();   //input is orbitrary object
		System.out.println(stringFunction.apply("NAVEEN"));
		
		//using Method Reference
		Function<String,String> stringFunctionMethodRef = String::toLowerCase;
		System.out.println(stringFunctionMethodRef.apply("Naveen"));
		
		
		String[] strArray = {"A","E","I","O","U","a","e","i","o","u"};
	
		//Using lambda 
		
		Arrays.sort(strArray,(s1,s2) -> s1.compareToIgnoreCase(s2));
		
		//using method reference
		Arrays.sort(strArray,String::compareToIgnoreCase);
		
		
		//4.reference to a construtor
		
		List<String> fruits = new ArrayList<>();
		
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("grapes");
		
		Function<List<String> , Set<String>> setFunction = (fruitsList) ->new HashSet<>(fruitsList);
		
		System.out.println(setFunction.apply(fruits));
		
		//using method reference
		
		Function<List<String> , Set<String>> setFunctionMethodRef  =  HashSet::new;
		System.out.println(setFunctionMethodRef.apply(fruits));
		
		

	}

}
