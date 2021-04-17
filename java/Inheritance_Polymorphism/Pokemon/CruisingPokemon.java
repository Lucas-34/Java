public class CruisingPokemon extends SeaPokemon
{
  public CruisingPokemon(String name, float weight, int nb_fins)
  {
    super(name, weight, nb_fins);
    setSpeed(((weight / 25) * nb_fins) / 2);
  }
}