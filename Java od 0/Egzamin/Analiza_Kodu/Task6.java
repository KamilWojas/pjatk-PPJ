public class Task6 {
    public static void main(String[] args) {
        int a = 2;
        {
            int b = 6;
            System.out.print(b + " " + (++a) + " ");
            a += b;
        }
        int b = 9;
        System.out.print(b + " " + a);
    }
}

//    Możliwe odpowiedzi:
//        a) 6 2 9 8
//        b) 6 3 9 9
//        c) 6 3 9 8
//        d) 6 3 9 10
//        e) 7 3 9 8

