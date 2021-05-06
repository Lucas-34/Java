// package Inheritance_Polymorphism_Interface.Pokemon;

public class StayAtHomePokemon extends EarthPokemon
{
  private int nb_hpd_TV;

  public StayAtHomePokemon(String name, double weight, int nb_legs, double size, int nb_hpd_TV)
  {
    super(name, weight, nb_legs, size);
    this.nb_hpd_TV = nb_hpd_TV;
  }

  public int getNbHpdTV() { return nb_hpd_TV; }
  public void setNbHpdTV(int nb_hpd_TV) { this.nb_hpd_TV = nb_hpd_TV; }

  @Override
  public String toString() { return "Un pokémon casanier a été créé. Ses caractéristiques sont :\nNom : " + this.getName() + "\nPoids : " + this.getWeight() + " kg\nNombre de jambes : " + this.getNbLegs() + "\nTaille : " + this.getSize() + " m\nVitesse : " + this.getSpeed() + " km/h\nNombre d'heures passées devant la télé par jour : " + nb_hpd_TV + "\n"; }
}