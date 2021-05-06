package src.company;

public class Programmer extends Employee
{
  private boolean isFullStack;

  public Programmer(boolean isFullStack) { this.isFullStack = isFullStack; }

  public boolean getIsFullStack() { return isFullStack; }
  public void setIsFullStack(boolean isFullStack) { this.isFullStack = isFullStack; }
}
