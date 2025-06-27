public class MainApp{
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.speak();
    }
}
class Animal{
    public void speak() {
        System.out.println("Animal speaks");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
}
class Dog extends Animal{
    @Override
    public void speak() {
        System.out.println("Bark");
    }
class Cat extends Animal{
    @Override
    public void speak(){
        System.out.println("Meow");
    }
}

}