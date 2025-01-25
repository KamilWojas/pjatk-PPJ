public class Task4 {

    public static void main(String[] args) {
        throws IOException{

            int[] arr = {0b11111111, 0401, 514, 0x203};

            FileOutputSream fos = new FileOutputStream("out.bin");
            for (int i = args.length - 1; i >=0; i--){
             fos.write(arr[i]);
            }

            fos.close();

            FileInputStram fis = new FileInputStream("out.bin");
            int = tmp;
            while ((tmp = fis.read()) != -1){
                
            }
        }
    }
}