import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public static ArrayList<ContactPerson> people =new ArrayList<>();
    static Scanner scan =new Scanner(System.in);
    static final int ONE=1,TWO=2;


    public static void main(String[] args) {
        int choice=0;
        System.out.println("Welcome to Address book");
        while (choice<6){
            System.out.println("Enter your choice");
            System.out.println("1: Add contact \n2:Print Contact\n3: Edit contact\n4: delete contact");
            choice=scan.nextInt();
            switch (choice){
                case 1:
                    addPerson();
                    break;
                case 2:
                    printContact();
                    break;
                case 3:
                    editContact();
                    break;
                case 4:
                    deleteContact();
                    break;

            }
        }





    }
    public static void addPerson(){
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
       people.add(person1);


    }
    public static void printContact() {
        for (ContactPerson contact : people) {
            System.out.println("Printing contact...");
            System.out.println(contact);

        }
    }
//
    public static void editContact(){
        String fname,lname,city,state,address;
        long zip,phone;
        int id;
        int count;

        for (ContactPerson contact:people){
            System.out.println("ID: #"+people.indexOf(contact)+":"+contact);
        }
        System.out.println("Enter ID of cantact to edit");
        id=scan.nextInt();
        System.out.println(people.get(id));
        System.out.println("what do u want to edit..\n\t 1.Address\t2.Phone number");
        int choice = scan.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter Address");
                address=scan.next();
                people.get(id).setAddress(address);
                System.out.println("enter city");
                city=scan.next();
                people.get(id).setCity(city);
                System.out.println("Enter State");
                state = scan.next();
                people.get(id).setState(state);
                System.out.println("Enter Zip");
                zip = scan.nextLong();
                people.get(id).setZip(zip);
                break;
            case 2:
                System.out.println("Enter Mobile number");
                phone = scan.nextLong();
                people.get(id).setPhonenumber(phone);
                break;
            default:
                System.out.println("plz enter valid option");
                editContact();
        }
    }

    public static void deleteContact(){
        if(people.isEmpty()){
            System.out.println("there is nothing to delete");

        }
        else {
            System.out.println("Enter first name to remove contact");
            String fname=scan.next();
            for(int count=0;count<=people.size();count++){
                if(people.get(count).getFname().equals(fname)){
                    people.remove(people.get(count));
                }
            }
        }
    }




}
