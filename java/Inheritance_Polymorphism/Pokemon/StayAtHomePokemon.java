public class StayAtHomePokemon extends EarthPokemon
{
  private int nb_hpd_TV;

  public StayAtHomePokemon(String name, float weight, int nb_legs, int size, int nb_hpd_TV)
  {
    super(name, weight, nb_legs, size);
    this.nb_hpd_TV = nb_hpd_TV;
  }

  public int getNbHpdTV() { return nb_hpd_TV; }
  public void setNbHpdTV(int nb_hpd_TV) { this.nb_hpd_TV = nb_hpd_TV; }
}