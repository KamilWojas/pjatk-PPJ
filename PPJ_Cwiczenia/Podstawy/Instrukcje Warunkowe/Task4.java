public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Pobranie dwóch liczb od użytkownika
        System.out.print("Podaj pierwszą liczbę: ");
        int liczba1 = scanner.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int liczba2 = scanner.nextInt();

        // Instrukcja warunkowa
        if (liczba1 > liczba2) {
            System.out.println("Większa liczba to: " + liczba1);
        } else if (liczba1 < liczba2) {
            System.out.println(

                    "Większa liczba to: " + liczba2);
        } else {
            System.out.println("Obie liczby są równe.");
        }
    }
}

    Wynik programu:
        Dla określonych liczb:

        10, 5 →"Większa liczba to: 10"
        4, 8 →"Większa liczba to: 8"
        3, 3 →"Obie liczby są równe."