class Main
{
  public static void main(String[] args)
  {
    Pokemon pokemon = new Pokemon("Pikachu", 5);

    System.out.println("Un pokémon vient d'être créé. Son nom est " + pokemon.getName() + " et son poids est " + pokemon.getWeight());
  }
}