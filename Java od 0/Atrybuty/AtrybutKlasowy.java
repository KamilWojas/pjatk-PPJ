public class AtrybutKlasowy {
    public static int liczbaKol = 4; //Atrybut klasowy

    private String marka; //Atrybut instancji

    public AtrybutKlasowy(String marka){
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }
}

public class Main{
    public static void main(String[] args) {
        AtrybutKlasowy auto1 = new AtrybutKlasowy("Toyota");
        AtrybutKlasowy auto2 = new AtrybutKlasowy("Honda");

    }
}