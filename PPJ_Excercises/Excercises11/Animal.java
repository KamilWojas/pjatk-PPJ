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
