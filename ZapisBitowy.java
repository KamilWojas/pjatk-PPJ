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
            fis.close();

            FileOutputStream fos = new FileOutputStream(sciezkaWyjsciowa);
            fos.write(liczba);
            fos.close();

            long wielkoscPlikuWejsciowego = Files.size(Paths.get(sciezkaWejsciowa));
            long wielkoscPlikuWyjsciowego = Files.size(Paths.get(sciezkaWyjsciowa));

            System.out.println("Wielkość pliku wejściowego: " + wielkoscPlikuWejsciowego + " bajtów");
            System.out.println("Wielkość pliku wyjściowego: " + wielkoscPlikuWyjsciowego + " bajtów");

        } catch (IOException e) {
            System.err.println("Błąd podczas odczytu lub zapisu pliku: " + e.getMessage());
        }
    }
}

