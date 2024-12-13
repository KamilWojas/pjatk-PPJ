

public class Task07 {
    public static void main(String[] args) {
        String[] slowa = { "Ala", "kota", "na", "ma", "a", "kot", "Ale" };

        // Print the sentence by accessing the appropriate elements in the array
        System.out.print(slowa[0] + " "); // "Ala"
        System.out.print(slowa[3] + " "); // "ma"
        System.out.print(slowa[1] + " "); // "kota"
        System.out.print(slowa[4] + " "); // "a"
        System.out.print(slowa[5] + " "); // "kot"
        System.out.print(slowa[3] + " "); // "ma"
        System.out.print(slowa[6]);       // "Ale"
    }
}
