package Inheritance_Polymorphism.Pokemon;

public class TestPokemon
{
  public static void main(String[] args)
  {
    EarthPokemon pokemon_terrestre = new EarthPokemon("Bulbizarre", 10, 4, 0.6);
    System.out.println("Un pokémon terrestre a été créé. Ses caractéristiques sont :\nNom : " + pokemon_terrestre.getName() + "\nPoids : " + pokemon_terrestre.getWeight() + " kg\nNombre de jambes : " + pokemon_terrestre.getNbLegs() + "\nTaille : " + pokemon_terrestre.getSize() + "\nVitesse : " + pokemon_terrestre.getSpeed() + " km/h \n");

    // vérifié dans la doc de référence java : on ne peut pas utiliser une méthode de subclass sur un objet de la superclass
    SportsPokemon pokemon_sportif = new SportsPokemon("Pikachu", 5, 4, 1, 70);
    System.out.println("Un pokémon sportif a été créé. Ses caractéristiques sont :\nNom : " + pokemon_sportif.getName() + "\nPoids : " + pokemon_sportif.getWeight() + " kg\nNombre de jambes : " + pokemon_sportif.getNbLegs() + "\nTaille : " + pokemon_sportif.getSize() + " m\nVitesse : " + pokemon_sportif.getSpeed() + " km/h\nFréquence cardiaque : " + pokemon_sportif.getHeartRate() + " bpm \n");

    // mais ceci est valide car on utilise que les méthodes de la superclass
    Pokemon pokemon_sportif2 = new SportsPokemon("Pikachu", 5, 4, 1, 70);
    System.out.println("Un pokémon sportif a été créé. Ses caractéristiques sont :\nNom : " + pokemon_sportif2.getName() + "\nPoids : " + pokemon_sportif2.getWeight() + pokemon_sportif2.getSpeed() + " km/h\nFréquence cardiaque : ");


    StayAtHomePokemon pokemon_casanier = new StayAtHomePokemon("Ronflex", 150, 2, 2.8, 5);
    System.out.println("Un pokémon casanier a été créé. Ses caractéristiques sont :\nNom : " + pokemon_casanier.getName() + "\nPoids : " + pokemon_casanier.getWeight() + " kg\nNombre de jambes : " + pokemon_casanier.getNbLegs() + "\nTaille : " + pokemon_casanier.getSize() + " m\nVitesse : " + pokemon_casanier.getSpeed() + " km/h\nNombre d'heures passées devant la télé par jour : " + pokemon_casanier.getNbHpdTV() + "\n");

    SeaPokemon pokemon_aquatique = new SeaPokemon("Magicarpe", 2, 5);
    System.out.println("Un pokémon aquatique a été créé. Ses caractéristiques sont :\nNom : " + pokemon_aquatique.getName() + "\nPoids : " + pokemon_aquatique.getWeight() + " kg\nNombre de palmes : " + pokemon_aquatique.getNbFins() + "\n");

    MarinePokemon pokemon_marin = new MarinePokemon("Léviator", 100, 7);
    System.out.println("Un pokémon marin a été créé. Ses caractéristiques sont :\nNom : " + pokemon_marin.getName() + "\nPoids : " + pokemon_marin.getWeight() + " kg\nNombre de palmes : " + pokemon_marin.getNbFins() + "\nVitesse : " + pokemon_marin.getSpeed() + "\n");

    CruisingPokemon pokemon_croisiere = new CruisingPokemon("Lapras", 120, 4);
    System.out.println("Un pokémon submarin a été créé. Ses caractéristiques sont :\nNom : " + pokemon_croisiere.getName() + "\nPoids : " + pokemon_croisiere.getWeight() + " kg\nNombre de palmes : " + pokemon_croisiere.getNbFins() + "\nVitesse : " + pokemon_croisiere.getSpeed() + "\n");
  }
}