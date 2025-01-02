// Interfejs
interface Dzwiek {
void wydajDzwiek(); // Metoda abstrakcyjna
}


// Klasa implementująca interfejs
class Pies implements Dzwiek {
    @Override
    public void wydajDzwiek() {
        System.out.println("Hau!");
    }
}

// Klasa implementująca interfejs
class Kot implements Dzwiek {
    @Override
    public void wydajDzwiek() {
        System.out.println("Miau!");
    }
}

// Program główny
public class InterfejsExample {
    public static void main(String[] args) {
        Dzwiek pies = new Pies();
        pies.wydajDzwiek();

        Dzwiek kot = new Kot();
        kot.wydajDzwiek();
    }
}

/*
Wyjaśnienie:
Interfejs Dzwiek:
ZdefiniujwydajDzwiek.
klasa wdrażająca dziesięć interfejsów musi zaimplementować tę.
Klasy Piesi Kot:
Implementują interfejs Dzwiek.
Program główny:
Tworzymy obiekty typu Dzwiek, które mogą mieć zastosowanie Pieslub Kot.
 */