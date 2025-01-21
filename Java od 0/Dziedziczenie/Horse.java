 class Horse extends Animal {

     void stable(){
         String [] stable = {"Koń zbyszek", "Koń Staszek", "Koń Janusz"};
         System.out.println(Arrays.toString(stable));

     }

     @Override
     void sleap() {
         System.out.println("Śpij jak koń");
     }
 }