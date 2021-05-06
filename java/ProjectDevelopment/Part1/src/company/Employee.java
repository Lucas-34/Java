package src.company;

public abstract class Employee
{
  private float earning;
  private float bonus;

  public float getEarning() { return earning; }
  public void setEarning(float earning) { this.earning = earning; }

  private void increaseBonus(float bonus) { this.bonus += bonus; }
}