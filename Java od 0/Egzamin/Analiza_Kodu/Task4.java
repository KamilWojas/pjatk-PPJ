public class Task4 {
    public static void main(String[] args) {
        int a = 3;
        {
            int b = 7;
            System.out.print((b++) + " " + a + " ");
            a = b;
        }
            int b = 12;
            System.out.print(b + " " + a);
    }
}

//    Możliwe odpowiedzi:
//        a) 7 3 12 7
//        b) 8 3 12 7
//        c) 7 3 12 8
//        d) 8 3 12 8