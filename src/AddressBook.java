import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public static ArrayList<ContactPerson> people =new ArrayList<>();
    static Scanner scan =new Scanner(System.in);



    public static void main(String[] args) {
        System.out.println("Welcome to Address book");


        System.out.println("Enter First Name: ");
        String fname=scan.next();
        System.out.println("Enter Last Name: ");
        String lname=scan.next();
        System.out.println("Enter Address: ");
        String address=scan.next();
        System.out.println("Enter City: ");
        String city=scan.next();
        System.out.println("Enter State: ");
        String state=scan.next();
        System.out.println("Enter Pin Code");
        long zip = scan.nextLong();
        System.out.println("Enter Phone Number");
        long phonenumber=scan.nextLong();
        ContactPerson person1=new ContactPerson(fname,lname,address,city,state,zip,phonenumber);
        addPerson(person1);
        printContact();


    }
    public static void addPerson(ContactPerson contact){
        people.add(contact);
    }
    public static void printContact() {
        for (ContactPerson contact : people) {
            System.out.println("Printing contact...");
            System.out.println(contact);
        }
    }




}
