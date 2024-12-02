package PetlaWhile;

public class PetlaWhile {
    public static void main(String[] args) {

        //dopóki to co napiszemy w pętli while() <- to co jest w środku będzie zwracało prawdę, dopóki to jest prawda
        //to wykonuj, to co się dzieje tutaj {} wielokrotnie. Do momentu aż to przestanie być prawdę

        int a = 5;
        while (a > 0){
            //jeśli warunek w pętli jest fałszywy, to pętla się nie wykona tylko wyświetli ostatniego printa
            System.out.println("a = " + a);
            a--; //powoduje to zmniejszanie sprawdzanej wartości o 1 od 5
        }

        System.out.println("Koniec");

    }
}
