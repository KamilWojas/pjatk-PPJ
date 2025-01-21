public class Student {
    String imie;
    String nazwisko;
    int eska;
    int rokUrodzenia;

    public void obliczwiek(){
        System.out.println(2024 - rokUrodzenia);
    }

    public int zwrocWiek(){
        return 2024 - rokUrodzenia;
    }
