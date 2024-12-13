import java.util.HashMap;

public class Task03 {
    public static void main(String[] args) {
        char[][] tab = {
                {'S', 'a', 'm', 's', 'u', 'n', 'g'},
                {'N', 'o', 'k', 'i', 'a'},
                {'A', 'p', 'p', 'l', 'e'},
                {'D', 'e', 'l', 'l'},
                {'H', 'p'},
                {'A', 's', 'u', 's'},
                {'S', 'o', 'n', 'y'},
                {'A', 'c', 'e', 'r'},
                {'J', 'o', 'l', 'l', 'a'}
        };

        System.out.println("Nazwy spełniające przynajmniej 3 warunki:");
        for (char[] word : tab) {
            int satisfiedConditions = 0;

            // Warunek 1: Przynajmniej dwie takie same litery (bez względu na wielkość)
            if (containsDuplicateLetters(word)) {
                satisfiedConditions++;
            }

            // Warunek 2: Suma wszystkich znaków w słowie > 255
            if (sumOfAsciiValues(word) > 255) {
                satisfiedConditions++;
            }

            // Warunek 3: Zawiera przynajmniej jeden znak 'i'
            if (containsChar(word, 'i')) {
                satisfiedConditions++;
            }

            // Warunek 4: Zawiera przynajmniej dwa takie same znaki
            if (containsDuplicateChars(word)) {
                satisfiedConditions++;
            }

            // Wypisz słowo, jeśli spełnia przynajmniej 3 warunki
            if (satisfiedConditions >= 3) {
                System.out.println(new String(word));
            }
        }
    }

    // Funkcja sprawdzająca, czy słowo zawiera przynajmniej dwie takie same litery (ignorując wielkość)
    public static boolean containsDuplicateLetters(char[] word) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : word) {
            char lower = Character.toLowerCase(c);
            map.put(lower, map.getOrDefault(lower, 0) + 1);
            if (map.get(lower) > 1) {
                return true;
            }
        }
        return false;
    }

    // Funkcja obliczająca sumę wartości ASCII znaków w słowie
    public static int sumOfAsciiValues(char[] word) {
        int sum = 0;
        for (char c : word) {
            sum += c;
        }
        return sum;
    }

    // Funkcja sprawdzająca, czy słowo zawiera dany znak
    public static boolean containsChar(char[] word, char target) {
        for (char c : word) {
            if (c == target) {
                return true;
            }
        }
        return false;
    }

    // Funkcja sprawdzająca, czy słowo zawiera przynajmniej dwa identyczne znaki (bez ignorowania wielkości)
    public static boolean containsDuplicateChars(char[] word) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : word) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            if (map.get(c) > 1) {
                return true;
            }
        }
        return false;
    }
}
