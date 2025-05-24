package Exam;

 
class Animal {
	Animal(){
		makeSound();
	}
	 void makeSound() {
	 System.out.println("The animal makes a sound");
	 }
	}
	class Dog extends Animal {
		Dog(){
			//makeSound();
		}
	 //@Override
	 void makeSound() {
	 System.out.println("The dog barks");
	 }
	}
	public class Main {
	 public static void main(String[] args) {
	 Animal animal = new Animal();
	 Animal dog = new Dog();
	// animal.makeSound(); // The animal makes a sound
	// dog.makeSound(); // The dog barks
	 }
	}
