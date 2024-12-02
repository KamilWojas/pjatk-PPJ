package ZadaniaCwiczenia4;

public class Task0407 {
    public static void main(String[] args){

        double x = 1;  //przypisanie wartości do zmiennej
        double d = 1e-16;
        double y = (x + d);


        System.out.println("Wynik: " + x + d );
        System.out.println(d > 0);  //sprawdzamy warunek wartości logicznej czy d czyli wartość 1e-16 jest większe od 0
        System.out.println(x < y);  //tu podobnie jak wyżej ale sprawdzamy czy 1 jest większe od sumy wyrażenia y = (x+d)
        System.out.println(x == y); //sprawdzamy czy wartość x = się wartoścu y
        System.out.println(x > y);  // sprawdzamy warunek logiczny czy wartość x jest większa od wartości y
        System.out.println("Wynik: " + y);

        int i = 10;
        int j = 10;
        int a = 2 * ++i;
        int c = 2 * j++;
        int k = 2 * i--;
        System.out.println("Wynik1: " + a);
        System.out.println("Wynik2: " + c);
        System.out.println("Wynik3: " + k);

    }
}
