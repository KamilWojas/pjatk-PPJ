import java.util.Scanner;

public class LiczenieLiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj tekst: ");
        String tekst = scanner.nextLine().toLowerCase();

        int[] wynik = policzSamogloskiISpolgloski(tekst);

        System.out.println("Liczba samogłosek: " + wynik[0]);
        System.out.println("Liczba spółgłosek: " + wynik[1]);

        scanner.close();
    }

    public static int[] policzSamogloskiISpolgloski(String tekst) {
        int samogloski = 0, spolgloski = 0;
        String samogloskiLista = "aeiouyąęó";

        for (char znak : tekst.toCharArray()) {
            if (Character.isLetter(znak)) { 
                if (samogloskiLista.indexOf(znak) != -1) {
                    samogloski++;
                } else {
                    spolgloski++;
                }
            }
        }
        return new int[]{samogloski, spolgloski}; 
    }
}