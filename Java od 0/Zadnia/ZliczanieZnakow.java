import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ZliczanieZnakow {
    public static void main(String[] args) {
        String sciezkaDoPliku = "sciezka_do_twojego_pliku.txt";

        Map<Character, Integer> mapaZnakow = new HashMap<>();

        try (FileInputStream fileInputStream = new FileInputStream(sciezkaDoPliku)) {
            int odczytanyBajt;
            while ((odczytanyBajt = fileInputStream.read()) != -1) {
                char znak = (char) odczytanyBajt;
                mapaZnakow.put(znak, mapaZnakow.getOrDefault(znak, 0) + 1);
            }
    }