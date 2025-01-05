public class DodawanieHexOctal {
    public static void main(String[] args){

        //Liczby w różnych systemach
        String hexLiczba = "1F" //Szesnastkowy
        String octLiczba = "23" //Ósemkowy 
        
        //Konwersja na dzięstny system
        int dziesietnyHex = Integer.parseInt(hexLiczba, 16); //Hex -> Dziesiętny 
        int dziesietnyOct = Integer.parseInt(octLiczba, 8); //Oct -> Dziesiętny 
        
        //Dodawanie
        int sumDziesietna = dziesietnyHex + dziesietnyOct;
        
        //Konwersja wyniku z powrotem na różne systemy
        String wynikHex = Integer.toHexString(sumDziesietna).toUpperCase(); //Dziesiętny -> Hex
        
    }
}