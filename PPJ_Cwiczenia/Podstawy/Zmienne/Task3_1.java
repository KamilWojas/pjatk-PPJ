public class Task3_1 {
    
    public static void main(String[] args){
        
        byte najmniejszaWartosc = -128;
        byte najwiekszaWartosc = 127;
        System.out.println("Najmniejsza wartość byte -> " + najmniejszaWartosc + "\n" + "Największa wartość byte -> " 
                + najwiekszaWartosc);

        short min = -32768;
        short max = 32767;
        System.out.println("Najmniejsza wartość short -> " + min + "\n" + "Największa wartość short -> "
                + max);

        int minInt = -2147483646;
        int maxInt = 2147483647;
        System.out.println("Min int to -> " + minInt + "\n" + "Max int to -> " + maxInt);

        long minLong = -2147483648;
        long maxLong = 2147483647;
        System.out.println("Min Long to -> " + minLong + "\n" + "Max Long to -> " + maxLong);
        
    }
    
    
}