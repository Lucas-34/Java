public class EarthPokemon extends Pokemon
{
  private int nb_legs;
  private int size;

  public EarthPokemon(String name, float weight, int nb_legs, int size)
  {
    super(name, weight);
    this.nb_legs = nb_legs;
    this.size = size;
    setSpeed(nb_legs * size * 3);
  }

  public int getNbLegs() { return nb_legs; }
  public void setNbLegs(int nb_legs) { this.nb_legs = nb_legs; }

  public int getSize() { return size; }
  public void setSize(int size) { this.size = size; }
}