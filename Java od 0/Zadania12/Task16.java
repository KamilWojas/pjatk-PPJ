import java.io.*;


class Osoba implements Serializable {
    private static final long serialVersionUID = 1L;
    String imie;

    public Osoba(String imie) {
        this.imie = imie;
    }
}

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

    }