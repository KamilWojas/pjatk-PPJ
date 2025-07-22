//Cel zadania
//Zadeklarować zmienne typu int z nazwami, które łamią lub nie łamią zasad języka Java.
//Jeśli nazwa zmiennej jest nieprawidłowa, musimy ją zakomentować (czyli oznaczyć jako komentarz //).


public class ZmienneTest {
    public static void main(String[] args) {

        int a123 = 5; //1. Pierwszy znak to litera, kolejne to cyfry
        
        // Pierwszy znak to cyfra
        // int 1abc = 10;

        // Pierwszy znak to znak specjalny @
        // int @nazwa = 15;

        // Nazwa zmiennej to "main" (słowo specjalne)
        // int main = 20;

        // Zmienna o nazwie "null"
        // int null = 30;

        // poprawna zmienna z literami ułożonymi w słowo "null", ale nie dokładnie "null"
        int n_ull = 99;

        int nazwa123 = 55; 
        
        System.out.println("Działa! Poprawne zmienne się kompilują."); 
    }
}                 