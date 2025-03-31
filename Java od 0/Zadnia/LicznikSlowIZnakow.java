import java.util.Scanner;

public class LicznikSlowIZnakow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wpisz dowolny tekst: ");
        String tekst = scanner.nextLine();

        int liczbaSlow = tekst.trim().isEmpty() ? 0 : tekst.trim().split("\\s+").length;
        int liczbaZnakow = tekst.replaceAll("\\s+", "").length();