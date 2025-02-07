class Task10 {
    private int liczba = 10;

    public int getLiczba() {
        return liczba;
    }
}

class Podklasa extends Task10 {
    public void test() {
        System.out.println("Liczba z klasy nadrzędnej: " + getLiczba());
    }
}

public class Test {

