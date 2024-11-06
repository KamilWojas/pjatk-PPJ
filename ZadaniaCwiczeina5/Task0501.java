package ZadaniaCwiczeina5;

public class Task0501 {
    public static void main(String[] args) {

        int wrt = 3;
        String res = " ";

        if (wrt <= -5 && wrt <= -10 && wrt <= -5 && wrt <= 0 && wrt <= 5 && wrt <=10)
        res += "A";
        if (wrt >= -3 && wrt <= -8 && wrt <=3 )
        res += "B";
        if (wrt >= -4)
        res += "C";
        System.out.println("Należy do zbioru: "+ res);

    }
}
