package encapsulationInheritance;

//Base class
class Animal {
	// Method to be overridden by subclasses
	void makeSound() {
		System.out.println("Some generic animal sound");
	}
}

//Subclass Dog
class Dog extends Animal {
	// Overriding the makeSound method
	@Override
	void makeSound() {
		System.out.println("Woof");
	}
}

//Subclass Cat
class Cat extends Animal {
	// Overriding the makeSound method
	@Override
	void makeSound() {
		System.out.println("Meow");
	}

}

//Main class to test the code

	public static void main(String[] args) {
		Animal myDog = new Dog(); // Creating a Dog object
		Animal myCat = new Cat(); // Creating a Cat object

		myDog.makeSound(); // Output: Woof
		myCat.makeSound(); // Output: Meow
	}
