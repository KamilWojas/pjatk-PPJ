public class SystemyLiczbowe {
    public static void main(String[] args){
        int liczba = 13;

        //Konwersja na różne systemy liczbowe
        System.out.println("Liczba dziesiętna : " + liczba);
        System.out.println("Binarne : " + Integer.toBinaryString(liczba));
        System.out.println("Ósemkowy : " + Integer.toOctalString(liczba));
        System.out.println("Szesnastkowy : " + Integer.toHexString(liczba));

        // Dodawanie liczb binarnych
        int liczba1 = Integer.parseInt("1011", 2); // Konwersja z binarnego na dziesiętny
        int liczba2 = Integer.parseInt("1101", 2); // Konwersja z binarnego na dziesiętny
        int suma = liczba1 + liczba2;
        System.out.println("Suma binarna: " + Integer.toBinaryString(suma) + " (dziesiętnie: " + suma + ")");
    }
}