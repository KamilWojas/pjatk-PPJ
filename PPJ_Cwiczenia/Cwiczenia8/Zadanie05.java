package Zadanie8;

public class Zadanie05 {

    public static void printSquare(int sideLength, char startChar) {
        char firstChar = startChar;
        char secondChar = (startChar == 'x') ? 'o' : 'x';

        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(firstChar);
                } else {
                    System.out.print(secondChar);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sideLength = 5;
        char startChar = 'x';

        printSquare(sideLength, startChar);
    }
}
