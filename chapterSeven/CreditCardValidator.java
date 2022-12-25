package chapterSeven;

import java.util.Scanner;

public class CreditCardValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, Kindly Enter Card details to verify");
        String num = scanner.nextLine();
        char[] array = num.toCharArray();
        int length = num.length();

        int first = 0;
        int second = 0;
        int ans1;
        int ans2 = 0;
        int answer;
        System.out.println("**************************************");
        if (length >= 13 && length <= 16) {
            if (((array[0]) - 48) == 4) {
                System.out.println("**Credit Card Type: Visa card");
            } else if (((array[0]) - 48) == 5) {
                System.out.println("**Credit Card Type: MasterCard");
            } else if (((array[0]) - 48) == 37) {
                System.out.println("**Credit Card Type: American Express Card");
            } else if (((array[0]) - 48) == 6) {
                System.out.println("**Credit Card Type: Discover Card");
            } else
                System.out.println("**Credit Card Type: Invalid Card");
            System.out.printf("**Credit Card Number: %s%n", num);
            System.out.printf("**Credit Card Digit Length: %s%n", length);
            for (int i = 0; i < length; i += 2) {
                if (((array[i] - 48) * 2) > 9) {
                    first = first + ((array[i] - 48) * 2 % 10) + 1;
                }
                if (((array[i] - 48) * 2) < 9) {
                    second += (array[i] - 48) * 2;
                }
            }

            for (int i = 1; i < length; i += 2) {
                ans2 += (array[i] - 48);
            }
            ans1 = first + second;
            answer = ans1 + ans2;

            if (answer % 10 == 0) {
                System.out.println("**Credit Card validity Status: Valid");
            } else System.out.println("**Credit Card validity Status: Invalid");
            System.out.println("**************************************");
        }
        else System.out.println("Try Again");
    }
}
