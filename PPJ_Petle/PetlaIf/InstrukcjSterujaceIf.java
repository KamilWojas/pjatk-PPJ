package PetlaIf;

public class InstrukcjSterujaceIf {

    public static void main(String[] args) {

        int age = 18;

        if (age >= 18) {
            System.out.println("Możesz mieć prawko ");
        } else if (age >= 16 && age < 18) {    //17 jest mniejsze większe bądz równe 17, ale jest mniejsze niż 18
            //sprawdza czy masz więcej niż 18 czy mniej
            System.out.println("Ok, ale tylko z rodzicem ");   //Dlatego wchodzimy w ten fragment wywołania
        } else {
            System.out.println("Nie możesz miec prawka ");
        }


    }
}
