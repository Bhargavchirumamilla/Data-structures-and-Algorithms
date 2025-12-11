package inheritance;

public class Main {
	
	 public static void main(String[] args) {
	    	OverRid myAnimal = new OverRid();
	        myAnimal.makeSound(); // Output: Animal makes a sound

	        Dog myDog = new Dog();
	        myDog.makeSound(); // Output: Dog barks

	        OverRid polymorphicAnimal = new Dog();
	        polymorphicAnimal.makeSound(); // Output: Dog barks (Runtime polymorphism in action)
	    }

}
