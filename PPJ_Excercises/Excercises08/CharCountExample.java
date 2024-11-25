public class CharCountExample {

    public static void main(String[] args) {
        // Tablica typu char z napisem "Ala ma kota"
        char[] charArray = "Ala ma kota".toCharArray();

        // Wywołanie metody z ciągiem, którego znaki chcemy policzyć
        String searchString = "ma";
        int count = countOccurrences(charArray, searchString);

        System.out.println("Ciąg \"" + searchString + "\" występuje " + count + " razy.");
    }

    // Metoda licząca wystąpienia znaków
    public static int countOccurrences(char[] charArray, String searchString) {
        int count = 0;
        String charSequence = new String(charArray); // Konwersja tablicy znaków do String

        // Szukanie wystąpień ciągu znaków w charSequence
        int index = charSequence.indexOf(searchString);
        while (index != -1) {
            count++;
            index = charSequence.indexOf(searchString, index + 1); // Szukanie kolejnego wystąpienia
        }

        return count;
    }
}
