public class Task1 {

    public static void main(String[] args) {

        String[] test;
        String[] arrayOfString = new String[10];

        String osoba1 = "Jacek";
        String osoba2 = "Kasia";
        String osoba3 = "Darek";
        String osoba4 = "Jan";

        String[] osoby = new String[4];

        System.out.println(osoby.length);
        
        osoby[0] = osoba1;

        System.out.println(osoby[0]);
        System.out.println(osoby[1]);

        osoby[2] = osoba3; //nadpisanie
        System.out.println(osoby[2]);

        int[] arryOfInt = new int[2];
        arryOfInt[0] = 1;
        arryOfInt[3] = 3;
        double[] arrayOfDouble = new double[0];
        arrayOfDouble[22] = 1.5;
        arrayOfDouble[2] = 22.3;
        
    }
}