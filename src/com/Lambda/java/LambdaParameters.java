package com.Lambda.java;

interface Addable{       //create a interface
	int addition(int a,int b);    //abstract method with  int return-type with parameter
}

class AddableImpl implements Addable{      

	@Override
	public int addition(int a, int b) {
		
		return (a+b);
	}
	
}



public class LambdaParameters {
	
	public static void main(String[] args) {
		
	/*	Addable addition=(int a, int b) -> {
		
			return (a+b);
		};
		*/
		
		Addable addition=(int a, int b) ->  (a+b);
				int result=addition.addition(50, 100);       //lambda creation
		System.out.println(result);                    //result print
		
	}

}
