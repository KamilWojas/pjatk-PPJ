package com.company;

import java.util.Arrays;

public class s23878_set08 {

    public static void main(String[] args) {
    }

    public void task01() {
        int value = 10;
        show(value);
    }

    public static void show(int value) {
        System.out.println("Wartość: " + value);
    }

    public void task02() {
        int wrt = 5;
        System.out.println("Wartość przed modyfikacją: " + wrt);
        modifyValue(wrt);
        System.out.println("Wartość po modyfikacji: " + wrt);
    }

    public static void modifyValue(int value) {
        System.out.println("Wartość dostarczonej zmiennej: " + value);
        value *= 5;
        System.out.println("Wartość zmodyfikowanej zmiennej: " + value);
    }

    public void task03() {
        char[] characters = {'A', 'l', 'a', ' ', 'm', 'a', ' ', 'k', 'o', 't', 'a'};
        char character = 'a';
        int count = countCharacters(characters, character);
        System.out.println("Liczba wystąpień znaku '" + character + "': " + count);
    }

    public static int countCharacters(char[] array, char character) {
        int count = 0;
        for (char c : array) {
            if (c == character) {
                count++;
            }
        }
        return count;
    }

    public void task04() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        int value = -1;

        int[] result = processArrays(array1, array2, value);
        System.out.println(Arrays.toString(result));
    }

    public static int[] processArrays(int[] array1, int[] array2, int value) {
        if (array1.length != array2.length) {
            return new int[0];
        }

        int length = array1.length;
        int[] result = new int[length];

        if (value < 0) {
            for (int i = 0; i < length; i++) {
                result[i] = array1[i] + array2[i];
            }
        } else if (value > 0) {
            for (int i = 0; i < length; i++) {
                if (i % value != 0) {
                    result[i] = array1[i];
                }
            }
        }

        return result;
    }

    public void task05() {
        int sideLength = 5;
        char startChar = 'x';
        printSquare(sideLength, startChar);
    }

    public static void printSquare(int sideLength, char startChar) {
        char[] chars = {'x', 'i', 'o'};
        int charIndex = 0;

        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                System.out.print(chars[charIndex] + " ");
                charIndex = (charIndex + 1) % chars.length;
            }
            System.out.println();
        }
    }
}

