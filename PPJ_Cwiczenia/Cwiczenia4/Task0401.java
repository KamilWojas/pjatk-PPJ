package ZadaniaCwiczenia4;

public class Task0401 {

    public static void main (String[] args){

        int eSka = 23878;
        int hexa = 0x5D46;
        char eSkaChar = 's';

        System.out.println("Eska: " + eSkaChar + eSka);
        System.out.println("Eska w zapisie hexa: " + eSkaChar + ""+ hexa);

        int dwójkowy = 0b0101_1101_0100_0110;
        System.out.println("Eska w zapisie dziesiętnym " + eSkaChar + + dwójkowy + " i dwójkowym " + "0101_1101_0100_0110" );

        String binarnaLiczba = "0101";
        String binarnaLiczba2 = "1101";
        String binarnaLiczba3 = "0100";
        String binarnaLiczna4 = "0110";
        int hexa1 = 5;
        char hexa2 = 'D';
        int hexa3 = 4;
        int hexa4 = 6;
        System.out.println("Hexa na binarny: " + hexa1 + "="+ binarnaLiczba + " " +
                hexa2 + "=" + binarnaLiczba2 + " " + hexa3 + "=" + binarnaLiczba3 + " " + hexa4 + "=" + binarnaLiczna4);

    }
}
