package chapterSeven;

import java.util.Scanner;

public class SemicolonStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the customer´s name");
        String name = scanner.nextLine();
        System.out.println("What did the user buy");
        String Item = scanner.nextLine();
        System.out.println("How many pieces");
        int pieces = scanner.nextInt();
        System.out.println("How much per unit");
        int price = scanner.nextInt();
        System.out.println("Add more Items?");
        String choice = scanner.nextLine();

        do {
            System.out.println("What did the user buy");
             Item = scanner.nextLine();
            System.out.println("How many pieces");
             pieces = scanner.nextInt();
            System.out.println("How much per unit");
             price = scanner.nextInt();
            System.out.println("Add more Items?");
             choice = scanner.nextLine();
        }
        while (choice == "yes"|| choice == "Yes");
    }
}
