import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class OdczytPliku {
    public static void main(String[] args) {

        int licznikLinii = 0;
        int licznikSlow = 0;
        int licznikZnakow = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("dane.txt"))) {
            String linia;
            while ((linia = reader.readLine()) != null) {
                licznikLinii++;
                licznikZnakow += linia.length();
                licznikSlow += linia.trim().isEmpty() ? 0 : linia.trim().split("\\s+").length;
            }
        } catch (IOException e) {
            System.out.println("Błąd podczas odczytu pliku: " + e.getMessage());
            return;
        }