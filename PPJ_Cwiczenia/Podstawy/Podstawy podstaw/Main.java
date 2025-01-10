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