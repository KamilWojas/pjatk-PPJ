public class Main {
    public static void main(String[] args) {

        Student studentPierwszy = new Student();
        studentPierwszy.imie = "Grzegorz";
        studentPierwszy.nazwisko = " Brzeczyszczykiewicz";

        studentPierwszy.rokUrodzenia = 1999;

        int zmienna =  studentPierwszy.zwrocWiek();

        Osoba osobaPierwsza = new Osoba("Jan", "Zajac", 1975, 1975 );


        Osoba osoba2 = new Osoba("Patryk", "Kowalski",
                1989, 1988);
    }