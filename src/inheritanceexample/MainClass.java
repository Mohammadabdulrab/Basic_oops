package inheritanceexample;

public class MainClass {
    public static void main(String[] args) {
      System.out.println("..........Animal Class........");
        Animal animal=new Animal();
        animal.see();
        animal.smell();
        animal.breathe();

        System.out.println(".......Bird Class..........");
        Bird bird=new Bird();
        bird.fly();
        bird.see();
        bird.smell();
        bird.breathe();

        System.out.println(".......Human Class..........");
        Human human=new Human();
        human.talk();
        human.think();
        human.see();
        human.smell();
        human.breathe();

        System.out.println(".......Fish Class..........");
        Fish fish=new Fish();
        fish.swim();
        fish.see();
        fish.smell();
        fish.breathe();

        System.out.println(".......Dog Class..........");
        Dog dog =new Dog();
        dog.bark();
        dog.see();
        dog.smell();
        dog.breathe();
    }
}
