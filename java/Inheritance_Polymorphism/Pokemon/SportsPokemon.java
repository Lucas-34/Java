package Inheritance_Polymorphism.Pokemon;

public class SportsPokemon extends EarthPokemon
{
  private int heart_rate;

  public SportsPokemon(String name, double weight, int nb_legs, double size, int heart_rate)
  {
    super(name, weight, nb_legs, size);
    this.heart_rate = heart_rate;
  }

  public int getHeartRate() { return heart_rate; }
  public void setHeartRate(int heart_rate) { this.heart_rate = heart_rate; }

  @Override
  public String toString() { return "Un pokémon sportif a été créé. Ses caractéristiques sont :\nNom : " + this.getName() + "\nPoids : " + this.getWeight() + " kg\nNombre de jambes : " + this.getNbLegs() + "\nTaille : " + this.getSize() + " m\nVitesse : " + this.getSpeed() + " km/h\nFréquence cardiaque : " + this.getHeartRate() + " bpm \n"; }
}