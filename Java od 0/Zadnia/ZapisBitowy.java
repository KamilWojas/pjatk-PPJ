import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ZapisBitowy {
    public static void main(String[] args) {
        String sciezkaWejsciowa = "sciezka_do_pliku_wejsciowego.txt";
        String sciezkaWyjsciowa = "sciezka_do_pliku_wyjsciowego.bin";

        try {
            FileInputStream fis = new FileInputStream(sciezkaWejsciowa);
            int bitIndex = 0;
            int liczba = 0;

            int odczytanyBajt;
            while ((odczytanyBajt = fis.read()) != -1) {
                char znak = (char) odczytanyBajt;
                if (znak == '0' || znak == '1') {
                    int bit = znak - '0';
                    liczba = (liczba << 1) | bit;
                    bitIndex++;
                }
            }