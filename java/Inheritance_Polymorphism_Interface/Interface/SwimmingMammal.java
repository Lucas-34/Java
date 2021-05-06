public class SwimmingMammal extends Mammal implements CanSwim
{
  private int nb_fins;

  public SwimmingMammal(String name, double weight, double size, int nb_fins)
  {
    super(name, weight, size);
    this.nb_fins = nb_fins;
    setSpeed((weight / 25) * nb_fins);
  }
  
  public int getNbFins() { return nb_fins; }
  public void setNbFins(int nb_fins) { this.nb_fins = nb_fins; }

  @Override
  public double swim(double time) { return this.getSpeed() * time; }

  @Override
  public String toString() { return "Un mammifère marin a été créé. Ses caractéristiques sont :\nNom : " + this.getName() + "\nPoids : " + this.getWeight() + " kg\nNombre de nageoires : " + nb_fins + "\nTaille : " + this.getSize() + " m\nVitesse : " + this.getSpeed() + " km/h\nStatut : " + this.getIsAlive() + "\n"; }
}