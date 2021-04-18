package Inheritance_Polymorphism.Animals;

public class Pet
{
	String name;
	Boolean collar;

	Pet(String name)
	{
	  this.name = name;
	  this.collar = true;
	}

	String getName() { return name; }

	void says() { System.out.println(name); }
}