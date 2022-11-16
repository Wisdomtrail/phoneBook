package chapterFour;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

     /*   int i = 1;
        while (i <= 12) {

            System.out.printf("%d times %d is %d%n", num, i, num * i);
            i++;*/
        for (int i = num - 1; i >= 1; i--) {
            num = num * i;
        }

        System.out.println("factorial is " + num);
    }

}
