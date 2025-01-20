 class Bird extends Animal{

     String species;
     boolean canFly;

     public Bird(String speciesOfBird, boolean birdCanFly) {
         this.species = speciesOfBird;
         this.canFly = birdCanFly;
     }

     void fly(){
         if (canFly){
             System.out.println(species + " Potrafi latac");
         }else {
             System.out.println(species + "Nie potrafi latać");
         }
     }
     void chrip(){
         System.out.println("Ćwir ćwir");
     }
 }
