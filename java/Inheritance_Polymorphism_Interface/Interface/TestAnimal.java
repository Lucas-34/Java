public class TestAnimal
{
  public static void main(String[] args)
  {
    Animal animal = new Animal("chat", 2, 10);
    System.out.println(animal.toString());

    Animal mammal = new Mammal("marmotte", 5, 2, 0.8);
    System.out.println(mammal.toString());

    Animal earth_mammal = new EarthMammal("éléphant", 7000, 3.5, 4);
    System.out.println(earth_mammal.toString());

    Animal swimming_mammal = new SwimmingMammal("baleine bleue", 200000, 30, 3);
    System.out.println(swimming_mammal.toString());

    Animal bird = new Bird("pigeon", 3, 8, 20);
    System.out.println(bird.toString());

    Animal flying_bird = new FlyingBird("rouge-gorge", 0.2, 8);
    System.out.println(flying_bird.toString());

    Animal non_flying_bird = new NonFlyingBird("autruche", 90, 85);
    System.out.println(non_flying_bird.toString());

    Animal fish = new Fish("doré-jaune", 1, 6, "lac");
    System.out.println(fish.toString());
  }
}