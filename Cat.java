package inheritance;

public class Cat implements Animal {
    @Override
    public void speak() {
        System.out.println("Meow");
    }
}