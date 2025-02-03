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
        while ((value = fis.read()) != -1) {
            System.out.print(value);
        }
        fis.close();
    }
}

//Co wyświetli powyższy kod:
//          a) 633255
//          b) 637255
//          c) 255637
//          d) 255733
//          e) 637325
//          f) 736255
//          g) 733255
//          h) 637523