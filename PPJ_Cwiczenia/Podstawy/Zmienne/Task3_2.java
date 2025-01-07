public class Task3_2 {
    public static void main(String[] args){

        byte najmniejszaWartosc = -128;
        byte najwiekszaWartosc = 127;
        System.out.println("Najmniejsza wartość byte -> " + najmniejszaWartosc + "\n" + "Największa wartość byte-> "
                + najwiekszaWartosc);

        short min = -32768;
        short max = 32767;
        System.out.println("Najmniejsza wartość short -> " + min + "\n" + "Największa wartość short -> "
                + max);

        int minInt = -2147483646;
        int maxInt = 2147483647;
        System.out.println("Min int to -> " + minInt + "\n" + "Max int to -> " + maxInt);

        long minLong = -2147483648l;
        long maxLong = 2147483647L;
        System.out.println("Min Long to -> " + minLong + "\n" + "Max Long to -> " + maxLong);

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

        double zmiennaDouble = 3.14;

        //Przyrówanienie dwóch takich samych wartości 
        System.out.println(minFloat == minFloat);

        //Można przyrównać = false
        System.out.println(minLong == minInt);

    }
}