package RunnableFunctionalInterface;


class ThreadDemo implements Runnable {  //creating a class on ThreadDemo and
	                                         //Implements the Runnable 
	                                     

	@Override
	public void run() {               //abstract method
	System.out.println("run method is calling.........");
		
	}
	
}



public class RunnableFunctionalInterface {

	public static void main(String[] args) {
		

		Thread thread = new Thread(new ThreadDemo());    //Object creating
		thread.start();                //calling on start() method
		
	
		Runnable runnable = () -> {          //creating on Runnable Lambda
		System.out.println("run method is calling and using on Lambda......");
			
		};
		Thread threadLambda = new Thread(runnable);    //creating on another object
		threadLambda.start();                          // calling on start () method 
		
		
	}

}
