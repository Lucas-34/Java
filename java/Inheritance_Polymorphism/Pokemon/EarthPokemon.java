package Inheritance_Polymorphism.Pokemon;

public class EarthPokemon extends Pokemon
{
  private int nb_legs;
  private double size;

  public EarthPokemon(String name, double weight, int nb_legs, double size)
  {
    super(name, weight);
    this.nb_legs = nb_legs;
    this.size = size;
    setSpeed(nb_legs * size * 3);
  }

  public int getNbLegs() { return nb_legs; }
  public void setNbLegs(int nb_legs) { this.nb_legs = nb_legs; }

  public double getSize() { return size; }
  public void setSize(double size) { this.size = size; }
}