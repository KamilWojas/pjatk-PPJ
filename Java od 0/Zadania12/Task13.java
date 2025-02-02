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

    public void start() throws Exception{
        System.out.println("Rozpoczynam metą startową ");
        if (this.wagaPaliwa < 1000){
            throw new Exception("Start niemożliwy - za mało paliwa");
        }

        System.out.println("Start rakiety " + this.nazwa + " zakonczony powodzeniem");
    }

    public static void main(String[] args) {

    }
}