public class Petla {
    public static void main(String[] args) {

        int[] tab = {100, 90, 80, 70}; // Tablica liczb całkowitych

        for (int i = 0; i < tab.length; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                System.out.println("Różnica między tab[" + i + "] i tab[" + j + "]: " + (tab[i] - tab[j]));
                
            }
        }
    }
}