package chapterThree;
import java.util.Scanner;

public class NativeTest {

public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    Native sunday = new Native();

    System.out.println("enter your name");
    String myName = input.nextLine();

    System.out.println("enter your phoneNumber");
    String myphoneNumber = input.nextLine();

    System.out.println("What is your phoneName");
    String myphoneName = input.nextLine();

    System.out.println("Enter your Email address");
    String Email=input.nextLine();

    sunday.setName(myName);
    System.out.printf("your name is: %s%n", sunday.getName());

    sunday.setPhoneNumber(myphoneNumber);
    System.out.printf("your phonenumber is: %s%n", sunday.getphoneNumber());

    sunday.setPhoneName(myphoneName);
    System.out.printf("you are using: %s%n", sunday.getphoneName());

    sunday.setEmail(Email);
    System.out.printf("your Email address is: %s%n",sunday.getEmail());
    }

}
