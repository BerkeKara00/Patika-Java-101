package DigerKonular;

import java.util.Scanner;

public class Palindrome {

    static boolean isPalindrome(String str) {

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) {
                System.out.println(str + " kelimesi palindrome değildir");
                return false;
            }
            i++;
            j--;
        }

        System.out.println(str + " kelimesi palindromedur");
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Palindrome olup olmadığını öğrenmek istediğiniz kelimeyi giriniz : ");
        String str = scanner.nextLine();

        isPalindrome(str);

    }

}
