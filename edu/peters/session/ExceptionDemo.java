package edu.peters.session;

public class ExceptionDemo {

	public static void main(String[] args) {
	
		
		float e= 114480,m=40;
		
		try{
			
			System.out.println(e/m);
			
				
		}catch(Exception d2) {
			System.out.println("error occurred...");
			d2.printStackTrace();
			try {
				System.out.println("Nested try block.....");
				System.out.println(786/0);
					
			}catch(Exception z1) {
				System.out.println("inside error....");
				z1.printStackTrace();
			}
		}
		
		System.out.println("welcome");
		System.out.println("to HYD");
		System.out.println("GUYS");
	
	
	}

	
}

