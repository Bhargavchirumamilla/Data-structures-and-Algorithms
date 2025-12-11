package examples;

public class staticMethod {
	int id;
	String name;
	
	 staticMethod(int i, String n){
		  id =i;
		 name = n;
	 }
	 void display() {
		 System.out.print(id+ "" + name);
	 }
	public static void main(String[] args) {
		staticMethod bob = new staticMethod(111, "bhargav");
		staticMethod bo1 = new staticMethod(112, "bhargav1");
		bob.display();
		bo1.display();
		
	}

}
