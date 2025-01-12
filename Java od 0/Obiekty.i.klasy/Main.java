public class Main {
    public static void main(String[] args) {
        objectAndClass();
        objectClass();

        Car audi = new Car();
        System.out.println(audi.model);
        System.out.println(audi.przebieg);
        System.out.println(audi.rocznik);


        Car audiS7 = new Car("206");
        System.out.println(audiS7.model);
        System.out.println(audiS7.przebieg);
        System.out.println(audiS7.rocznik);


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