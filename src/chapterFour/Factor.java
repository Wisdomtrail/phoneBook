package chapterFour;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number");
            int num = input.nextInt();

            int i = 1;
            while (i < num) {
                int factor = num / i;

                System.out.println(factor);
                i++;


            }


    }

}
