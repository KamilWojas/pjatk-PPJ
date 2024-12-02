package PetlaIf;

public class age {
    public static void main(String[] args) {
        int wiek = 15;

        if (wiek >= 16){
            System.out.println("Jesteś pełnoletni");
        }
        else if (wiek >= 16)
        {
                System.out.println("Możesz pracować");
            } else {
                System.out.println("Jesteś w dupie");
            }
        String imie = wiek >= 11 ? "Kamil" : "Kubuś"; //operator trójargumentowy
        System.out.println(imie);

        //to co jest przy znaku zapytania jest wyświetlane w przypadku prawdy
        //po : wstawiamy co ma zwrócić w przypadku fałszu
        }
    }

//w takiej budowie wykonuje się tylko jedna instrukcja