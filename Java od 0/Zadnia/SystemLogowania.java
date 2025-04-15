import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SystemLogowania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> konta = new HashMap<>();
        konta.put("admin", "1234");
        konta.put("user", "haslo");
        konta.put("goscia", "guest");

        int proby = 0;
        boolean zalogowano = false;