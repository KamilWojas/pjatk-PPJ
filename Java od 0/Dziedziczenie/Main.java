public class Main{
    public static void main(String[] args) {


        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Beagle", 2024,true));
        animals.add(new Cat("black", true ));
        animals.add(new Bird("Parrot", true));

        Animal dog5 = new Dog();


        //inheryitance();
        //fish();


       /* private static void fish () {
            System.out.println("======Ryby=======");
            Fish fish1 = new Fish();
            fish1.eat();
            fish1.sleap();
            Object fish2 = new Fish();
            Animal fish3 = new Fish();
            System.out.println("Ryba 3");
            fish3.eat();
            fish3.sleap();
        }*/

        Dog firstDog = new Dog("Bealge", 2024, true);
        System.out.println("Rasa psa " + firstDog.getBreed() + "data urodzenia " + firstDog.getDateOfBirth());
    /*private static void inheryitance() {
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
        System.out.println("============================");
    }*/
    }
}