/*
Napisz program, który wypisze tabliczkę mnożenia dla liczby 5.
*/

public class Task2 {
    public static void main(String[] args){
        
        int liczba = 5;
        
        for (int i = 1; i <= 10; i++){
            System.out.println(liczba "*" +i+ "=" + (liczba *i));
        }
        
    }
}