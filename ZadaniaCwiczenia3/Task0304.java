package ZadaniaCwiczenia3;
public class Task0304 {

    public static void main(String[] args) {

    System.out.println("Literały logiczne");
    boolean prawda = true;
    boolean fałsz = false;
    System.out.println("prawda");
    System.out.println("fałsz");

    System.out.println("literały tej samej liczby całkowitej przedstawionej w postaci dziesiętnej, oktalnej, heksadecymalnej i binarnej");
    int liczbaDziesietna = 42;
    int liczbaOktalna = 052;
    int liczbaHeksydecymana = 0x2A;
    int liczbaBinarna = 0b101010;
    System.out.println("Dziesiętna: " + liczbaDziesietna);
    System.out.println("Oktalna: " + liczbaOktalna);
    System.out.println("Heksadecymalna: " + liczbaHeksydecymana);
    System.out.println("Binarna: " + liczbaBinarna);

    System.out.println("Literały liczb rzeczywistych");
    double liczbaRzeczywsta = 1.99;
    float liczbaFloat = 1.99F;
    System.out.println("double: " + liczbaRzeczywsta);
    System.out.println("Float: " + liczbaFloat);

    System.out.println("Literały znakowe");
    char znak = 'A';
    String literałUtf = "\u0052";
    System.out.println("char: " + znak);
    System.out.println("UTF16: " + literałUtf);




    }

}


