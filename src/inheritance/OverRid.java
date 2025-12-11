package inheritance;

public class OverRid {

	    public void makeSound() {
	        System.out.println("Animal makes a sound");
	    }
	
}

	class Dog extends OverRid {
		  @Override
	    public void makeSound() {
	        System.out.println("Dog barks");
	    }
	}
	

	
