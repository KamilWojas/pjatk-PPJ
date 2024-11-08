package ZadaniaCwiczenia9;

public class Task0904 {
    public static void main(String[] args) {
        int[] arr = {153, 333, 370, 515, 407, 80};

        for (int number : arr) {
            if (isArmstrong(number)) {
                System.out.println(number + " jest liczbą Armstronga.");
            }
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int numberOfDigits = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }
}
