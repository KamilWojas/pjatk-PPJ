public class TypyProste {
    public static void main(String[] args) {

        //boolean: tylko true/false
        boolean wartoscLogiczna1 = true;
        boolean wartoscLogiczna2 = false;

        //byte: -128 do 127
        byte namniejszyByte = -128;
        byte najwieszkyByte = 127;
        byte binarnyByte = 0b01111111; //127 w binarnym
        byte szesnastkowyByte = 0x7F; //127 w szesnastkowym
        byte osemkowyByte = 0177; //127 w ósemkowym

        //short: -32_768 do 32_767
        short minShort = -32768;
        short maxShort = 32767;
        short hexShort = 0x7FFF; //32767
        short octShort = 0777777; //32767 (ósemkowy)

        //int: -2_147_483_648 do 2_147_483_647
        int minInt = -2147483648;
        int maxInt = 2147483647;
        int hexInt = 0x7FFFFFFF;
        int binInt = 0b01111111111111111111111111111111;

        //long: -2^63 do 2^63-1
        long minLong = -9223372036854775808L; //musimy dodać L
        long maxLong = 9223372036854775807L;
        long hexLong = 0x7FFFFFFFFFFFFFFFL;

        //float – liczby zmiennoprzecinkowe (z f na końcu)
        float minFloat = -3.4e38f;
        float maxFloat = 3.4e38f;

        //double – większy zakres niż float
        double minDouble = -1.7e308;
        double maxDouble = 1.7e308;

        //char – znak Unicode (np. 'A') – przechowuje liczby z przedziału 0–65535
    }
}