public class Task01 {
    public static void main(String[] args) {

        int litBin = 165;
        int litOct = 165;
        int litHex = 165;

        System.out.println("Literał w systemie binarnym -> " + litBin + " to 10100101 ");
        System.out.println("Literał w systemie ósemkowym -> " + litOct + " to 10100101 ");
        System.out.println("Literał w systemie szesnastkowy -> " + litHex + " to 10100101 ");

        litBin = 0b10100101;
        System.out.println(litBin);
        litOct = 0245;
        System.out.println(litOct);
        litHex = 0xA5;
        System.out.println(litHex);


    }
}
