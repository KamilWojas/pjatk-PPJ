public class Main {
    public static void main(String[] args) {
        int x = 8;
        {
            int y = 4;
            System.out.print(++y + " " + x + " ");
            x = y * 2;
        }
            int y = 15;
            System.out.print(y + " " + x);
        }
    }


//    Możliwe odpowiedzi:
//        a) 4 8 15 10
//        b) 5 8 15 10
//        c) 5 8 15 8
//        d) 6 8 15 10
//        e) 5 8 15 5