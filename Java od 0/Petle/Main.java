public class Main {

    public static void main(String[] args) {
        
        petlaFor();
        forAndArray();
        whileAndDoWhile();
        continueAndBrak();

        practiceWhile();


    }

    private static void practiceWhile() {
        int x = 5;
        while (x > 1){
            x = x -1;
            if (x < 3){
                System.out.println("Małe x");
            }
        }

        //nie wykona się
        int a = 1;
        while (a < 10){
            if (a > 3){
                System.out.println("Wielkie X");
            }
        }
    }

    private static void continueAndBrak() {
        System.out.println("Pętla for if z continue i break");
        System.out.println("Kolejka klientów");
        for (int i = 0; i < 20; i++) {
            if (i == 7 || i == 13){
                System.out.println("Pomiń klienta o nr:" + i);
                continue;
            }if (i >= 18){
                System.out.println("Nie chce już obsługiwać żadnego klienta! Na dzisiaj, to koniec!");
                break;
            }
            System.out.println("Obsłużono klienta nr: " + i);
        }
    }

    private static void whileAndDoWhile() {
        System.out.println("Pętla while i do while");
        int x = 3;
        while (3){
            System.out.println("Ponawiam próbę wysłania wiadomości");
            x--;
        }

        do {
            System.out.println("Hello");
        }while (false);


        int customerOfNumber = 5;
        do {
            System.out.println("Hello customer :" + customerOfNumber);
            customerOfNumber--;
        }while (customerOfNumber > 0);
    }

    private static void forAndArray() {
        System.out.println("Tablica i pętla for");
        String names = {"Kasia", "Tomek", "Andrzej"};
        for (int index = 0; index < names.length; index++){
            System.out.println("Cześć! " + names[index] + " fajnie że jesteś");
        }
    }

    private static void petlaFor() {
        System.out.println("Pętla for");
        for (int i = 0; i < 7; i++) {
            System.out.println("Cześć");
        }

        Long x = 10L;
        for (; x <= 12; x++) {
            System.out.println("Cześć 2");

        }

        System.out.println("=======================" + "\n");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < arr.length / 2; i++){
            System.out.println(
                    arr[i % 3 == 0 ? arr.length - 1 - i : i]
            );
        }
        Long y = 5L;
        for (; y > 0; y--){
            System.out.println("hej");
        }
    }
}