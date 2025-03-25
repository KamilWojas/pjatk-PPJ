import java.util.Scanner;

public class ZnajdzWTablicy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] liczby = {3, 7, 12, 25, 33, 42};

        System.out.print("Podaj liczbę do wyszukania: ");
        int szukana = scanner.nextInt();

        boolean znaleziono = false;

        for (int liczba : liczby) {
            if (liczba == szukana) {
                znaleziono = true;
                break;
            }
        }

        if (znaleziono) {
            System.out.println("Liczba znajduje się w tablicy.");
        } else {
            System.out.println("Liczby nie ma w tablicy.");
        }

        scanner.close();
    }
}