public class Main {

    public static void main(String[] args) {


        petlaFor();
        
    }

    private static void petlaFor() {
        System.out.println("Pętla for");
        for (int i = 0; i < 7; i++) {
            System.out.println("Cześć");
        }

        Long x = 10L;
        for (; x <= 12; x++) {
            System.out.println("Cześć 2");

        }

        System.out.println("=======================" + "\n");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < arr.length / 2; i++){
            System.out.println(
                    arr[i % 3 == 0 ? arr.length - 1 - i : i]
            );
        }
        Long y = 5L;
        for (; y > 0; y--){
            System.out.println("hej");
        }
    }
}