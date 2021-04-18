package Inheritance_Polymorphism.Pokemon;

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
}