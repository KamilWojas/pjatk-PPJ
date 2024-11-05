package ZadaniaCwiczenia4;




public class Task0403 {
    public static void main(String[] args){

        int x1 = 10;
        double y1 = 2.3;
        char a1 = 'a';
        float a2 = 23f;
        char a3 = 'B';
        char a4 = 'C';
        double a5 = 33.333;
        int a6 = 333;
        int dzielenie = a6 % x1;

        System.out.println("Dodawanie: " + x1 + y1);
        System.out.println("Odejmowanie: " + ((a1 - a2) - (x1 * y1)));
        System.out.println("Mnożenie: " + x1 * y1);
        System.out.println("Dodawanie: " + a4 + a3);
        System.out.println("Dzielenie: " + (a6 / a5));
        System.out.println("Reszta z dzielenia: " + a6 + " prze " + x1 + " wynosi " + dzielenie);

    }
}
