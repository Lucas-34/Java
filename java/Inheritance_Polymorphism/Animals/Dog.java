package Inheritance_Polymorphism.Animals;

public class Dog extends Pet
{
	Dog(String name) { super(name); } 
	
	void says() { System.out.println("wouf wouf"); }
}