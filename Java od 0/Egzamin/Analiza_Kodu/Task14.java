class Kalkulator {
    int dodaj(int a, int b) {
        return a + b;
    }
    
    double dodaj(double a, double b) {
        return a + b;
    }
}

public class Task14 {
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();
        System.out.println(k.dodaj(5, 10));
        System.out.println(k.dodaj(5.5, 2.5));
    }
}