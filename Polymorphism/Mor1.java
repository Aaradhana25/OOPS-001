class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Mor1 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();  // Polymorphism in action

        myAnimal.sound();   // Calls Animal's sound method
        myDog.sound();      // Calls Dog's overridden sound method
    }
}
