class Ekwipunek{
    private String nazwa;

    public Ekwipunek(String nazwa){
        this.nazwa = nazwa;
    }

    public void uzyj(){
        System.out.println("Używasz :" + nazwa);
    }
}

interface Walczy{
    void atakWrecz();
}

interface Strzela{
    void strzela();
}

interface RzucaZaklecia{
    void rzycaZaklecia();
}

abstract class Postac implements Walczy, Strzela, RzucaZaklecia{
    private String imie;
    private Ekwipunek ekwipunek;
    private boolean jestWojownikiem;
    private boolean jestLucznikiem;
    private boolean jastMagiem;

    private Postac(String imie, String ekwipunek, boolean wojownik, boolean lucznik, boolean mag){
        this.imie = imie;
        this.ekwipunek = new Ekwipunek(ekwipunek);
        this.jestWojownikiem = wojownik;
        this.jestLucznikiem = lucznik;
        this.jastMagiem = mag;
    }
    private void rozpocznijWalke(){
        System.out.println(imie + " przygotuj się do walki");
        ekwipunek.uzyj();

        if (jestWojownikiem) {
            atakWręcz();
        }
        if (jestLucznikiem) {
            atakDystansowy();
        }
        if (jestMagiem) {
            rzucZaklecie();
        }
    }

    @Override
    public void atakWręcz() {
        System.out.println(imie + " atakuje mieczem!");
    }

    @Override
    public void atakDystansowy() {
        System.out.println(imie + " strzela z łuku!");
    }

    @Override
    public void rzucZaklecie() {
        System.out.println(imie + " rzuca potężne zaklęcie!");
    }
}

class Wojownik extends Postac{
    public Wojownik(String imie){
        super(imie, "Miecz", true, false, true);
    }
}

class Lucznik extends Postac{
    public Lucznik(String imie){
        super(imie, "Łuk", false, true, false);
    }
}

class Mag extends Postac{
    public Mag(String imie){
        super(imie, "Księga zaklęć", false, false, true);
    }
}

class Elf extends Postac{
    public Elf(String imie){
        super(imie, " Łuk elficki ", false, true, true);
    }
}

public class Main{
    public static void main(String[] args) {
        Postac wojownik = new Wojownik("Thorin");
        Postac lucznik = new Lucznik("Legolas");
        Postac mag = new Mag("Gandalf");
        Postac elf = new Elf("Elrond");

        wojownik.rozpocznijWalke();
        System.out.println();
        lucznik.rozpocznijWalke();
        System.out.println();
        mag.rozpocznijWalke();
        System.out.println();
        elf.rozpocznijWalke();
    }
}


