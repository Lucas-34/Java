public class FlyingBird extends Bird implements CanFly
{
  public FlyingBird(String name, double weight, double wing_length)
  {
    super(name, weight, wing_length);
    setSpeed((weight / 2) * nb_wings);
  }

  @Override
  public double fly(double time) { return this.getSpeed() * time; }

  @Override
  public String toString() { return "Un oiseau volant a été créé. Ses caractéristiques sont :\nNom : " + this.getName() + "\nPoids : " + this.getWeight() + " kg\nVitesse : " + this.getSpeed() + " km/h\nLongueur des ailes : " + this.getWingLength() + " cm\nEst en vie : " + this.getIsAlive() + "\n"; }
}