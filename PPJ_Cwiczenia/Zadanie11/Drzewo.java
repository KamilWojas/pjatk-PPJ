package Zadanie11;

class Drzewo {
    boolean wiecznieZielone;
    int wysokosc;
    String przekrojDrzewa;

    Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa) {
        this.wiecznieZielone = wiecznieZielone;
        this.wysokosc = wysokosc;
        this.przekrojDrzewa = przekrojDrzewa;
    }

    public String toString() {
        return "Drzewo [wiecznieZielone=" + wiecznieZielone + ", wysokosc=" + wysokosc + ", przekrojDrzewa=" + przekrojDrzewa + "]";
    }
}

class DrzewoIglaste extends Drzewo {
    int iloscIgli;
    double dlugoscSzyszki;

    DrzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int iloscIgli, double dlugoscSzyszki) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.iloscIgli = iloscIgli;
        this.dlugoscSzyszki = dlugoscSzyszki;
    }

    public String toString() {
        return super.toString() + ", DrzewoIglaste [iloscIgli=" + iloscIgli + ", dlugoscSzyszki=" + dlugoscSzyszki + "]";
    }
}

class DrzewoLisciaste extends Drzewo {
    String ksztaltLiscia;

    DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, String ksztaltLiscia) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.ksztaltLiscia = ksztaltLiscia;
    }

    public String toString() {
        return super.toString() + ", DrzewoLisciaste [ksztaltLiscia=" + ksztaltLiscia + "]";
    }
}

class DrzewoOwocowe extends DrzewoLisciaste {
    String nazwaOwoca;

    DrzewoOwocowe(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, String ksztaltLiscia, String nazwaOwoca) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa, ksztaltLiscia);
        this.nazwaOwoca = nazwaOwoca;
    }

    public String toString() {
        return super.toString() + ", DrzewoOwocowe [nazwaOwoca=" + nazwaOwoca + "]";
    }
}

class Main {
    public static void main(String[] args) {
        // Tworzenie obiektów drzew
        Drzewo[] las = new Drzewo[3];
        las[0] = new DrzewoIglaste(true, 30, "okrągły", 2000, 5.5);
        las[1] = new DrzewoLisciaste(false, 20, "owalny", "sercowaty");
        las[2] = new DrzewoOwocowe(false, 15, "prostokątny", "owalny", "jabłko");

        // Wyświetlanie informacji o drzewach
        for (Drzewo drzewo : las) {
            System.out.println(drzewo);
        }
    }
}

