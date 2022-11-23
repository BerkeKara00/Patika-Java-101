package Metotlar_Pratikleri;

import java.util.Scanner;

public class Palindrome {

    static boolean isPalindrome(int number) {

        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;

        }

        if (number == reverseNumber) {

            System.out.println(number + " palindrome bir sayıdır .");
            return true;
        } else {
            System.out.println(number + " palindrome bir sayı değildir.");
            return false;
        }

    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(1661));

    }

}
