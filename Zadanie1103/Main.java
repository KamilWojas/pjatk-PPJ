package Zadanie1103;

class Animal {
    protected String species;

    public Animal(String species) {
        this.species = species;
    }

    public void makeSound() {
        System.out.println("Unknown");
    }
}

class Cat extends Animal {
    public Cat() {
        super("Cat");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    public Dog() {
        super("Dog");
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cow extends Animal {
    public Cow() {
        super("Cow");
    }

    @Override
    public void makeSound() {
        System.out.println("Moo");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Cow();

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
