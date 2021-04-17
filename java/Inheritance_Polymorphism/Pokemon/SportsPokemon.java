public class SportsPokemon extends EarthPokemon
{
  private int heart_rate;

  public SportsPokemon(String name, float weight, int nb_legs, int size, int heart_rate)
  {
    super(name, weight, nb_legs, size);
    this.heart_rate = heart_rate;
  }

  public int getHeartRate() { return heart_rate; }
  public void setHeartRate(int heart_rate) { this.heart_rate = heart_rate; }
}