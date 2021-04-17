public class Pokemon
{
  private String name;
  private float weight;
  private float speed;

  public Pokemon(String name, float weight)
  {
    this.name = name;
    this.weight = weight;
  }

  public String getName() { return name; }
  public void setName(String name) { this.name = name; }

  public float getWeight() { return weight; }
  public void setWeight(float weight) { this.weight = weight; }

  public float getSpeed() { return speed; }
  public void setSpeed(float speed) { this.speed = speed; }
}