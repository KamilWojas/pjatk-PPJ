public class Task3_1 {
    
    public static void main(String[] args){

        //Typy liczb całkowitych
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
        long maxLong = 2147483647L;
        System.out.println("Min Long to -> " + minLong + "\n" + "Max Long to -> " + maxLong);

        //Typy zmiennoprzecinkowe
        float minFloat = 3.14f;
        float maxFloat = 3.14159265359f;
        System.out.println("Min float to -> " + minFloat + "\n" + "Max float -> " + maxFloat);

        //Typy logincze 
        boolean prawda = true;
        boolean falsz = false;
        System.out.println("Tak -> " + prawda + "\n" + "Nie -> " + falsz );
        
        //Typ znaków
        char znak = 'J';
        System.out.println("Znak -> " + znak);


        
    }
    
    
}