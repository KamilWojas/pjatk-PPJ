package ZadaniaCwiczenia9;
public class Task0901 {

    public static void main(String[] args) {

        //char[] znaki = {'J', 'B', 'm'};
       // int[] znaki = {1, 4, 2};
        int indexMin = 0;
        char[] znaki = {'a', 'A', 'c'};



        for (int i = 0; i < znaki.length; i++) {
            if (znaki[i] < znaki[indexMin]) {
                indexMin = i;
            }
        }


        System.out.println("Indeks elementu o najmniejszej wartości: " + indexMin);
    }
}
