public class Main {
    public static void main(String[] args) {

        Student studentPierwszy = new Student();
        studentPierwszy.imie = "Grzegorz";
        studentPierwszy.nazwisko = " Brzeczyszczykiewicz";

        // System.out.println(studentPierwszy.imie);

        studentPierwszy.rokUrodzenia = 1999;
        //   System.out.println(studentPierwszy.zwrocWiek());
        //    studentPierwszy.obliczwiek();

        int zmienna =  studentPierwszy.zwrocWiek();

        //  System.out.println(zmienna);

        Osoba osobaPierwsza = new Osoba("Jan", "Zajac", 1975 );
//        osobaPierwsza.imie = "Jan";
//        osobaPierwsza.nazwisko = "Zając";
//        osobaPierwsza.rokUrodzenia = 1975;
//        osobaPierwsza.rokSmierci = 2022;

        Osoba osoba2 = new Osoba("Patryk", "Kowalski", 1989, 2024);

        System.out.println(studentPierwszy);
        System.out.println(osobaPierwsza);
        System.out.println(osoba2.getImie());

        System.out.println(Osoba.liczbaOsobWsystemie);
        

    }
}