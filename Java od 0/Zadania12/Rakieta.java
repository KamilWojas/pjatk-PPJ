public class Rakieta {

    String nazwa;
    int wagaPaliwa;

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

        try {
            Rakieta rakieta = new Rakieta("Apollo 13", 999);
            rakieta.zatankuj();
            rakieta.start();
        }catch (Exception e){
            System.out.println(e.getMessage());
            
        }
    }
}