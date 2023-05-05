package com.company;
import java.util.Arrays;
import java.util.Random;

public class s23878set07 {
    public static void main(String[] args) {

    }
    public void task01() {

        int[] arr1 = new int[new Random().nextInt(10) + 1];
        int[] arr2 = new int[new Random().nextInt(10) + 1];
        int[] arr3 = new int[new Random().nextInt(10) + 1];
        Random rand = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rand.nextInt(100);
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = rand.nextInt(100);
        }
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = rand.nextInt(100);
        }

        int[][] arr = new int[][]{arr1, arr2, arr3};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
        public void task02() {
            int[][] arr2d = new int[8][8];
            Random rand = new Random();
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    arr2d[i][j] = rand.nextInt(11); // losowa liczba od 0 do 10
                }
            }

            boolean found = false;
            for (int i = 0; i < 8; i++) {
                int diag1 = arr2d[i][i];
                int diag2 = arr2d[7-i][i];
                for (int j = i+1; j < 8; j++) {
                    if (arr2d[j][j] == diag1 && arr2d[j-1][j-1] == diag1) {
                        found = true;
                        break;
                    }
                    if (arr2d[7-j][j] == diag2 && arr2d[8-j][j-1] == diag2) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }

            if (found) {
                System.out.println("Na przekatnych tablicy wystepuja przynajmniej 3 takie same liczby.");
            } else {
                System.out.println("Na przekatnych tablicy nie wystepuja przynajmniej 3 takie same liczby.");
            }
        }
        public void task04(){
            int[][] tab = new int[10][10];
            for (int i = 0; i < tab.length; i++) {
                for (int j = 0; j < tab[i].length; j++) {
                    tab[i][j] = (int) (Math.random() * 100);
                }
            }

            for (int i = 0; i < tab.length; i++) {
                Arrays.sort(tab[i]);
            }

            for (int i = 0; i < tab.length; i++) {
                for (int j = 0; j < tab[i].length; j++) {
                    System.out.print(tab[i][j] + " ");
                }
                System.out.println();
            }
        }
        public void task03(){
            char[][] tab = {
                    {'S', 'a', 'm', 's', 'u', 'n', 'g'},
                    {'N', 'o', 'k', 'i', 'a'},
                    {'A', 'p', 'p', 'l', 'e'},
                    {'B', 'l', 'a', 'c', 'k', 'B', 'e', 'r', 'r', 'y'},
                    {'A', 'l', 'c', 'a', 't', 'e', 'l'},
                    {'S', 'o', 'n', 'y'},
                    {'J', 'o', 'l', 'l', 'a'}
            };

            for (int i = 0; i < tab.length; i++) {
                String word = new String(tab[i]);
                int sum = 0;
                boolean hasRepeatedChar = false;
                boolean hasIChar = false;
                boolean hasTwoSameChars = false;
                for (int j = 0; j < word.length(); j++) {
                    char c = word.charAt(j);
                    sum += c;
                    if (word.toLowerCase().indexOf(c) != word.toLowerCase().lastIndexOf(c)) {
                        hasRepeatedChar = true;
                    }
                    if (c == 'i' || c == 'I') {
                        hasIChar = true;
                    }
                    if (word.indexOf(c) != word.lastIndexOf(c)) {
                        hasTwoSameChars = true;
                    }
                }
                if (hasRepeatedChar) {
                    System.out.println(word + " zawiera przynajmniej dwie takie same litery.");
                }
                if (sum > 255) {
                    System.out.println(word + " suma wszystkich znaków w słowie jest większa niż 255.");
                }
                if (hasIChar) {
                    System.out.println(word + " zawiera przynajmniej jeden znak 'i'.");
                }
                if (hasTwoSameChars) {
                    System.out.println(word + " zawiera przynajmniej dwa takie same znaki.");
                }
            }
        }

}



