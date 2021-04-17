class Main
{
  public static void main(String[] args)
  {
    Pokemon pokemon_sportif = new SportsPokemon("Pikachu", 5, 2, 1, 1);

    System.out.println("Un pokémon vient d'être créé. Ses caractéristiques sont : \n Nom : " + pokemon_sportif.getName() + "\n Poids : " + pokemon_sportif.getWeight() + "\n Nombre de jambes : " + pokemon_sportif.getNbLegs() + "\n Taille : " + pokemon_sportif.getSize() + "\n Fréquence cardiaque : " + pokemon_sportif.getHeartRate());
  }
}