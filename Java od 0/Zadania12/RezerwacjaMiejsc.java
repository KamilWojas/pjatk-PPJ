import java.util.Scanner;

public class RezerwacjaMiejsc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] sala = new char[5][6];

        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                sala[i][j] = 'O';
            }
        }
