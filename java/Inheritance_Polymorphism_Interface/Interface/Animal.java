public class Animal
{
  private String name;
  private double weight;
  private double speed;
  private boolean is_alive;

  public Animal(String name, double weight, double speed)
  {
    this.name = name;
    this.weight = weight;
    this.speed = speed;
    isAlive = true;
  }

  public String getName() { return name; }
  public void setName(String name) { this.name = name; }

  public double getWeight() { return weight; }
  public void setWeight(double weight) { this.weight = weight; }

  public double getSpeed() { return speed; }
  public void setSpeed(double speed) { this.speed = speed; }

  public boolean getIsAlive() { return is_alive; }
  public void setIsAlive(boolean is_alive) { this.is_alive = is_alive; }

  // public double move(double time) { return speed * time;}

  public String toString() { return "Un animal a été créé. Ses caractéristiques sont :\nNom : " + name + "\nPoids : " + weight() + " kg\nVitesse : " + speed() + " km/h\nEst en vie : " + is_alive + "\n"; }
}