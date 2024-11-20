
public class Task01 {
    public static void main(String[] args) {

    }

    int K = 987654321;
    String s = "";
        while(K !=0)

    {
        int cyfra = K % 10; // Pobiera ostatnią cyfrę liczby
        s = s + cyfra;      // Dodaje cyfrę do łańcucha
        K = K / 10;         // Usuwa ostatnią cyfrę z liczby
    }
}

