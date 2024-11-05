package ZadaniaCwiczenia4;

public class Task0406 {
    public static void main(String[] args){

        System.out.println('a' + 2 );
        System.out.println('a' + '2');
        System.out.println((char)('a' + 2));
        System.out.println("ppj" + 'a' + "2");
        System.out.println("ppj" + 'a' + '\t' + '2');
        System.out.println('a' + '2' + "ppj");
    }
}


//dodajemy znak char i int do siebie. Char w kodzie ascii to 97. 97+2=99
//dodajemy dwa znaki char. a==97 2==50. Więc daje nam to 149
//Wykonujemy działania od prawej więc wynik daje nam 99, a następnie przekształcany jest na char = c
//dodajem wszystkie znaki jako string
//\t to jest spacja w utf16, string dodajemy do a więc zachodzi konkatencja i daje nam to ppja 2
//a i 2 jako znaki char w kodzie ascii daje nam 147 i dodajemy do tego ciąg znaków String ppj