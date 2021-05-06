public class Bird extends Animal
{
  private double wing_length;
  private static final int nb_legs = 2;

  public Bird(String name, double weight, double speed, double wing_length)
  {
    super(name, weight, speed);
    this.wing_length = wing_length;
  }

  public double getWingLength() { return wing_length; }
  public void setWingLength(double wing_length) { this.wing_length = wing_length; }

  public int getNbLegs() { return nb_legs; }

  @Override
  public String toString() { return "Un oiseau a été créé. Ses caractéristiques sont :\nNom : " + this.getName() + "\nPoids : " + this.getWeight() + " kg\nVitesse : " + this.getSpeed() + " km/h\nLongueur des ailes : " + wing_length + " m\nEst en vie : " + this.getIsAlive() + "\n"; }
}