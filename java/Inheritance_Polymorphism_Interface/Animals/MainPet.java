package Inheritance_Polymorphism_Interface.Animals;

public class MainPet
{
  public static void main(String[] args)
  {
    Pet[] myLittleFriends = new Pet[3];
      
    myLittleFriends[0] = new Cat("Tom");
    myLittleFriends[1] = new Dog("Milou");
    myLittleFriends[2] = new Dog("Rintintin");
    
    for(int i = 0; i < 3; i ++) { myLittleFriends[i].says(); }
    for(Pet little_friend : myLittleFriends) { little_friend.says(); }
  }
}
