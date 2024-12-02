package PetlaWhile;

public class PetlaWhilebreak {

    public static void main(String[] args) {

        int a = 6;
        while (true){
            a--;
            System.out.println("a = " + a);
            if (a == 4){
                break;  // dzięki temu breakowi wychodzi z petli i przychodzimy do println
            }

        }
        System.out.println("Koniec");
    }
}
