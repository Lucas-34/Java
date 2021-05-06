public class Mammal extends Animal
{
  private double size;

  public Mammal(String name, double weight, double speed, double size)
  {
    super(name, weight, speed);
    this.size = size;
  }

  public double getSize() { return size; }
  public void setSize(double size) { this.size = size; }

  @Override
  public String toString() { return "Un mammifère a été créé. Ses caractéristiques sont :\nNom : " + this.getName() + "\nPoids : " + this.getWeight() + " kg\nTaille : " + size + " m\nVitesse : " + this.getSpeed() + " km/h\nStatut : " + this.getIsAlive() + "\n"; }
}