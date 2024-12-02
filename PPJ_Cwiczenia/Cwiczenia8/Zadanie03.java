package Zadanie8;

public class Zadanie03 {

    static char[] charArray = {'A', 'l', 'a', ' ', 'm', 'a', ' ', 'k', 'o', 't', 'a'};

    public static int countOccurrences(String str) {
        int count = 0;
        String charArrayString = new String(charArray);

        for (int i = 0; i <= charArrayString.length() - str.length(); i++) {
            if (charArrayString.substring(i, i + str.length()).equals(str)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String searchString = "ma";
        int occurrences = countOccurrences(searchString);

        System.out.println("Ciąg '" + searchString + "' wystąpił " + occurrences + " razy.");
    }
}
