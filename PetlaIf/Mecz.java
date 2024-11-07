package PetlaIf;

public class Mecz {
    public static void main(String[] args) {

        int Barca = 1;
        int Real = 0;

       /* if (Barca > Real){
            System.out.println("Barca wygra mecze");
        }else if (Barca <= Real){
            System.out.println("Barca nie wygra meczu");
        }if (Barca < Real){
            System.out.println("Real wygra mecz");
        }*/

        boolean game = Barca > Real;
        boolean przegra = Barca <= Real;

        if (game){
            System.out.println("Barca wygra mecz");
        }else if (przegra){
            System.out.println("Barca nie wygra meczu");
        }
    }
}
