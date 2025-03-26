import java.util.HashSet;
import java.util.Set;

public class DetektorDuplikatow {
    public static void main(String[] args) {

        boolean duplikat = czyZawieraDuplikaty(tablica);

        if (duplikat) {
            System.out.println("Tablica zawiera duplikaty.");
        } else {
            System.out.println("Tablica nie zawiera duplikatów.");
        }
    }