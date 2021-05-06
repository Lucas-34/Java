public class Fish extends Animal implements CanSwim
{
  private String water_kind;
  private int nb_fins;

  public Fish(String name, double weight, int nb_fins, String water_kind)
  {
    super(name, weight);
    this.water_kind = water_kind;
    this.nb_fins = nb_fins;
    setSpeed((weight / 2) * nb_fins);
  }

  public int getWaterKind() { return water_kind; }
  public void setWaterKind(int water_kind) { this.water_kind = water_kind; }

  public int getNbFins() { return nb_fins; }
  public void setNbFins(int nb_fins) { this.nb_fins = nb_fins; }

  @Override
  public double swim(double time) { return this.getSpeed() * time; }

  @Override
  public String toString() { return "Un poisson a été créé. Ses caractéristiques sont :\nNom : " + this.getName() + "\nPoids : " + this.getWeight() + " kg\nNombre de palmes : " + nb_fins + "\nVitesse : " + this.getSpeed() + " km/h\nType de milieu aquatique : " + water_kind + "\nEst en vie : " + this.getIsAlive() + "\n"; }
}