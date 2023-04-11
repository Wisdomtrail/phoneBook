package Phone;
import java.util.ArrayList;
import java.util.Objects;

public class PhoneBook {

    ArrayList<Contact> contacts = new ArrayList<>();

    private String Name;
    private String  phoneNumber;

    public void addContact(String name, String phoneNumber){
        this.Name = name;
        this.phoneNumber = phoneNumber;
        Contact newContact = new Contact(name, phoneNumber);
        contacts.add(newContact);

    }

    public Contact Find_contacts(String contactName) {
            for (Contact contact : contacts) {
                if ((contact.getContactName().contains(contactName))) {
                    return contact;
                }
            }
      return null;
    }

    public void deleteContact(String Name){
        int count = 0;
        for (Contact contact: contacts){
            if (Objects.equals(Name, contact.getContactName())){
               count += contacts.lastIndexOf(contact);
            }
        }
        contacts.remove(count);
    }
    public int Contact_List(){
        return contacts.size();
    }

    public void editName(String Name, String nameEdit) {
        Find_contacts(Name);
        deleteContact(Name);
        addContact(nameEdit, phoneNumber);
    }

    public void EditPhoneNumber(String name, String phoneNumber){
        Find_contacts(name);
        deleteContact(name);

        addContact(Name,phoneNumber);
    }

}
