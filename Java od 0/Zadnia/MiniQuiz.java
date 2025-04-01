import java.util.Scanner;

public class MiniQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int punkty = 0;

        System.out.println("QUIZ – Odpowiedz a, b lub c");

        System.out.println("\n1. Jaki jest język urzędowy w Polsce?");
        System.out.println("a) niemiecki\nb) polski\nc) rosyjski");
        if (scanner.nextLine().equalsIgnoreCase("b")) punkty++;