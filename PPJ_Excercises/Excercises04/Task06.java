import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Wprowadzenie danych przez użytkownika
        System.out.print("Podaj miesiąc (1-12): ");
        int M = scanner.nextInt();
        System.out.print("Podaj dzień: ");
        int D = scanner.nextInt();

        String poraRoku = "";

        // Instrukcja switch
        switch (M) {
            case 1: case 2:
                poraRoku = "Zima";
                break;
            case 3:
                poraRoku = (D < 21) ? "Zima" : "Wiosna";
                break;
            case 4: case 5:
                poraRoku = "Wiosna";
                break;
            case 6:
                poraRoku = (D < 21) ? "Wiosna" : "Lato";
                break;
            case 7: case 8:
                poraRoku = "Lato";
                break;
            case 9:
                poraRoku = (D < 23) ? "Lato" : "Jesień";
                break;
            case 10: case 11:
                poraRoku = "Jesień";
                break;
            case 12:
                poraRoku = (D < 22) ? "Jesień" : "Zima";
                break;
            default:
                poraRoku = "Niepoprawna data!";
        }

        // Wyświetlenie wyniku
        if (!poraRoku.equals("Niepoprawna data!")) {
            System.out.println("Podana data przypada na porę roku: " + poraRoku);
        } else {
            System.out.println("Wprowadzono niepoprawną datę.");
        }

        scanner.close();
    }
}
