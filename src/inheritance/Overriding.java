package inheritance;

public class Overriding {

	void run() {
		System.out.print("Bob is running");
	}
	
	
	static class Bike extends Overriding {
		void run() {
		System.out.print("Bob is walking");
	}
		
		public static void main(String[] args) {
			
		Bike obj = new Bike();
		obj.run();
	}
}
	
	
}