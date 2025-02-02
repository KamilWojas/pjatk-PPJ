public class Rakieta {

    private String nazwa;
    private int wagaPaliwa;

    public Rakieta(String nazwa, int wagaPaliwa){
        this.nazwa = nazwa;
        this.wagaPaliwa = wagaPaliwa;
    }

    public void zatankuj(){
        Random random = new Random();
        int tankujPaliwo = random.nextInt(40) + 1250;
        this.wagaPaliwa += tankujPaliwo;
        System.out.println("Zatankowano " + tankujPaliwo + " stan paliwa: " + this.wagaPaliwa);

    }


    }
}