import java.util.Scanner;

public class MiniQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int punkty = 0;

        System.out.println("QUIZ – Odpowiedz a, b lub c");

        System.out.println("\n1. Jaki jest język urzędowy w Polsce?");
        System.out.println("a) niemiecki\nb) polski\nc) rosyjski");
        if (scanner.nextLine().equalsIgnoreCase("b")) punkty++;

        System.out.println("\n2. Ile to jest 2 + 2?");
        System.out.println("a) 4\nb) 5\nc) 6");
        if (scanner.nextLine().equalsIgnoreCase("a")) punkty++;

        System.out.println("\n3. Co oznacza skrót JVM?");
        System.out.println("a) Java Virtual Machine\nb) Java Very Much\nc) Java Value Model");
        if (scanner.nextLine().equalsIgnoreCase("a")) punkty++;

        System.out.println("\nTwój wynik: " + punkty + "/3");

        if (punkty == 3) {
            System.out.println("Świetnie! 💪");
        } else if (punkty == 2) {
            System.out.println("Dobrze! 👍");
        } else {
            System.out.println("Spróbuj jeszcze raz! 😉");
        }

        scanner.close();
    }
}
