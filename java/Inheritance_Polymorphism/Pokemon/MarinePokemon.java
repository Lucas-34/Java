package Inheritance_Polymorphism.Pokemon;

public class MarinePokemon extends SeaPokemon
{
  public MarinePokemon(String name, double weight, int nb_fins)
  {
    super(name, weight, nb_fins);
    setSpeed((weight / 25) * nb_fins);
  }

  @Override
  public String toString() { return "Un pokémon marin a été créé. Ses caractéristiques sont :\nNom : " + this.getName() + "\nPoids : " + this.getWeight() + " kg\nNombre de palmes : " + this.getNbFins() + "\nVitesse : " + this.getSpeed() + "\n"; }
}