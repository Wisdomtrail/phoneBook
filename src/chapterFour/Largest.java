  package chapterFour;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: and enter 0 to quit: ");
        int num = input.nextInt();

        int largest = num;
        int smallest = num;


     do {
         if (num > largest)
             largest = num;
         if (num < smallest)
             smallest = num;
         System.out.print("Enter a number: ");
         num = input.nextInt();

     }
     while (num != 0);
        System.out.printf("the largest is %d and the smallest is %d", largest, smallest);
    }
}