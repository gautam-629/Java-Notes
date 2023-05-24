class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name); // invoking superclass constructor
        this.breed = breed;
    }

    @Override
    void makeSound() {
        super.makeSound(); // invoking superclass method
        System.out.println("Dog barks");
    }

    void display() {
        System.out.println("Name: " + super.name); // accessing superclass field
        System.out.println("Breed: " + this.breed);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Labrador");
        dog.makeSound();
        dog.display();
    }
}
