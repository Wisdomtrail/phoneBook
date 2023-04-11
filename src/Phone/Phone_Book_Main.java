package Phone;

import javax.swing.*;

public class Phone_Book_Main {
    private static final PhoneBook phone = new PhoneBook();

    public static void main(String[] args) {
        mainMenu();
    }

    private static void mainMenu() {
        String MainMenu = """
                1.Create contact
                2.View contact
                3.Edit contact
                4.Delete contact
                5.Number of contact
                6.Exit PhoneBook""";
        String userInput = sout(MainMenu);
        switch (userInput) {
            case "1":
                CreateContact();
            case "2":
                viewContact();
            case "3":
                EditContact();
            case "4":
                deleteContact();
            case "5":
                contactList();
            case "6":
                exitApp();
            default:
                mainMenu();
        }
    }

    private static void CreateContact() {
        try {
            String contactName = sout("enter contact Name");
            Long phoneNumber = Long.valueOf(sout("Enter PhoneNumber"));
            phone.addContact(contactName, String.valueOf(phoneNumber));
            display("Successfully created Contact");
        }catch (NumberFormatException e){display("Wrong Input");}
        mainMenu();
    }

    private static void viewContact() {
        try {
            String contactID = (sout("Enter Contact Name"));
            display(phone.Find_contacts(contactID).toString());
        } catch (NullPointerException e) {
            display("Contact Not Found");
        }
        mainMenu();
    }


    private static void EditContact() {
        try {
            String contactName = (sout("Enter contact Name"));
            phone.Find_contacts(contactName);
            int Response = Integer.parseInt(sout("""
                    1.Edit Name ?
                    2.Edit Phone ?"""));
            if (Response == 1) {
                String name = sout("Contact Name");
                phone.editName(contactName,name);
                display("Name Edited Successfully");
            } else if (Response == 2) {
                String phoneNumber = sout("Enter Contact Phone");
                phone.EditPhoneNumber(contactName,phoneNumber);
                display("Phone Number Edited ");
            } else EditContact();

        } catch (IllegalArgumentException e) {
            display("Contact Not found");
        }
        mainMenu();
    }
    private static void deleteContact() {
        try {
            String contactName = (sout("enter Contact Name"));
            phone.deleteContact(contactName);

            display("Successfully Deleted");
        } catch (IndexOutOfBoundsException e) {
            display("Contact Not Found");
        }
        mainMenu();
    }

    private static void contactList() {
        int list = phone.Contact_List();
        display(String.valueOf(list));
        mainMenu();
    }

    private static void exitApp() {
        display("Thank YOU");
        System.exit(1);
    }

    private static String sout(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }

    private static void display(String prompt) {
        JOptionPane.showMessageDialog(null, prompt);
    }
}
