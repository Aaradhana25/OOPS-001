class Person {
    private String name;  // Private variable

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String newName) {
        this.name = newName;
    }
}

public class Enc1 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Aaradhana");
        System.out.println("Person's name: " + p.getName());
    }
}
