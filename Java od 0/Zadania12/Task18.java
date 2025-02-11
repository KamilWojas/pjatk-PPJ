import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Task18 implements Serializable {
    private static final long serialVersionUID = 1L;
    private String imie;
    private static List<Osoba> ekstensja = new ArrayList<>();

    public Osoba(String imie) {
        this.imie = imie;
        ekstensja.add(this);
    }

    public static void zapiszEkstensje(String plik) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(plik));
        out.writeObject(ekstensja);
        out.close();
    }
