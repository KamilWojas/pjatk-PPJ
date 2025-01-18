public class Main{
    public static void main(String[] args) {

        inheryitance();

        fish();


    }

    private static void fish() {
        Fish fish1 = new Fish();
        fish1.eat();
        fish1.slep();
        Object fish2 = new Fish();
        fish2.eat();
        fish2.slep();
        Animal fish3 = new Fish();
        fish3.eat();
        fish3.slep();
    }

    private static void inheryitance() {
        Object dog1 = new Dog();
        Mammal dog2 = new Dog();
        Animal dog3 = new Dog();
        Dog dog4 = new Dog();

        dog1.toString();
        dog2.eat();
        dog2.sleap();
        dog2.geveBirth();
        dog3.eat();
        dog4.bark();
    }
}