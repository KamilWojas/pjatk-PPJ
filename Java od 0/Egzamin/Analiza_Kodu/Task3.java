public class Task3 {
    public static void main(String[] args) {

        int x = 5;
        {
            int y = 10;
            System.out.print(y++ + " " + x + " ");
            x += y;
        }
        int y = 20;
        System.out.print(y + " " + x);
    }
}

//    Możliwe odpowiedzi:
//        a) 10 5 20 15
//        b) 10 5 20 25
//        c) 11 5 20 15
//        d) 10 5 20 20
//        e) 11 5 20 25