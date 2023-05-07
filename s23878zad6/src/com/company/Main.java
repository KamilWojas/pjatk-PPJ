package com.company;

class s23878zad6 {

    int[] zad2arr = new int[10];

    public void zad1() {
        int[] arr = new int[10];

    }

    public void zad2() {

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.round(Math.random()));

        }

        zad2arr = arr;

    }

    public void zad3() {
        int ileJestZer = 0, ileJestJedynek = 0;
        for (int i = 0; i < zad2arr.length; i++) {
            switch (zad2arr[i]) {
                case 0:
                    ileJestZer++;
                    break;
                case 1:
                    ileJestJedynek++;
                    break;
            }
        }
        System.out.println("Zer jest " + ileJestZer + ", a jedynek jest" + ileJestJedynek);
    }

    public void zad7() {
        String[] slowa = {"Ala", "kota", "ma", "ma", "a", "kot", "Ale"};
        int[] kolejnosc = {0, 2, 1, 4, 5, 3, 6};

        System.out.println();
        for (int i : kolejnosc) {
            System.out.print(slowa[i] + " ");
        }
        System.out.println();

    }

    public void zad5() {
        /*
        Tablica nie zostala zainicjowana więc nie ma żadnej wartosci którą ta instrukcja
        mogłaby wypisać.
        */
    }

    public void zad6() {
        /*
        789 - 789 = 0
        789 - 678 = 111
        789 - 567 = 222
        678 - 678 = 0
        678 - 567 = 111
        567 - 567 = 0
        */
    }
}
