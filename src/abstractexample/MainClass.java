package abstractexample;

public class MainClass {
    public static void main(String[] args) {
        //AbstractClass abstractClass=new AbstractClass(); we can't create object for abstract class

        ConcreteClass concreteClass= new ConcreteClass();
        concreteClass.demo1();
        concreteClass.demo2();
        concreteClass.demo3();
    }
}
