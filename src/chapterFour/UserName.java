package chapterFour;

import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
            String name = input.nextLine();
            System.out.print("Enter your surname: ");
            String surName = input.nextLine();

            System.out.printf("your user name is %s%s", name, surName);




    }
}
