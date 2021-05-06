public class NonFlyingBird extends Bird implements CanRun
{
  public NonFlyingBird(String name, double weight, double wing_length)
  {
    super(name, weight, wing_length);
    setSpeed(this.getNbLegs() * 2);
  }

  @Override
  public double run(double time) { return this.getSpeed() * time; }

  @Override
  public String toString() { return "Un oiseau terrestre a été créé. Ses caractéristiques sont :\nNom : " + this.getName() + "\nPoids : " + this.getWeight() + " kg\nVitesse : " + this.getSpeed() + " km/h\nLongueur des ailes : " + this.getWingLength() + " cm\nEst en vie : " + this.getIsAlive() + "\n"; }
}