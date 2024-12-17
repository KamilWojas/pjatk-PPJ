// Klasa bazowa Animal
class Animal {
    protected String species;

    public Animal(String species) {
        this.species = species;
    }

    public void makeSound() {
        System.out.println("Unknown");
    }
}
// Klasa Cat dziedzicząca po Animal
class Cat extends Animal {

    pub
    public Cat() {
        super("Cat");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

// Klasa Dog dziedzicząca po Animal
class Dog extends Animal {
    public Dog() {
        super("Dog");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
// Klasa Cow dziedzicząca po Animal
class Cow extends Animal {
    public Cow() {
        super("Cow");
    }

    @Override
    public void makeSound() {
        System.out.println("Moo");
    }
}
// Klasa główna Main
public class Main {
    public static void main(String[] args) {
        // Tablica obiektów klasy Animal
        Animal[] animals = new Animal[3];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Cow();

        // Polimorficzne wywołanie metody makeSound()
        for (Animal animal : animals) {
            System.out.print(animal.species + " makes sound: ");
            animal.makeSound();
        }
    }
}