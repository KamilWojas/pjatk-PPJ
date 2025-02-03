class Task1 {
    public static void main(String[] args) throws IOException {

        int[] numbers = { 0b10101010, 075, 0x3F, 255 };

        FileOutputStream fos = new FileOutputStream("example1.bin");
        for (int i = numbers.length - 1; i >= 0; i--) {
            fos.write(numbers[i]);
        }
        fos.close();

        FileInputStream fis = new FileInputStream("example1.bin");
        int value;



    }