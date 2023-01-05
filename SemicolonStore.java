package chapterSeven;


import java.util.Objects;
import java.util.Scanner;

 public class SemicolonStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        String choice;
        System.out.println("What is The customer´s name");
        String name = scanner.nextLine();

        int counter = 0;
        String[] arrayItem = new String[10];
        int[] arrayPieces = new int[10];
        int[] itemPrice = new int[10];
        do {

            System.out.println("What Did The User Buy");
            item = scanner.next();
            System.out.println("How Many pieces");
            int pieces = scanner.nextInt();
            System.out.println("How much per unit ");
            int price = scanner.nextInt();
            System.out.println("Add more Items");
            choice = scanner.next();
            arrayItem[counter] = item;
            arrayPieces[counter] = pieces;
            itemPrice[counter] = price;
            counter+=1;

        }
        while (Objects.equals(choice, "yes"));
        System.out.println("""
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA LAGOS
                TEL: 03293828343
                Date: 18-Dec-22 8:48:11 pm
                Cashier: Cashier´s Name
                Customer Name:"""+ name);
        System.out.println("""
                =====================================================
                                ITEM     QTY     PRICE     TOTAL(NGN)
                -----------------------------------------------------""");
        for (int i = 0; i < counter; i++) {
            System.out.printf("                %s     %d       %d       %d%n",
                    arrayItem[i],arrayPieces[i],itemPrice[i], itemPrice[i]*arrayPieces[i]
            );
        }
        System.out.println("----------------------------------------------------");
    }
}