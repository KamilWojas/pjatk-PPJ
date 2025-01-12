public class Main {
    public static void main(String[] args) {
        objectAndClass();

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