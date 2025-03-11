import java.util.ArrayList;
import java.util.Scanner;


class Zadanie{
    private String opis;
    private String priorytet;
    private boolean ukonczone;

    public Zadanie(String opis, String priorytet){
        this.opis = opis;
        this.priorytet = priorytet;
        this.ukonczone = false;
    }

    public void oznaczJakoUkonczone() {
        this.ukonczone = true;
    }

    public String toString() {
        return opis + " (" + priorytet + ") - " + (ukonczone ? " Ukończone" : " Nieukończone");
    }
}

public class Main {
    public static void main(String[] args) {