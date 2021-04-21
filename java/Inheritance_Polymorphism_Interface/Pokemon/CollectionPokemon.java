package Inheritance_Polymorphism_Interface.Pokemon;
import java.util.*;
import java.lang.*;

public class CollectionPokemon
{
    private ArrayList<Pokemon> collection_pokemon;

    public CollectionPokemon()
    {
        collection_pokemon = new ArrayList<Pokemon>();
    }


    public void emptyCollection() throws Exception
    {
        if(collection_pokemon.size() == 0) { throw new Exception("Erreur: Il n'y a aucun pokémon dans la collection."); }
        else
        {
            int i = 0;

            while(i < collection_pokemon.size())
            {
                collection_pokemon.set(i, null);

                i ++;
            }
        }
    }

    public void addPokemon(Pokemon pokemon)
    {
        collection_pokemon.add(pokemon);
    }

    public double averageSpeed() throws Exception
    {
        if(collection_pokemon.size() == 0) { throw new Exception("Erreur: Il n'y a aucun pokémon dans la collection."); }
        else
        {
            int numerateur = 0;
            int i = 0;

            while(i < collection_pokemon.size())
            {
                numerateur += collection_pokemon.get(i).getSpeed();

                i ++;
            }

            return numerateur / collection_pokemon.size();
        }
    }

    public double averageSpeedSportsPokemon() throws Exception
    {
        if(collection_pokemon.size() == 0) { throw new Exception("Erreur: Il n'y a aucun pokémon dans la collection."); }
        else
        {
            int numerateur = 0;
            int nb_pokemons_sportifs = 0;
            int i = 0;

            while(i < collection_pokemon.size())
            {
                if(collection_pokemon.get(i).getClass().getSimpleName() == "SportsPokemon")
                {
                    numerateur += collection_pokemon.get(i).getSpeed();

                    nb_pokemons_sportifs ++;
                }

                i ++;
            }

            if(nb_pokemons_sportifs == 0) { throw new Exception("Erreur: Il n'y a aucun pokémon sportif dans la collection."); }
            else { return numerateur / nb_pokemons_sportifs; }
        }
    }

    public ArrayList<Pokemon> getArrayListPokemon() { return collection_pokemon; }
    public void setArrayListPokemon(ArrayList<Pokemon> collection_pokemon) { this.collection_pokemon = collection_pokemon; }

    public String toString()
    {
        String result = "";
        int i = 0;

        while(i < collection_pokemon.size())
        {
            result = result + collection_pokemon.get(i).toString() + "\n";

            i ++;
        }

        return result;
    }
}