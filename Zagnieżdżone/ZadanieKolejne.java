package Zagnieżdżone;

public class ZadanieKolejne {
    public static void main(String[] args) {

        for (byte b = 0; b < 16; b+=3){

                char c = (char) ((b < 10 )? '0' + b :'A'+ (b-10));

            System.out.println(c);
        }
    }
}
