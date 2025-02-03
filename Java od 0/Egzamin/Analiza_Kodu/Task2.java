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

//Odwpowiedzi:
//        a) 20012270156
//        b) 2012270156
//        c) 1561270200
//        d) 1561227200
//        e) 201227015
//        f) 12720156
//        g) 127020015
//        h) 156200127