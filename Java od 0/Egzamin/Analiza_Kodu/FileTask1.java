class FileTask1 {
    public static void main(String[] args) throws IOException {
        int[] values = { 0b10101010, 0123, 0x4F, 200 };

        FileOutputStream fos = new FileOutputStream("task1.bin");
        for (int i = values.length - 1; i >= 0; i--) {
            fos.write(values[i]);
        }
        fos.close();

        FileInputStream fis = new FileInputStream("task1.bin");
        int output;
        while ((output = fis.read()) != -1) {
            System.out.print(output);
        }
            fis.close();
    }
}

//    Możliwe odpowiedzi:
//        a) 2008379111
//        b) 2008739111
//        c) 9111873200
//        d) 9111200873
//        e) 873200911
//        f) 120087391
//        g) 837911200
//        h) 873911120