package chapterFour;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your AGE: ");
          int age = input.nextInt();

          if (age < 20)
              System.out.println("you are too young try again later");
          else if (age >= 20)
              System.out.println("you try");

    }
}
