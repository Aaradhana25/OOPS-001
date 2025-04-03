abstract class Animal {
    abstract void makeSound(); // Abstract method

    void sleep() {
        System.out.println("Sleeping... 😴");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof! Woof! 🐶");
    }
}

public class Abst1{
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();
        myDog.sleep();
    }
}
