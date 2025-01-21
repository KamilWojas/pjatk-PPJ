 class Dog extends Mummal{

     private String breed;
     private String name;
     private int dateOfBirth;
     private boolean lineage;

     String[] dogBreeds = {"Mops", "Dalmatyńczyk", "Golden Retriever ", "Labrador",
             "Basenji" };

     public Dog(){

     }

     void bark(){
         System.out.println("How how motherfucker");
     }

     public Dog(String nameOfSpecificDog, int dateOfBirthSpecyficDog,
                boolean havePedigree){
         this.breed = nameOfSpecificDog;
         this.dateOfBirth = dateOfBirthSpecyficDog;
         this.lineage = havePedigree;
     }

     public String getBreed(){
         return this.breed;
     }
     public int getDateOfBirth(){
         return this.dateOfBirth;
     }

     void islineage(){
         if (lineage){
             System.out.println(breed + "Have lineage");
         }else {
             System.out.println(breed + "dont have lineage");
         }
     }
