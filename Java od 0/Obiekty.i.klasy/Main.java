public class Main {
    public static void main(String[] args) {
        objectAndClass();
        objectClass();

        Car audi = new Car();


    }

    private static void objectClass() {
        String text = " ";
        int amount = 8;
        Boolean bool = false;
        Dog dog = new Dog();

        text.equals("");
        text.toString();

        bool.equals(true);
    }

    /*  Dog ares = new Dog();
      Dog tajson = new Dog();
      Dog toska = new Dog();

      ares.name = "Ares";
      ares.numberOfLegs = 4;
      ares.hasTail = true;

     */
      public static void objectAndClass(){

          Dog piesPierwszy = new Dog("Ares", 4, true);

        System.out.println(piesPierwszy.getName());
        System.out.println(piesPierwszy.getNumberOfLegs());
        System.out.println(piesPierwszy.get.IsHasTail());
        piesPierwszy.bark();
        piesPierwszy.eat();
        


    }
}