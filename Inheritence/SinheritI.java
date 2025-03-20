
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class SinheritI {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Method from parent class
        dog.bark(); // Method from child class
    }
}

