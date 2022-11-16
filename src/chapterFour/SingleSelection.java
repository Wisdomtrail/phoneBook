package chapterFour;

import java.util.Scanner;

public class SingleSelection {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = inputCollector.nextInt();
        if(num > 10){
            System.out.println("out of range");
        }
        else {
            if (num % 2 == 0)
                System.out.println("it is a even number");
            else {
                System.out.println("this is odd");
            }
        }
    }
}