public class Task03 {
    public static void main(String[] args) {
        // Zmienna, której nazwa zaczyna się literą, a kolejne znaki to cyfry
        int a123 = 10;

        // Zmienna, której nazwa zaczyna się cyfrą (błąd kompilacji)
        // int 1abc = 20; // Niekompilująca się zmienna

        // Zmienna, której nazwa zaczyna się znakiem specjalnym (błąd kompilacji)
        // int @name = 30; // Niekompilująca się zmienna

        // Zmienna, której nazwa to słowo kluczowe z metody main (błąd kompilacji)
        // int main = 40; // Niekompilująca się zmienna

        // Zmienna, której nazwa układa się w słowo "null" (błąd kompilacji)
        // int null = 50; // Niekompilująca się zmienna

        // Poprawne nazwy zmiennych:
        int varName = 60; // Nazwa zaczynająca się od litery, reszta to dowolne znaki
        int myVariable123 = 70; // Litery i cyfry
        int z = 80; // Jedna litera

        // Wypisanie poprawnych zmiennych
        System.out.println("a123 = " + a123);
        System.out.println("varName = " + varName);
        System.out.println("myVariable123 = " + myVariable123);
        System.out.println("z = " + z);
    }
}
