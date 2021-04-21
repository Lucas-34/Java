package Inheritance_Polymorphism.Pokemon;

public class CruisingPokemon extends SeaPokemon
{
  public CruisingPokemon(String name, double weight, int nb_fins)
  {
    super(name, weight, nb_fins);
    setSpeed(((weight / 25) * nb_fins) / 2);
  }

  @Override
  public String toString() { return "Un pokémon submarin a été créé. Ses caractéristiques sont :\nNom : " + this.getName() + "\nPoids : " + this.getWeight() + " kg\nNombre de palmes : " + this.getNbFins() + "\nVitesse : " + this.getSpeed() + "\n"; }
}