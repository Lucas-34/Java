// package Inheritance_Polymorphism_Interface.Pokemon;
import java.lang.*;

public class TestPokemon
{
  public static void main(String[] args) throws Exception
  {
    Pokemon pokemon_terrestre = new EarthPokemon("Bulbizarre", 10, 4, 0.6);
    // System.out.println(pokemon_terrestre.toString());
    // System.out.println("Un pokémon terrestre a été créé. Ses caractéristiques sont :\nNom : " + pokemon_terrestre.getName() + "\nPoids : " + pokemon_terrestre.getWeight() + " kg\nNombre de jambes : " + pokemon_terrestre.getNbLegs() + "\nTaille : " + pokemon_terrestre.getSize() + "\nVitesse : " + pokemon_terrestre.getSpeed() + " km/h \n");

    Pokemon pokemon_sportif = new SportsPokemon("Pikachu", 5, 4, 1, 70);
    // System.out.println("Un pokémon sportif a été créé. Ses caractéristiques sont :\nNom : " + pokemon_sportif.getName() + "\nPoids : " + pokemon_sportif.getWeight() + " kg\nNombre de jambes : " + pokemon_sportif.getNbLegs() + "\nTaille : " + pokemon_sportif.getSize() + " m\nVitesse : " + pokemon_sportif.getSpeed() + " km/h\nFréquence cardiaque : " + pokemon_sportif.getHeartRate() + " bpm \n");
    // System.out.println(pokemon_sportif.toString());

    Pokemon pokemon_casanier = new StayAtHomePokemon("Ronflex", 150, 2, 2.8, 5);
    // System.out.println("Un pokémon casanier a été créé. Ses caractéristiques sont :\nNom : " + pokemon_casanier.getName() + "\nPoids : " + pokemon_casanier.getWeight() + " kg\nNombre de jambes : " + pokemon_casanier.getNbLegs() + "\nTaille : " + pokemon_casanier.getSize() + " m\nVitesse : " + pokemon_casanier.getSpeed() + " km/h\nNombre d'heures passées devant la télé par jour : " + pokemon_casanier.getNbHpdTV() + "\n");
    // System.out.println(pokemon_casanier.toString());

    Pokemon pokemon_aquatique = new SeaPokemon("Magicarpe", 2, 5);
    // System.out.println("Un pokémon aquatique a été créé. Ses caractéristiques sont :\nNom : " + pokemon_aquatique.getName() + "\nPoids : " + pokemon_aquatique.getWeight() + " kg\nNombre de palmes : " + pokemon_aquatique.getNbFins() + "\n");
    // System.out.println(pokemon_aquatique.toString());

    Pokemon pokemon_marin = new MarinePokemon("Léviator", 100, 7);
    // System.out.println("Un pokémon marin a été créé. Ses caractéristiques sont :\nNom : " + pokemon_marin.getName() + "\nPoids : " + pokemon_marin.getWeight() + " kg\nNombre de palmes : " + pokemon_marin.getNbFins() + "\nVitesse : " + pokemon_marin.getSpeed() + "\n");
    // System.out.println(pokemon_marin.toString());

    Pokemon pokemon_croisiere = new CruisingPokemon("Lapras", 120, 4);
    // System.out.println("Un pokémon submarin a été créé. Ses caractéristiques sont :\nNom : " + pokemon_croisiere.getName() + "\nPoids : " + pokemon_croisiere.getWeight() + " kg\nNombre de palmes : " + pokemon_croisiere.getNbFins() + "\nVitesse : " + pokemon_croisiere.getSpeed() + "\n");
    // System.out.println(pokemon_croisiere.toString());

    CollectionPokemon collection_pokemon = new CollectionPokemon();
    collection_pokemon.addPokemon(pokemon_sportif);
    collection_pokemon.emptyCollection();
    collection_pokemon.addPokemon(pokemon_casanier);
    collection_pokemon.addPokemon(pokemon_aquatique);
    collection_pokemon.addPokemon(pokemon_marin);
    collection_pokemon.addPokemon(pokemon_croisiere);
    collection_pokemon.addPokemon(pokemon_terrestre);
    collection_pokemon.addPokemon(pokemon_sportif);

    System.out.println(collection_pokemon.toString());

    System.out.println("La vitesse moyenne des pokémons de la collection est " + collection_pokemon.averageSpeed() + " km/h \n");

    System.out.println("La vitesse moyenne des pokémons sportifs de la collection est " + collection_pokemon.averageSpeedSportsPokemon() + " km/h \n");
  }
}