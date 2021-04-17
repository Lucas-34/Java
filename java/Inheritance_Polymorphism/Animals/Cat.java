public class Cat extends Pet
{
  private int lives = 7;

	Cat(String name) { super(name); } 
	
	Cat(String name, int lives)
	{
    super(name);
	  this.lives = lives;
	}

	void says() { System.out.println("miaouuuu"); }
	
	public int getLives() { return lives; }
	public void setLives(int lives) { this.lives = lives; }
}