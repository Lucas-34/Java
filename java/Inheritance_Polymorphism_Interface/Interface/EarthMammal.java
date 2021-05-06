public class EarthMammal extends Mammal implements CanRun
{
  private int nb_legs;

  public EarthMammal(String name, double weight, double size, int nb_legs)
  {
    super(name, weight, size);
    this.nb_legs = nb_legs;
    setSpeed(nb_legs * size * 10);
  }

  public int getNbLegs() { return nb_legs; }
  public void setNbLegs(int nb_legs) { this.nb_legs = nb_legs; }

  @Override
  public double run(double time) { return this.getSpeed() * time; }

  @Override
  public String toString() { return "Un mammifère terrestre a été créé. Ses caractéristiques sont :\nNom : " + this.getName() + "\nPoids : " + this.getWeight() + " kg\nNombre de jambes : " + nb_legs + "\nTaille : " + this.getSize() + " m\nVitesse : " + this.getSpeed() + " km/h\nStatut : " + this.getIsAlive() + "\n"; }
}