public class BitwiseOperations {
    public static void main(String[] args) {
        int a1 = 0x6D; // a1 = 109 w dziesiętnym
        int a2 = 0x0D; // zzz: a2 = 13 w dziesiętnym
        int a = a1 & a2; // a = 109 & 13 = 13

        int b1 = 0xA;  // b1 = 10 w dziesiętnym
        int b2 = 0xF;  // xxx: b2 = 15 w dziesiętnym
        int b = b1 | b2; // b = 10 | 15 = 15

        int c1 = 11 << 2; // c1 = 11 * 4 = 44
        int c2 = 6;       // yyy: c2 = 6
        int c = c1 ^ c2;  // c = 44 ^ 6 = 42

        System.out.println(a + " " + b + " " + c);
    }
}
