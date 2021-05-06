// package Inheritance_Polymorphism_Interface.Pokemon;

public class Pokemon
{
  private String name;
  private double weight;
  private double speed;

  public Pokemon(String name, double weight)
  {
    this.name = name;
    this.weight = weight;
  }

  public String getName() { return name; }
  public void setName(String name) { this.name = name; }

  public double getWeight() { return weight; }
  public void setWeight(double weight) { this.weight = weight; }

  public double getSpeed() { return speed; }
  public void setSpeed(double speed) { this.speed = speed; }

  public String toString() { return "Un pokémon terrestre a été créé. Ses caractéristiques sont :\nNom : " + name + "\nPoids : " + weight + " kg \n"; }
}