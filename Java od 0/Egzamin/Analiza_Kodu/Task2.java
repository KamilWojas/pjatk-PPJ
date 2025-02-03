class Task2 {
    public static void main(String[] args) throws IOException {
        int[] data = { 0b11001100, 0123, 0x7A, 200 };

        FileOutputStream fos = new FileOutputStream("example2.bin");
        for (int i = data.length - 1; i >= 0; i--) {
            fos.write(data[i]);
        }
        fos.close();

        FileInputStream fis = new FileInputStream("example2.bin");
        int result;
        while ((result = fis.read()) != -1) {
            System.out.print(result);
        }
        fis.close();
    }
}