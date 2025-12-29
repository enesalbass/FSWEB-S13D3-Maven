package org.example;

public class Main {

    // Palindrom sayıyı kontrol eden metod
    public static boolean isPalindrome(int number) {
        int original = Math.abs(number);
        int reversed = 0;
        int temp = original;

        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return original == reversed;
    }

    // Mükemmel sayı kontrolü
    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    // Sayıları kelimelere çevirme
    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        if (number == 0) {
            return "Zero";
        }

        String[] digitWords = {
                "Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"
        };

        StringBuilder result = new StringBuilder();
        int temp = number;

        // Basamakları ters çevirmeden önce basamak sayısını hesaplayacağız
        int reversed = 0;
        int digitCount = 0;

        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
            digitCount++;
        }

        // reversed sayısını yazdırırken basamak sayısını koruyacağız
        for (int i = 0; i < digitCount; i++) {
            int digit = reversed % 10;
            result.append(digitWords[digit]).append(" ");
            reversed /= 10;
        }

        return result.toString().trim();
    }
}