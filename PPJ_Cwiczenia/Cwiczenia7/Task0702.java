package ZadaniaCwiczenia7;

public class Task0702 {
    public static void main(String[] args) {
        int wiersze = 6;
        int kolumny = 7;

        for (int i = 0; i < wiersze; i++) {
            for (int j = 0; j < kolumny; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

