public class Kwadrat {
    private double bok;

    // Konstruktor
    public Kwadrat(double bok) {
        this.bok = bok;
    }

    // Metoda show wyświetlająca pole powierzchni i objętość sześcianu
    public void show() {
        double polePowierzchni = bok * bok; // Pole powierzchni kwadratu
        double objetoscSzescianu = bok * bok * bok; // Objętość sześcianu
        System.out.println("Pole powierzchni kwadratu: " + polePowierzchni);
        System.out.println("Objętość sześcianu: " + objetoscSzescianu);
    }

    // Przykład użycia klasy
    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(4.0); // Tworzymy kwadrat o boku 4
        kwadrat.show();
    }
}
