public class Main {
    public static void main(String[] args) {
        int wrt = 2; 
        int n = 10;  

        System.out.println("Wyniki mnożenia zmiennej pętli i zmiennej wrt:");
        for (int i = 1; i <= n; i++) {
            int wynik = i * wrt; 
            System.out.println("i: " + i + ", wrt: " + wrt + ", wynik: " + wynik);
        }
    }
}
