package Inheritance_Polymorphism.Animals;
import static org.junit.jupiter.api.Assertions.*;

public class TestAnimal
{
  public final void testAnimal()
  {
    Pet pet = new Pet("Daffy");
    
    String actualResult = pet.getName();

    assertEquals("Test avec la super classe Pet.", actualResult.equals("Daffy"));
  }




  public final void testInheritance()
  {
    Pet pet = new Dog("Zeus");
    
    String actualResult = pet.getName();

    assertEquals("Test avec la sous-classe Dog.", actualResult.equals("Zeus"));
  }

  public final void testPolymorphisme()
  {
    Pet pet;
    
    Dog dog = new Dog("Milou");

    pet = dog;
    
    String actualResult = pet.getName();

    assertEquals("Test du polymorphisme.", actualResult.equals("Milou"));
  }
}