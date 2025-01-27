public class Task5 {

    public static void main(String[] args) {

        int[] arr = { 0b11111111, 0401, 514, 0x203 };

        FileOutputStream fos = new FileOutputStream("out.bin");
        for (int i = arr.length - 1; i >= 0; i--) {
            fos.write(arr[i]);
        }
        fos.close();

        System.out.println(260 % 256);

        FileInputStream fis = new FileInputStream("out.bin");

        int tmp;
    }
}