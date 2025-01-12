public class Dog {

   private String name = "Ares";
   private int numberOfLegs = 4;
   private boolean hasTail = true;

   Head head;
   Leg leg;
   
   public Dog (String imieKonkretnegoPsa, int liczbaLapKonkretnegoPsa, boolean czyKonkretnyPiesMaOgon){
       this.name = imieKonkretnegoPsa;
       this.numberOfLegs = liczbaLapKonkretnegoPsa;
       this.hasTail = czyKonkretnyPiesMaOgon;
   }
   
   public String getName(){
       return getName();
   }

    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    public boolean getIsHasTail() {
        return this.hasTail;
    }
    void bark(){
        System.out.println(name + " szczeka" + " " + "hau! hau!");
    }
    void eat(){
        System.out.println(name + " je" + " " + "mlask mlask...");
    }
}