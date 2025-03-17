
import java.util.Arrays;
import java.util.Scanner;

public class Anagramy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Podaj pierwsze słowo: ");
        String slowo1 = scanner.nextLine().toLowerCase();

        System.out.print("Podaj drugie słowo: ");
        String slowo2 = scanner.nextLine().toLowerCase();