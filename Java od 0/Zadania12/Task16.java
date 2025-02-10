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
        Osoba osoba = new Osoba("Jan");

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("osoba.dat"));
        out.writeObject(osoba);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("osoba.dat"));
        Osoba nowaOsoba = (Osoba) in.readObject();
        in.close();