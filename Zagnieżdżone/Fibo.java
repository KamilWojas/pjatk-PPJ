package Zagnieżdżone;

public class Fibo {

    public static void main(String[] args) {
        int n = 5; // Możesz zmienić tę wartość, aby przetestować inne przypadki

        for (int i = 1; i <= n; i++) {
            int product = 1; // Inicjalizacja iloczynu dla każdej iteracji
            for (int j = 1; j <= i; j++) {
                product *= j; // Mnożenie produktu przez kolejne liczby od 1 do i
            }
            // Wyświetlenie wyniku dla każdego i
            System.out.println("Iloczyn liczb od 1 do " + i + " wynosi: " + product);
        }
    }
}
