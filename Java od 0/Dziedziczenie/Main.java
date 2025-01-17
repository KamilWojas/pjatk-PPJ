public class Main{
    public static void main(String[] args) {

        inheryItems();


    }

    private static void inheryItems() {
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