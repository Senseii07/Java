public class MainApp{
    public static void main(String[] args){
    Dog dog = new Dog();
    Cat cat = new Cat();
    dog.speak();
    dog.eat();
    cat.speak();
    cat.eat();
    }
}
interface Animal{
    void speak();
    void eat();

class Dog implements ani,a
    @Override
    public abstract void speak() {
        System.out.println("Bark");
    }
abstract class Cat extends Animal{
    @Override
    public abstract  void speak(){
        System.out.println("Meow");
    }
}
    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
public void eat() {
        System.out.println("Cat eats");
    }
}