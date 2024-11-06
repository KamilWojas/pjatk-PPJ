package ZadaniaCwiczenia7;

public class Task0706 {

    public static void main(String[] args) {
            int[] tab = {1, 2, 3, 4, 4, 3, 2, 1};
            System.out.println(isPalindrom(tab));
        }

        public static boolean isPalindrom(int[] arr) {
            for (int i = 0; i < arr.length / 2; i++) {
                if (arr[i] != arr[arr.length - 1 - i]) {
                    return false;
                }
            }
            return true;
        }
    }

        /*int i = 0;
        while (i < tab.length/2 && tab[i] == tab[tab.length-1-i]){
            i++;

                }
        System.out.println(i >= tab.length/2);*/



