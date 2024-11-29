public class Task09 {
    public static void main(String[] args) {
        // Przykładowa wartość zmiennej wrt
        int wrt = -12;

        // Definicja warunków dla zbiorów
        boolean inA = (wrt > -15 && wrt < -10); // Zbiór A: (-15, -10)
        boolean inB = (wrt < -13);             // Zbiór B: (-∞, -13)

        // Sprawdzenie, czy zmienna należy tylko do jednego zbioru
        if (inA ^ inB) { // Operator XOR sprawdza, czy zmienna należy wyłącznie do jednego zbioru
            System.out.println("Zmienna wrt należy tylko do jednego z tych zbiorów.");
        } else {
            System.out.println("Zmienna wrt NIE należy tylko do jednego zbioru.");
        }
    }
}
