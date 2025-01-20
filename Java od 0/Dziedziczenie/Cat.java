public class Cat extends Mammal{

    String color;
    boolean isIndoor;
    String name;

    public Cat(String colorOfCat, boolean isCatIndoor){
        this.color = colorOfCat;
        this.isIndoor = isCatIndoor;
    }
    
    void meow(){
        System.out.println("Miau!");
    }